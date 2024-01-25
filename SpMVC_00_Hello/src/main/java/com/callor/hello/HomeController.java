package com.callor.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 여기는 Controller 클래스 이다
@Controller
public class HomeController {		
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		// dispatcher 가 @Controller 를 찾고 그관련값을 찾아서 html로 보여주기
		return "home";
	}
	
}
