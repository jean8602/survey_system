package com.example.survey_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.survey_system.entity.Survey;
import com.example.survey_system.entity.UserAnswer;
import com.example.survey_system.repository.QuestionsDao;
import com.example.survey_system.repository.UserAnswerDao;
import com.example.survey_system.service.ifs.UserAnswerService;
import com.example.survey_system.vo.AddAnswerInfoRequest;
import com.example.survey_system.vo.AddAnswerInfoResponse;
import com.example.survey_system.vo.GetAnswerRequest;
import com.example.survey_system.vo.GetAnswerResponse;


@Service
public class UserAnswerServiceImpl implements UserAnswerService {

	@Autowired
	UserAnswerDao userAnswerDao;
	@Autowired
	private QuestionsDao questionsDao;

	@Override
	public AddAnswerInfoResponse addAnswerInfo(AddAnswerInfoRequest request) {
//		輸入個人基本資料 姓名 電話（正則） email age  填寫問卷
		int questionId = request.getQuestionId();

		String userName = request.getUserName();

		String phone = request.getPhone();

		String email = request.getEmail();

		int age = request.getAge();

		String answer = request.getAnswer();

		if (!questionsDao.existsById(questionId)) {
			return new AddAnswerInfoResponse("此問題不存在");
		}

		if (!StringUtils.hasText(userName) || !StringUtils.hasText(phone) || !StringUtils.hasText(email) || age < 0) {
			return new AddAnswerInfoResponse("基本資料不得為空");
		}

		if (!StringUtils.hasText(answer)) {
			return new AddAnswerInfoResponse("答案不得為空");
		}

//		判斷是否同一人填寫
		UserAnswer existRes = userAnswerDao.findAllByQuestionIdAndUserNameAndPhone(questionId, userName, phone);
		if (existRes != null) {
			return new AddAnswerInfoResponse("該使用者已填過問卷");
		}

		UserAnswer finalRes = new UserAnswer(questionId, answer, userName, phone, email, age);
		userAnswerDao.save(finalRes);

		return new AddAnswerInfoResponse("新增成功");
	}

//	取得所有填寫資料
	@Override
	public GetAnswerResponse getFeedbackList() {
		List<UserAnswer> op = userAnswerDao.findAll();
		return new GetAnswerResponse(op);
	}

	@Override
	public GetAnswerResponse getSameUserList() {
//		List<GetAnswerResponse> op = userAnswerDao.distinctSearch();
//		    if (!op.isEmpty()) {
//		        GetAnswerResponse firstResponse = op.get(0);
//		        return new GetAnswerResponse(firstResponse.getUserName(), firstResponse.getCreateTime());
//		    }
		return new GetAnswerResponse("");
	}

}
