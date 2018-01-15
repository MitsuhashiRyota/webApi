package jp.co.internous.lab.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.internous.lab.application.service.LoginUserServiceInterface;

@RestController
@RequestMapping("/sampleApi/")
public class UserApiController {

	@Autowired
	private LoginUserServiceInterface loginUserService;


	/**
	 * Post通信で送られてきた入力情報からログインユーザー情報をJSONで返却
	 * @param mLoginInfoForm
	 * @param model
	 * @param request
	 * @return mLoginUserEntity
	 */

	/*
	public MLoginUserResponse userLoginControl(@RequestParam("loginId") String loginId, @RequestParam("loginPassword") String loginPassword) {

		System.out.println("非同期で呼ばれたよ");

	//	System.out.println("Formから確認");
	//	System.out.println(mLoginInfoForm.getLoginId());
	//	System.out.println(mLoginInfoForm.getLoginPassword());

		System.out.println("Httprequestから確認");
		System.out.println(loginId);
		System.out.println(loginPassword);

//		mLoginUserResponse.setMLoginUserEntity(loginUserService.getLoginUserInfo(loginId, loginPassword));

//		return mLoginUserResponse.getMLoginUserEntity();

		return loginUserService.getLoginUserInfo(loginId, loginPassword);
	}
	*/
}
