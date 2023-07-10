package com.example.survey_system.vo;

public class DelQuestionsRequest {

	private int surveyId;

	public DelQuestionsRequest(int surveyId) {
		super();
		this.surveyId = surveyId;
	}

	public DelQuestionsRequest() {
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
