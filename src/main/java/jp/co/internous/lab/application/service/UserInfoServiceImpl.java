package jp.co.internous.lab.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.internous.lab.application.repository.TUserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoServiceInterface {

	@Autowired
	private TUserInfoRepository tUserInfoRepository;

	@Override
	public int updateUserInformation(String editParam, int id, String validParam) {

		int updateCount = 0;
		try {
			switch (validParam) {
			case "1":
				System.out.println("名前更新");
				updateCount = tUserInfoRepository.saveByUserFirstNameKana(editParam, id);
				break;

			case "2":
				updateCount = tUserInfoRepository.saveByUserLastNameKana(editParam, id);
				break;

			case "3":
				updateCount = tUserInfoRepository.saveByUserFirstName(editParam, id);
				break;

			case "4":
				updateCount = tUserInfoRepository.saveByUserLastName(editParam, id);
				break;

			case "5":
				updateCount = tUserInfoRepository.saveByTelNumber(editParam, id);
				break;

			case "6":
				updateCount = tUserInfoRepository.saveByMailAddressKana(editParam, id);
				break;

			default:
				updateCount = tUserInfoRepository.saveByMemo(editParam, id);
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
			return updateCount;
		}

		return updateCount;
	}

}
