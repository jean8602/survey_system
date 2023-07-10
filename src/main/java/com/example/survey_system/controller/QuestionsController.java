package com.example.survey_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.survey_system.service.ifs.QuestionsSerivce;
import com.example.survey_system.vo.AddQuestionsReponse;
import com.example.survey_system.vo.AddQuestionsRequest;
import com.example.survey_system.vo.DelQuestionsRequest;
import com.example.survey_system.vo.DelQuestionsResponse;
import com.example.survey_system.vo.SearchAllInfoResponse;
import com.example.survey_system.vo.SearchQuestionsRequest;
import com.example.survey_system.vo.SearchQuestionsResponse;
import com.example.survey_system.vo.UpdateQuestionsRequest;
import com.example.survey_system.vo.UpdateQuestionsResponse;

@CrossOrigin
@RestController
public class QuestionsController {

	@Autowired
	QuestionsSerivce questionsSerivce;

	@PostMapping(value = "addQuestions")
	public AddQuestionsReponse addQuestions(@RequestBody AddQuestionsRequest request) {
		return questionsSerivce.addQuestions(request);
	}
	
	@PostMapping(value = "updateQuestions")
	public UpdateQuestionsResponse updateQuestions(@RequestBody UpdateQuestionsRequest request) {
		return questionsSerivce.updateQuestions(request);
	}
	
	@PostMapping(value = "deleteQuestions")
	public DelQuestionsResponse deleteQuestions(@RequestBody DelQuestionsRequest request) {
		return questionsSerivce.deleteQuestions(request);
		
	}
	
	@PostMapping(value = "get_All_Questions")
	public SearchQuestionsResponse getAllQuestions(@RequestBody SearchQuestionsRequest request) {
		return questionsSerivce.getAllQuestions(request);
	}
	
	@PostMapping(value = "get_All_Info")
	public SearchAllInfoResponse getAllInfo(@RequestBody SearchQuestionsRequest request) {
		return questionsSerivce.getAllInfo(request);
	}
	
	
}
