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
@Table(name = "user_answer")
public class UserAnswer {

	@Id
	@Column(name = "answer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerId;
	@Column(name = "question_id")
	private int questionId;
	@Column(name = "answer")
	private String answer;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email;
	@Column(name = "age")
	private int age;
	@Column(name = "create_time")
	private LocalDate createTime = LocalDate.now();
	
	
	

	public UserAnswer(int questionId, String answer, String userName, String phone, String email, int age) {
		super();
		this.questionId = questionId;
		this.answer = answer;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}

	public UserAnswer(int answerId, int questionId, String answer, String userName, String phone,
			String email, int age, LocalDate createTime) {
		super();
		this.answerId = answerId;
		this.questionId = questionId;
		this.answer = answer;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.createTime = createTime;
	}

	public LocalDate getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}

	public UserAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}


	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
