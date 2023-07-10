package com.example.survey_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions_table")
public class Questions {

	@Id
	@Column(name = "question_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;

	@Column(name = "question_name")
	private String questionName;

	@Column(name = "type")
	private int type;

	@Column(name = "options")
	private String options;

	@Column(name = "survey_id")
	private int surveyId;

	@Column(name = "required")
	private boolean isRequired;


	public Questions(String questionName, int type, String options, int surveyId, boolean isRequired) {
		super();
		this.questionName = questionName;
		this.type = type;
		this.options = options;
		this.surveyId = surveyId;
		this.isRequired = isRequired;
	}


	public Questions() {
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
		return isRequired;
	}

	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}


}
