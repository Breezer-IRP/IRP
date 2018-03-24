package com.breezer.irp.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("MainController")
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main/index";
	}
}
