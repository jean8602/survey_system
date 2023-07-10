package com.example.survey_system.vo;

import java.util.List;

import com.example.survey_system.entity.UserAnswer;

public class GetAnswerResponse {
	private String message;
	
	private List<UserAnswer> userAnswerList;
	
	

	public GetAnswerResponse(List<UserAnswer> userAnswerList) {
		super();
		this.userAnswerList = userAnswerList;
	}

	public GetAnswerResponse(String message) {
		super();
		this.message = message;
	}

	public GetAnswerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public List<UserAnswer> getUserAnswerList() {
		return userAnswerList;
	}

	public void setUserAnswerList(List<UserAnswer> userAnswerList) {
		this.userAnswerList = userAnswerList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
