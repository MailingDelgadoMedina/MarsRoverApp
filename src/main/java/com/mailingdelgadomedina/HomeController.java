package com.mailingdelgadomedina;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
public String getHomeView(ModelMap model) {
		//This line is use with the tradition
		//model.addAttribute("name","Mailing Page");
		
		model.put("name","Meiling");
		
		return "index";
	}
}
