package jp.co.internous.lab.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.internous.lab.application.entity.MLoginUserEntity;
import jp.co.internous.lab.application.repository.MLoginUserRepository;

@Service
public class LoginUserServicImpl implements LoginUserServiceInterface {

	@Autowired
	private MLoginUserRepository mLoginUserRepository;

	@Override
	@Transactional
	public MLoginUserEntity getLoginUserInfo(String loginId, String loginPassword) {
		return mLoginUserRepository.findLoginUser(loginId, loginPassword);
	}

}
