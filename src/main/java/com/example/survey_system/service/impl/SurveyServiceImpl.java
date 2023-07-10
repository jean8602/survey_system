package com.example.survey_system.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.example.survey_system.entity.Survey;
import com.example.survey_system.repository.SurveyDao;
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

@Service

public class SurveyServiceImpl implements SurveyService {

	@Autowired
	private SurveyDao surveyDao;

	@Override
	public AddSurveyInfoResponse addSurveyInfo(AddSurveyInfoRequest request) {

		String name = request.getSurveyName();
		String summary = request.getSummary();
		LocalDate startTime = request.getStartTime();
		LocalDate endTime = request.getEndTime();
		LocalDate nowDateTime = LocalDate.now();
//		問卷名稱不得為空、簡述不得為空
		if (!StringUtils.hasText(name) || !StringUtils.hasText(summary)) {
			return new AddSurveyInfoResponse("名字內容不得空白");
		}

		if (startTime.isAfter(endTime)) {
			return new AddSurveyInfoResponse("開始時間不得大於結束時間");
		}

		Survey finalResult = new Survey(name, summary, startTime, endTime);
		Survey temp = surveyDao.save(finalResult);
		
		int surveyId = temp.getSurveyId();

		return new AddSurveyInfoResponse("新增問卷基本資料成功",surveyId);
	}

	@Override
	public UpdateSurveyResponse updateSurveyInfo(UpdateSurveyRequest request) {
//		找出資料庫是否有這筆資料 用名稱去找???
//		根據使用者輸入名字 內容 日期 狀態會跟著去修正
		int surveyId = request.getSurveyId();
		String newName = request.getSurveyName();
		String newSummary = request.getSummary();
		LocalDate newStartTime = request.getStartTime();
		LocalDate newEndTime = request.getEndTime();
		LocalDate newCreateTime = LocalDate.now();

		if (!StringUtils.hasText(newName) || !StringUtils.hasText(newSummary)) {
			new UpdateSurveyResponse("內容不得為空");
		}

//		日期防呆 開始日期不得晚於結束日期
		if (newStartTime.isAfter(newEndTime)) {
			new UpdateSurveyResponse("開始日期不得晚於結束日期");
		}


		int res = surveyDao.updateSurveyByNumber(newName, newSummary, newStartTime, newEndTime,
				newCreateTime, surveyId);

		if (res == 0) {

			return new UpdateSurveyResponse("data is error");

		}

		return new UpdateSurveyResponse("success!");
	}

	@Override
	public DelSurveyResponse delSurveyInfo(DelSurveyRequest request) {
		int number = request.getSurveyId();

		if (!surveyDao.existsById(number)) {
			return new DelSurveyResponse("此筆資料不存在");

		}

		surveyDao.deleteBySurveyId(number);
		return new DelSurveyResponse("刪除成功");

	}

	@Override
	public SearchSurveyResponse distinctSearchSurvey(SearchSurveyResquest request) {

//		連同全部資料都一起查詢
		String name = request.getSurveyName();
		LocalDate startTime = request.getStartTime();
		LocalDate endTime = request.getEndTime();

		List<SearchSurveyResponse> res = surveyDao.distinctSearch(name, startTime, endTime);

		if (CollectionUtils.isEmpty(res)) {
			return new SearchSurveyResponse("查無此資料");
		}

		return new SearchSurveyResponse("查詢成功", res);

	}

	@Override
	public GetSurveyResponse getSurveyInfo() {
		List<Survey> op = surveyDao.findAll();
		return new GetSurveyResponse(op);
	}

	@Override
	public SearchSurveyResponse searchSurveyById(SearchSurveyResquest request) {

		int surveyId = request.getSurveyId();

		Optional<Survey> op = surveyDao.findById(surveyId);
		
		if (op.get() == null) {
			return new SearchSurveyResponse("查詢失敗");
		}

		return new SearchSurveyResponse("查詢成功", op.get());
	}

}
