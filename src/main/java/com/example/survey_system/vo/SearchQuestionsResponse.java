package com.example.survey_system.vo;

import java.util.List;

import com.example.survey_system.entity.Questions;

public class SearchQuestionsResponse {

	private String message;

	private List<Questions> questionList;
	
	
	public SearchQuestionsResponse(String message) {
		super();
		this.message = message;
	}

	public SearchQuestionsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchQuestionsResponse(List<Questions> questionList) {
		super();
		this.questionList = questionList;
	}

	public List<Questions> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Questions> questionList) {
		this.questionList = questionList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
