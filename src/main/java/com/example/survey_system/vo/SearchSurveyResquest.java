package com.example.survey_system.vo;

import java.time.LocalDate;


public class SearchSurveyResquest {

	private String surveyName;

	private LocalDate startTime;

	private LocalDate endTime;
	
//	add for searchbyid
	private int surveyId;

	public SearchSurveyResquest() {
		super();
		// TODO Auto-generated constructor stub
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



}
