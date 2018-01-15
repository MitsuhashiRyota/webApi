package jp.co.internous.lab.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.internous.lab.application.entity.MLoginUserEntity;
import jp.co.internous.lab.application.repository.MLoginUserRepository;
import jp.co.internous.lab.application.response.MLoginUserResponse;

@Service
public class LoginUserServicImpl implements LoginUserServiceInterface {

	@Autowired
	private MLoginUserRepository mLoginUserRepository;

	private MLoginUserEntity mLoginUserEntity;

	@Override
	@Transactional
	public MLoginUserResponse getLoginUserInfo(String loginId, String loginPassword) {

		mLoginUserEntity =  mLoginUserRepository.findLoginUser(loginId, loginPassword);
		return MLoginUserResponse.builder().loginId(mLoginUserEntity.getId()).loginPassword(mLoginUserEntity.getLoginPassword()).userName(mLoginUserEntity.getUserName()).build();


	}

}
