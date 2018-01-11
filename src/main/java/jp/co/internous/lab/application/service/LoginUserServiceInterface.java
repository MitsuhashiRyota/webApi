package jp.co.internous.lab.application.service;

import jp.co.internous.lab.application.entity.MLoginUserEntity;

public interface LoginUserServiceInterface {

	public MLoginUserEntity getLoginUserInfo(String loginId, String loginPassword);
}
