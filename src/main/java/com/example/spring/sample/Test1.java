package com.example.spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Test1 {
	
	@RequestMapping(path="/test1",method = RequestMethod.GET)
	public String write1() {
		
		return "test/test";
	}
}
