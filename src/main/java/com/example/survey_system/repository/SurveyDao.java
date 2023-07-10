package com.example.survey_system.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.survey_system.entity.Survey;
import com.example.survey_system.vo.SearchSurveyResponse;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

@Repository
public interface SurveyDao extends JpaRepository<Survey, Integer> {

//	public Survey findAllBySurveyName(String surveyName);

	@Transactional
	@Modifying
	@Query(value = "update Survey s set s.surveyName = :newName, s.summary = :newSummary,"
			+ " s.startTime = :newStartTime, s.endTime = :newEndTime, s.createTime = :newCreateTime"
			+ " where s.surveyId = :inputSurveyId")
	public int updateSurveyByNumber(
			@Param("newName") String inputName, 
			@Param("newSummary") String inputSummary,
			@Param("newStartTime") LocalDate inputStartTime, 
			@Param("newEndTime") LocalDate inputEndTime, 
			@Param("newCreateTime") LocalDate inputCreateTime,
			@Param("inputSurveyId") int inputSurveyId
			);

	
	
	 @Transactional
	 @Modifying
	 @Query("select new com.example.survey_system.vo.SearchSurveyResponse(s.surveyId,s.surveyName,s.startTime,s.endTime,s.createTime)" +
	           " from Survey s" 
	         + " where (s.surveyName like concat('%', :inputName, '%') or :inputName IS NULL)"
	         + " and (s.startTime >= :inputStartDate or :inputStartDate IS NULL)"
	         + " and (s.endTime <= :inputEndDate or :inputEndDate IS NULL)")

	    public List<SearchSurveyResponse> distinctSearch (
	    		@Param("inputName")String name,
	    		@Param("inputStartDate")LocalDate startTime,
	    		@Param("inputEndDate")LocalDate endTime
	    		);

	 @Transactional
//		delete不用回傳型態 要加transactional 因為有報錯
		public void deleteBySurveyId(int surveyId);
	   
	 
}
