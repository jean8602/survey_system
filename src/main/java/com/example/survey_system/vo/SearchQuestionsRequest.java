package com.example.survey_system.vo;

public class SearchQuestionsRequest {

	private int surveyId;

	public SearchQuestionsRequest(int surveyId) {
		super();
		this.surveyId = surveyId;
	}

	public SearchQuestionsRequest() {
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
