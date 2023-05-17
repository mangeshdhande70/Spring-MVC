package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	
	
	@GetMapping(value = "/get")
	public String display(Model model) {
		String reString = "Hello Bhai";
		
		model.addAttribute("message", reString);
		return "index";
	}
	
	

}
