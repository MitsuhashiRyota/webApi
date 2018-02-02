package jp.co.internous.lab.application.service;

import java.text.ParseException;

import jp.co.internous.lab.application.form.TUserInfoFrom;

public interface CreateUserInterface {

	/**
	 * ユーザー登録API
	 * @param tUserInfoFrom
	 * @throws ParseException
	 */
	public void createUser(TUserInfoFrom tUserInfoFrom);
}
