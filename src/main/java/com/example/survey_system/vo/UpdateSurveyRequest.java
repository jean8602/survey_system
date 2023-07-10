package com.example.survey_system.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UpdateSurveyRequest {

	private int surveyId;

	private String surveyName;

	private String summary;

	private LocalDate startTime;

	private LocalDate endTime;

	//
	private int status;
	//

	private LocalDateTime createTime;

	public UpdateSurveyRequest(int surveyId, String surveyName, String summary, LocalDate startTime, LocalDate endTime,
			int status, LocalDateTime createTime) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.summary = summary;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.createTime = createTime;
	}


	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public UpdateSurveyRequest() {
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

}
