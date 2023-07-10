package com.example.survey_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.survey_system.service.ifs.UserAnswerService;
import com.example.survey_system.vo.AddAnswerInfoRequest;
import com.example.survey_system.vo.AddAnswerInfoResponse;
import com.example.survey_system.vo.GetAnswerRequest;
import com.example.survey_system.vo.GetAnswerResponse;

@CrossOrigin
@RestController
public class UserAnswerController {
	
	@Autowired
	UserAnswerService userAnswerSerivce;

	@PostMapping(value = "add_AnswerInfo")
	public AddAnswerInfoResponse addAnswerInfo(@RequestBody AddAnswerInfoRequest request) {
		return userAnswerSerivce.addAnswerInfo(request);
	}
	
	@GetMapping(value = "get_FeedbackList")
	public GetAnswerResponse getFeedbackList() {
		return userAnswerSerivce.getFeedbackList();
	}

}
