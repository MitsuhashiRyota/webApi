package jp.co.internous.lab.application.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import jp.co.internous.lab.application.response.MLoginUserResponse;
import jp.co.internous.lab.application.response.UserInfoResponse;
import jp.co.internous.lab.application.service.LoginUserServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/loginApi/")
public class UserInformationController {

	@Autowired
	private LoginUserServiceInterface loginUserService;

	@GetMapping(value="/")
	public UserInfoResponse getUserInfo() {

		System.out.println("実行");

		Map<String, UserInfoResponse> userInfoResponse = Maps.newHashMap();

		return UserInfoResponse.builder()
				.id(1)
				.name("Mr Human")
				.age("21")
				.build();
	}

	@GetMapping(value="/map/")
	public List<UserInfoResponse> getListUserInfo() {
		int count = 5;
		List<UserInfoResponse> userInfoResponsesList = Lists.newArrayList();

		for (int i=0; i < count; i++) {
			userInfoResponsesList.add(UserInfoResponse.builder()
					.id(i)
					.name("Mr Claun" + i)
					.age(""+i)
					.build());
		}

		return userInfoResponsesList;
	}

	@GetMapping("/info/")
	public MLoginUserResponse getUserInfoEntity() {
		return loginUserService.getLoginUserInfo("internous", "internous01");

	}

	@GetMapping("/login/{loginId}/{loginPasswrod}")
	public MLoginUserResponse doLogin(@PathVariable("loginId") String loginId, @PathVariable("loginPasswrod") String loginPassword) {
		System.out.println("接続");
		return loginUserService.getLoginUserInfo(loginId, loginPassword);
	}

}