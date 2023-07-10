package com.example.survey_system.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.survey_system.entity.Questions;
import com.example.survey_system.vo.SearchAllInfoResponse;

@Repository
public interface QuestionsDao extends JpaRepository<Questions, Integer> {

	public Questions findByQuestionNameAndSurveyId(String questionName, int surveyId);

	public List<Questions> findBySurveyId(int surveyId);

	@Transactional
	@Modifying
	@Query(value = "update Questions q set q.questionName = :newName, q.type = :newType,"
			+ " q.options = :newOptions, q.surveyId= :newSurveyId, q.isRequired = :newrequired"
			+ " where q.questionId = :questionId")
	public int updateQuestionsByQuestionId(@Param("newName") String inputName, @Param("newType") int inputType,
			@Param("newOptions") String inputOptions, @Param("newSurveyId") int inputSurveyId,
			@Param("newrequired") boolean inputequired, @Param("questionId") int questionId);

//	@Transactional
//	@Modifying
//	@Query(value = "SELECT new com.example.survey_system.vo.SearchAllInfo q.question_id, q.question_name, q.type, q.options, q.required, s.survey_id, s.survey_name, s.summary, s.start_time, s.end_time"
//			+ "	FROM questions_table q" 
//			+ "	RIGHT JOIN survey_table s ON q.survey_id = s.survey_id"
//			+ " WHERE s.survey_id = :surveyId", nativeQuery = true)
//	public List<Questions> searchDataBySurveyId(@Param("surveyId") int surveyId);
	
	@Transactional
	@Modifying
	@Query("SELECT new com.example.survey_system.vo.SearchAllInfoResponse (q.questionId, q.questionName, q.type, q.options, q.isRequired, s.surveyId, s.surveyName, s.summary, s.startTime, s.endTime)"
			+ "	FROM Questions q" 
			+ "	RIGHT JOIN Survey s ON q.surveyId = s.surveyId"
			+ " WHERE s.surveyId = :surveyId")
	public List<SearchAllInfoResponse> searchDataBySurveyId(@Param("surveyId") int surveyId);

	@Transactional
//	delete不用回傳型態 要加transactional 因為有報錯
	public void deleteBySurveyId(int surveyId);

}
