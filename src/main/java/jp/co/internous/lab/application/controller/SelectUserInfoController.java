package jp.co.internous.lab.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.internous.lab.application.response.TUserInfoResponse;
import jp.co.internous.lab.application.service.SelectUserIdServiceInterface;

@RestController
@RequestMapping("/selectUser/")
//@CrossOrigin(origins="http://ipv4.fiddler:3000")
@CrossOrigin(origins="http://localhost:3000")
public class SelectUserInfoController {

	@Autowired
	private SelectUserIdServiceInterface selectUserIdService;

	@GetMapping("/{selectUserId}")
	public TUserInfoResponse getSelectUser(@PathVariable("selectUserId") int selectUserId) {
		return selectUserIdService.getSelectUserInfo(selectUserId);
	}
}
