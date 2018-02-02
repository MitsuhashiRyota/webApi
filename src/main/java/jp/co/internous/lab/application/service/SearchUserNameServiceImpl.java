package jp.co.internous.lab.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.internous.lab.application.entity.TUserInfoEntity;
import jp.co.internous.lab.application.repository.TUserInfoRepository;
import jp.co.internous.lab.application.response.TUserInfoResponse;

@Service
public class SearchUserNameServiceImpl implements SearchUserNameServiceInterface {

	@Autowired
	TUserInfoRepository tUserInfoRepository;

	@Override
	public List<TUserInfoResponse> getSearchUserInfo(String searchName) {

		List<TUserInfoEntity> tUserInfoEntities = tUserInfoRepository.findByUserName(searchName);
		return setParam(tUserInfoEntities);
	}

	/**
	 * ユーザー情報をSet
	 * @param param
	 * @return List<TUserInfoResponse>
	 */
	private List<TUserInfoResponse> setParam(List<TUserInfoEntity> param) {

		List<TUserInfoResponse> tUserInfoResponseList = new ArrayList<>();

		for(int i=0; i < param.size(); i++) {

			tUserInfoResponseList.add(TUserInfoResponse.builder()
			.id(param.get(i).getId())
			.userFirstNameKana(param.get(i).getUserFirstNameKana())
			.userLastNameKana(param.get(i).getUserLastNameKana())
			.userFirstName(param.get(i).getUserFirstName())
			.userLastName(param.get(i).getUserLastName())
			.telNumber(param.get(i).getTelNumber())
			.mailAddress(param.get(i).getMailAddress())
			.visitCount(param.get(i).getVisitCount())
			.lastVisitDate(param.get(i).getLastVisitDate())
			.memo(param.get(i).getMemo())
			.insertDate(param.get(i).getInsertDate()).build());
		}

		return tUserInfoResponseList;
	}

}
