package com.example.survey_system.vo;

import java.time.LocalDate;


public class AddSurveyInfoRequest {

	private String surveyName;

	private String summary;

	private LocalDate startTime;

	private LocalDate endTime;


	private LocalDate createTime;
	
	public AddSurveyInfoRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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


	public LocalDate getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}


	
	
}
