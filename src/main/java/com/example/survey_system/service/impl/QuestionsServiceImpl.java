package com.example.survey_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.survey_system.entity.Questions;
import com.example.survey_system.repository.QuestionsDao;
import com.example.survey_system.repository.SurveyDao;
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

@Service
public class QuestionsServiceImpl implements QuestionsSerivce {

	@Autowired
	private SurveyDao surveyDao;
	@Autowired
	private QuestionsDao questionsDao;

	@Override
	public AddQuestionsReponse addQuestions(AddQuestionsRequest request) {

		String questionName = request.getQuestionName();
		String option = request.getOptions();
		int type = request.getType();
		boolean required = request.isRequired();
		int surveyId = request.getSurveyId();

//		判斷此問卷是否已有基本資料

		if (!surveyDao.existsById(surveyId)) {
			return new AddQuestionsReponse("請先建立問卷基本資料");

		}

		if (!StringUtils.hasText(questionName) || !StringUtils.hasText(option)) {
			return new AddQuestionsReponse("名稱與選項不得為空白！！");
		}

//		判斷輸入題目名稱是否有和questiondao的姓名欄位相同
		Questions existName = questionsDao.findByQuestionNameAndSurveyId(questionName, surveyId);

		if (existName != null) {
			return new AddQuestionsReponse("題目不得重複！！");
		}

		if (type > 2) {
			return new AddQuestionsReponse("請選擇題目類型");
		}

		Questions finalRes = new Questions(questionName, type, option, surveyId, required);
		questionsDao.save(finalRes);

		return new AddQuestionsReponse("新增成功");
	}

	@Override
	public UpdateQuestionsResponse updateQuestions(UpdateQuestionsRequest request) {

		String questionName = request.getQuestionName();
		String option = request.getOptions();
		int type = request.getType();
		boolean required = request.isRequired();
		int surveyId = request.getSurveyId();
		int questionId = request.getQuestionId();

		if (!StringUtils.hasText(questionName) || !StringUtils.hasText(option)) {
			return new UpdateQuestionsResponse("名稱與選項不得為空白");
		}

		int updateRes = questionsDao.updateQuestionsByQuestionId(questionName, type, option, surveyId, required,
				questionId);
		if (updateRes == 0) {
			return new UpdateQuestionsResponse("修改失敗");
		}

		return new UpdateQuestionsResponse("修改成功");
	}

	@Override
	public SearchQuestionsResponse getAllQuestions(SearchQuestionsRequest request) {
		// 找出對應surveyid的問題列表
		int surveyId = request.getSurveyId();
		List<Questions> op = questionsDao.findBySurveyId(surveyId);
		
		return new SearchQuestionsResponse(op);
	}

	@Override
	public DelQuestionsResponse deleteQuestions(DelQuestionsRequest request) {
		// 刪除題目
		int surveyId = request.getSurveyId();

		questionsDao.deleteBySurveyId(surveyId);
		surveyDao.deleteBySurveyId(surveyId);

		return new DelQuestionsResponse("刪除成功");
	}

	@Override
	public SearchAllInfoResponse getAllInfo(SearchQuestionsRequest request) {
		int surveyId = request.getSurveyId();
		List<SearchAllInfoResponse> op = questionsDao.searchDataBySurveyId(surveyId);
		
		return new SearchAllInfoResponse(op);
	}

}
