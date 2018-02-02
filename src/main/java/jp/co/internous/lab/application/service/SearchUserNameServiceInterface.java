package jp.co.internous.lab.application.service;


import java.util.List;

import jp.co.internous.lab.application.response.TUserInfoResponse;

public interface SearchUserNameServiceInterface {

	public List<TUserInfoResponse> getSearchUserInfo(String searchName);
}
