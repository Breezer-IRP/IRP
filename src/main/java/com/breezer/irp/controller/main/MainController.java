package com.breezer.irp.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.breezer.irp.security.Auth;

@Auth
@Controller("MainController")
@RequestMapping("/main")
public class MainController {
	
	@RequestMapping("")
	public String main() {
		return "main/main_index";
	}
}
