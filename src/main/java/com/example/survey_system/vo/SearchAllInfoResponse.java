package com.example.survey_system.vo;

import java.time.LocalDate;
import java.util.List;

public class SearchAllInfoResponse {
	
	private int questionId;
	
	private String questionName;
	
	private int type;
	
	private String options;
	
	private boolean required;
	
	private int surveyId;
	
	private String surveyName;
	
	private String summary;
	
	private LocalDate startTime;
	
	private LocalDate endTime;
	
	
	private String message;
	
	
	private List<SearchAllInfoResponse> searchAllList;
	
	

	public List<SearchAllInfoResponse> getSearchAllList() {
		return searchAllList;
	}

	public void setSearchAllList(List<SearchAllInfoResponse> searchAllList) {
		this.searchAllList = searchAllList;
	}
	

	public SearchAllInfoResponse(List<SearchAllInfoResponse> searchAllList) {
		super();
		this.searchAllList = searchAllList;
	}

	public SearchAllInfoResponse(int questionId, String questionName, int type, String options, boolean required,
			int surveyId, String surveyName, String summary, LocalDate startTime, LocalDate endTime) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.type = type;
		this.options = options;
		this.required = required;
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.summary = summary;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public SearchAllInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
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
	
	
	
	
	
	

}
