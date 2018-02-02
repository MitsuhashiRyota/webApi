package jp.co.internous.lab.application.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.internous.lab.application.response.TUserInfoResponse;
import jp.co.internous.lab.application.service.SearchUserNameServiceInterface;

@RestController
//@CrossOrigin(origins="http://ipv4.fiddler:3000")
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/")
public class SearchUserInfoController {

	@Autowired
	private SearchUserNameServiceInterface searchUserNameService;

	@GetMapping("/searchUser/{searchUserName}")
	public List<TUserInfoResponse> getSearchUser(@PathVariable("searchUserName") @NotNull String searchUserName) {
		System.out.println("接続SearchIvent");
		System.out.println(searchUserName);

		List<TUserInfoResponse> tUserInfoResponsesList = new ArrayList<>();
		tUserInfoResponsesList = searchUserNameService.getSearchUserInfo(searchUserName.trim());

		return tUserInfoResponsesList;
	}

	@GetMapping("/searchUser/")
	public void getNotSearchUser() {
		System.out.println("起動");
	}
}
