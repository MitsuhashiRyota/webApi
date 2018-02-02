package jp.co.internous.lab.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.internous.lab.application.entity.TUserInfoEntity;
import jp.co.internous.lab.application.repository.TUserInfoRepository;
import jp.co.internous.lab.application.response.TUserInfoResponse;

@Service
public class SelectUserIdServiceImpl implements SelectUserIdServiceInterface {

	@Autowired
	private TUserInfoRepository tUserInfoRepository;

	@Override
	public TUserInfoResponse getSelectUserInfo(int selectUserId) {
		return setParam(tUserInfoRepository.findById(selectUserId));
	}

	@SuppressWarnings("unused")
	private TUserInfoResponse setParam(TUserInfoEntity tUserInfoEntity) {

		return TUserInfoResponse.builder()
		.id(tUserInfoEntity.getId())
		.userFirstNameKana(tUserInfoEntity.getUserFirstNameKana())
		.userLastNameKana(tUserInfoEntity.getUserLastNameKana())
		.userFirstName(tUserInfoEntity.getUserFirstName())
		.userLastName(tUserInfoEntity.getUserLastName())
		.telNumber(tUserInfoEntity.getTelNumber())
		.mailAddress(tUserInfoEntity.getMailAddress())
		.visitCount(tUserInfoEntity.getVisitCount())
		.lastVisitDate(tUserInfoEntity.getLastVisitDate())
		.memo(tUserInfoEntity.getMemo())
		.build();
	}

}
