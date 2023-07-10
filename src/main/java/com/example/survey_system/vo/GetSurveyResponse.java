package com.example.survey_system.vo;

import java.util.List;

import com.example.survey_system.entity.Survey;

public class GetSurveyResponse {

	private String message;
	
	private List<Survey> surveyList;

	public GetSurveyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetSurveyResponse(String message) {
		super();
		this.message = message;
	}

	
	
	public GetSurveyResponse(List<Survey> surveyList) {
		super();
		this.surveyList = surveyList;
	}

	public List<Survey> getSurveyList() {
		return surveyList;
	}

	public void setSurveyList(List<Survey> surveyList) {
		this.surveyList = surveyList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
