package com.example.survey_system.vo;

import java.time.LocalDate;

public class GetAnswerRequest {
	
	private String userName;
	
	private String answer;
	
	private LocalDate creatTime;
	

	public GetAnswerRequest(String userName, String answer, LocalDate creatTime) {
		super();
		this.userName = userName;
		this.answer = answer;
		this.creatTime = creatTime;
	}

	public GetAnswerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public LocalDate getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(LocalDate creatTime) {
		this.creatTime = creatTime;
	}
	
	

}
