package jp.co.internous.lab.application.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.internous.lab.application.entity.MLoginUserEntity;
import jp.co.internous.lab.application.form.MLoginInfoForm;
import jp.co.internous.lab.application.service.LoginUserServiceInterface;

@RestController
@RequestMapping("/")
@ResponseBody
public class UserApiController {

	@Autowired
	private LoginUserServiceInterface loginUserService;

	@Autowired
	private MLoginUserEntity mLoginUserEntity;

	/**
	 * Post通信で送られてきた入力情報からログインユーザー情報をJSONで返却
	 * @param mLoginInfoForm
	 * @param model
	 * @param request
	 * @return mLoginUserEntity
	 */
	@RequestMapping(value="sampleApi", method={RequestMethod.POST })
	public ResponseEntity<MLoginUserEntity> userLoginControl(@ModelAttribute MLoginInfoForm mLoginInfoForm, Model model, HttpServletRequest request) {

		System.out.println("非同期で呼ばれたよ");

		System.out.println("Formから確認");
		System.out.println(mLoginInfoForm.getLoginId());
		System.out.println(mLoginInfoForm.getLoginPass());

		System.out.println("Httprequestから確認");
		System.out.println(request.getParameter("loginId"));
		System.out.println(request.getParameter("loginPass"));

		mLoginUserEntity = loginUserService.getLoginUserInfo(mLoginInfoForm.getLoginId(), mLoginInfoForm.getLoginPass());

		return ResponseEntity.ok(mLoginUserEntity);
	}
}
