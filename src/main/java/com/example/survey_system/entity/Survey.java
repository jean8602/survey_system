package com.example.survey_system.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "survey_table")
public class Survey {

	@Id
	@Column(name = "survey_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int surveyId;
	
	@Column(name = "survey_name")
	private String surveyName;
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "start_time")
	private LocalDate startTime;
	
	@Column(name = "end_time")
	private LocalDate endTime;
	
	@Column(name = "create_time")
	private LocalDate createTime = LocalDate.now();
	
	
	
	public Survey(String surveyName, String summary, LocalDate startTime, LocalDate endTime) {
		super();
		this.surveyName = surveyName;
		this.summary = summary;
		this.startTime = startTime;
		this.endTime = endTime;

	}



	public Survey(int surveyId, String surveyName, String summary, LocalDate startTime, LocalDate endTime,
			LocalDate createTime) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.summary = summary;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createTime = createTime;
	}



	public Survey() {
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
