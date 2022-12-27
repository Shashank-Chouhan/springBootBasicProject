package com.company.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("/say-hello")
	@ResponseBody  
	public String sayHello() {
		return "How are you today?";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody  
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>First page");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>My first html page");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
//	src/main/resources/META-INf/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")  
//	@ResponseBody
	public String sayHelloJsp() {
		return "sayHello";
	}
}
