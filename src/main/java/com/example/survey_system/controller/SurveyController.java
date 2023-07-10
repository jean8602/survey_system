package com.example.survey_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.survey_system.service.ifs.SurveyService;
import com.example.survey_system.vo.AddSurveyInfoRequest;
import com.example.survey_system.vo.AddSurveyInfoResponse;
import com.example.survey_system.vo.DelSurveyRequest;
import com.example.survey_system.vo.DelSurveyResponse;
import com.example.survey_system.vo.GetSurveyResponse;
import com.example.survey_system.vo.SearchSurveyResponse;
import com.example.survey_system.vo.SearchSurveyResquest;
import com.example.survey_system.vo.UpdateSurveyRequest;
import com.example.survey_system.vo.UpdateSurveyResponse;

@CrossOrigin
@RestController
public class SurveyController {

	@Autowired
	SurveyService surveyService;

	@PostMapping(value = "add_survey_info")
	public AddSurveyInfoResponse addSurveyInfo(@RequestBody AddSurveyInfoRequest request) {
		return surveyService.addSurveyInfo(request);
	}

	@PostMapping(value = "update_survey_info")
	public UpdateSurveyResponse updateSurveyInfo(@RequestBody UpdateSurveyRequest request) {
		return surveyService.updateSurveyInfo(request);
	}

	@PostMapping(value = "del_survey_info")
	public DelSurveyResponse delSurveyInfo(@RequestBody DelSurveyRequest request) {
		return surveyService.delSurveyInfo(request);

	}
	
	@PostMapping(value = "distinct_search_survey")
	public SearchSurveyResponse distinctSearchSurvey(@RequestBody SearchSurveyResquest request) {
		return surveyService.distinctSearchSurvey(request);

	}
	
	@GetMapping(value = "get_Survey_Info")
	public GetSurveyResponse getSurveyInfo() {
		return surveyService.getSurveyInfo();
	}
	
	@PostMapping(value = "search_Survey_ById")
	public SearchSurveyResponse searchSurveyById(@RequestBody SearchSurveyResquest request) {
		return surveyService.searchSurveyById(request);

	}

}
