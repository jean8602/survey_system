package com.example.survey_system.service.ifs;

import com.example.survey_system.vo.AddAnswerInfoRequest;
import com.example.survey_system.vo.AddAnswerInfoResponse;
import com.example.survey_system.vo.GetAnswerRequest;
import com.example.survey_system.vo.GetAnswerResponse;

public interface UserAnswerService {

	public AddAnswerInfoResponse addAnswerInfo(AddAnswerInfoRequest request);
	
//	問卷回饋取出
	public GetAnswerResponse getFeedbackList ();
	
//	僅取出同個使用者與填寫時間
	public GetAnswerResponse getSameUserList ();
}
