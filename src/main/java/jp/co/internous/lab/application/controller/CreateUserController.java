package jp.co.internous.lab.application.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.internous.lab.application.form.TUserInfoFrom;
import jp.co.internous.lab.application.service.CreateUserInterface;

@RestController
@RequestMapping("/createUser/")
//@CrossOrigin(origins="http://ipv4.fiddler:3000")
@CrossOrigin(origins="http://localhost:3000")
public class CreateUserController {

	@Autowired
	private CreateUserInterface createUserServiceImpl;

	@RequestMapping(value="/", method={RequestMethod.POST})
	public void createUser(@ModelAttribute TUserInfoFrom tUserInfoFrom, Model model) throws ParseException {
		System.out.println("OK");

		createUserServiceImpl.createUser(tUserInfoFrom);
	}


}
