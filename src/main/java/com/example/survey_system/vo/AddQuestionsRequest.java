package com.example.survey_system.vo;

public class AddQuestionsRequest {
	
	private int questionId;

	private String questionName;

	private int type;

	private String options;

	private int surveyId;

	private boolean required;





	public AddQuestionsRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}



	public String getOptions() {
		return options;
	}



	public void setOptions(String options) {
		this.options = options;
	}



	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}


}
