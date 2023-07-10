package com.example.survey_system.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.survey_system.entity.UserAnswer;
import com.example.survey_system.vo.GetAnswerResponse;
import com.example.survey_system.vo.SearchAllInfoResponse;
import com.example.survey_system.vo.SearchSurveyResponse;


public interface UserAnswerDao extends JpaRepository<UserAnswer, Integer>{

	
	public UserAnswer findAllByQuestionIdAndUserNameAndPhone(int questionId,String userName, String phone);

//	@Transactional
//	@Modifying
//	@Query("SELECT distinct new com.example.survey_system.vo.GetAnswerResponse (u.userName, u.creatTime)"
//			+ "	FROM UserAnswer u")
//
//	    public List<GetAnswerResponse> distinctSearch ();







}
