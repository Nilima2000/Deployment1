package com.Deploymentproject4.Deployment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "24/7 Software Providing \n"+"Roactive Operations for the World's Greatest Properties\n"
				+ "Operations management software to enhance real-time communications, maximize experience, and reduce risk";
	}

}
