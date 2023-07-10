package com.example.survey_system.vo;

import java.time.LocalDate;
import java.util.List;

import com.example.survey_system.entity.Survey;

public class SearchSurveyResponse {

	String message;

	private int surveyId;

	private String surveyName;

	private LocalDate startTime;

	private LocalDate endTime;

	private LocalDate createTime;

	private List<SearchSurveyResponse> res;
	
//	add for searchbyId
	private Survey survey;
	
	
	

	public SearchSurveyResponse(String message, Survey survey) {
	super();
	this.message = message;
	this.survey = survey;
}



	public SearchSurveyResponse(String message, List<SearchSurveyResponse> res) {
		super();
		this.message = message;
		this.res = res;
	}
	
	

	public Survey getSurvey() {
		return survey;
	}



	public void setSurvey(Survey survey) {
		this.survey = survey;
	}



	public List<SearchSurveyResponse> getRes() {
		return res;
	}

	public void setRes(List<SearchSurveyResponse> res) {
		this.res = res;
	}



	public SearchSurveyResponse(String message) {
		super();
		this.message = message;
	}

	public SearchSurveyResponse(String surveyName, LocalDate startTime, LocalDate endTime) {
		super();
		this.surveyName = surveyName;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public SearchSurveyResponse(int surveyId, String surveyName, LocalDate startTime, LocalDate endTime, 
			LocalDate createTime) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createTime = createTime;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}


	public LocalDate getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}


}
