package com.example.survey_system.vo;

public class AddSurveyInfoResponse {

	String message;
	
	private int surveyId;
	
	

	public AddSurveyInfoResponse(String message, int surveyId) {
		super();
		this.message = message;
		this.surveyId = surveyId;
	}

	public AddSurveyInfoResponse(String message) {
		super();
		this.message = message;
	}

	public AddSurveyInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
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
	
	

}
