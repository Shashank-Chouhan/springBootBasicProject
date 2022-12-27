package com.company.myFirstWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass()); 

//	@RequestMapping("login")
//	public String goToLoginPage() {
//		return "login";
//	}

	
////	http://localhost:8080/login?name=satish
//	@RequestMapping("login")
//	public String goToLoginPage(@RequestParam String name, ModelMap model) {
////		System.out.println("NAME: "+name);  //Not recommended
//		logger.debug("Request param is {}", name);
//		logger.info("I want this at info level");
//		
//		model.put("nameInModel", name);
//		return "login";
//	}

	
	@RequestMapping("/login")
	public String goToLoginPage() {
		return "login";
	}


	
	
}
 