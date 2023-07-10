package com.example.survey_system.vo;

public class DelSurveyRequest {

	
	private int surveyId;
	
	

	public DelSurveyRequest(int surveyId) {
		super();
		this.surveyId = surveyId;
	}

	public DelSurveyRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	
	
}
