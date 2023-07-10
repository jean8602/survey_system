package com.example.survey_system.service.ifs;

import com.example.survey_system.vo.AddSurveyInfoRequest;
import com.example.survey_system.vo.AddSurveyInfoResponse;
import com.example.survey_system.vo.DelSurveyRequest;
import com.example.survey_system.vo.DelSurveyResponse;
import com.example.survey_system.vo.GetSurveyResponse;
import com.example.survey_system.vo.SearchSurveyResponse;
import com.example.survey_system.vo.SearchSurveyResquest;
import com.example.survey_system.vo.UpdateSurveyRequest;
import com.example.survey_system.vo.UpdateSurveyResponse;

public interface SurveyService {

//新增問卷基本資料
	public AddSurveyInfoResponse addSurveyInfo(AddSurveyInfoRequest request);

//修改問卷基本資料
	public UpdateSurveyResponse updateSurveyInfo(UpdateSurveyRequest request);
	
//	搜尋by日期 or 標題
	public SearchSurveyResponse distinctSearchSurvey(SearchSurveyResquest request);
//  刪除問卷基本資料
	public DelSurveyResponse delSurveyInfo(DelSurveyRequest request);
//	查詢全部資料
	public GetSurveyResponse getSurveyInfo();
//  查詢問卷by surveyId
	public SearchSurveyResponse searchSurveyById(SearchSurveyResquest request);
}
