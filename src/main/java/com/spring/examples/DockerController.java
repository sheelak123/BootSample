package com.spring.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DockerController {
	
	@RequestMapping("/Greeting")
	@ResponseBody
	public String callGreets() {
		
		return"Hi i am back";
	}
	

}
