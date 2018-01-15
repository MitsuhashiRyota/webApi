package jp.co.internous.lab.application.service;

import jp.co.internous.lab.application.response.MLoginUserResponse;

public interface LoginUserServiceInterface {

	public MLoginUserResponse getLoginUserInfo(String loginId, String loginPassword);
}