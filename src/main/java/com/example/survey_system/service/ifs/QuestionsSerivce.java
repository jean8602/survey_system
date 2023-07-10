package com.example.survey_system.service.ifs;

import com.example.survey_system.vo.AddQuestionsReponse;
import com.example.survey_system.vo.AddQuestionsRequest;
import com.example.survey_system.vo.DelQuestionsRequest;
import com.example.survey_system.vo.DelQuestionsResponse;
import com.example.survey_system.vo.SearchAllInfoResponse;
import com.example.survey_system.vo.SearchQuestionsRequest;
import com.example.survey_system.vo.SearchQuestionsResponse;
import com.example.survey_system.vo.UpdateQuestionsRequest;
import com.example.survey_system.vo.UpdateQuestionsResponse;

public interface QuestionsSerivce {

//	新增問卷內題目
	public AddQuestionsReponse addQuestions(AddQuestionsRequest request);

//  修改問卷題目
	public UpdateQuestionsResponse updateQuestions(UpdateQuestionsRequest request);
	
// 	取得所有問卷題目
	public SearchQuestionsResponse getAllQuestions(SearchQuestionsRequest request);

//	刪除問卷題目
	public DelQuestionsResponse deleteQuestions(DelQuestionsRequest request);
	
// searchquestionbyid兩張表的東西都弄出來
	public SearchAllInfoResponse getAllInfo(SearchQuestionsRequest request);
	
}
