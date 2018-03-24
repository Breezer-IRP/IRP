package com.breezer.irp.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("UserLoginController")
@RequestMapping({"/", "/login"})
public class UserLoginController {
	
	
	@RequestMapping("")
	public String main( @RequestParam( value="a", required=false)String a 
			) {
		
		System.out.println("a = "+a);
		return "user/user_login";
	}
}
