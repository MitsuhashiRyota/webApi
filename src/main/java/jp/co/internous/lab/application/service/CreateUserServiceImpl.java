package jp.co.internous.lab.application.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.internous.lab.application.entity.TUserInfoEntity;
import jp.co.internous.lab.application.form.TUserInfoFrom;
import jp.co.internous.lab.application.repository.TUserInfoRepository;
import jp.co.internous.lab.application.uuid.DateUtil;
import jp.co.internous.lab.application.uuid.SerialUUIDUtil;

@Service
public class CreateUserServiceImpl implements CreateUserInterface {

	@Autowired
	TUserInfoRepository tUserInfoRepository;

	@Autowired
	TUserInfoEntity tUserInfoEntity;

	@Override
	public void createUser(TUserInfoFrom tUserInfoFrom) {
		this.setCreateUserParameter(tUserInfoFrom);
		tUserInfoRepository.save(tUserInfoEntity);
	}

	private void setCreateUserParameter(TUserInfoFrom tUserInfoFrom) {

		SerialUUIDUtil serialUUIDUtil = new SerialUUIDUtil();
		System.out.println(serialUUIDUtil.getSerialUUID());

		tUserInfoEntity.setId(4);
		tUserInfoEntity.setUserFirstName(tUserInfoFrom.getUserFirstName());
		tUserInfoEntity.setUserLastName(tUserInfoFrom.getUserLastName());
		tUserInfoEntity.setUserFirstNameKana(tUserInfoFrom.getUserFirstNameKana());
		tUserInfoEntity.setUserLastNameKana(tUserInfoFrom.getUserLastNameKana());
		tUserInfoEntity.setTelNumber(tUserInfoFrom.getTelNumber());
		tUserInfoEntity.setMailAddress(tUserInfoFrom.getMailAddress());
		tUserInfoEntity.setVisitCount(tUserInfoFrom.getVisitCount());
		tUserInfoEntity.setLastVisitDate(Date.valueOf(DateUtil.getDate()));
		tUserInfoEntity.setMemo(tUserInfoFrom.getMemo());
	}

}
