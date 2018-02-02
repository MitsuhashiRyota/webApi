package jp.co.internous.lab.application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.internous.lab.application.service.UserInfoServiceInterface;

@RestController
@RequestMapping("/updateUserInfo/")
//@CrossOrigin(origins="http://ipv4.fiddler:3000")
@CrossOrigin(origins="http://localhost:3000")
public class UpdateUserInfoController {

	@Autowired
	private UserInfoServiceInterface userInfoServiceImpl;

	@GetMapping("/{editParam}/{id}/{validParam}")
	public int updateUserInfo(@PathVariable("editParam") String editParam, @PathVariable("id") int id, @PathVariable("validParam") String validParam) {
		System.out.println("更新開始");
		int updateCount = userInfoServiceImpl.updateUserInformation(editParam, id, validParam);
		System.out.println("更新完了");
		return updateCount;
	}
}
