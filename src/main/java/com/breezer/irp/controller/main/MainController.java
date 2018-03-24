package com.breezer.irp.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("MainController")
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("/")
	public String main( @RequestParam( value="a", required=false)String a 
			) {
		
		System.out.println("a = "+a);
		return "main/main";
	}
}
