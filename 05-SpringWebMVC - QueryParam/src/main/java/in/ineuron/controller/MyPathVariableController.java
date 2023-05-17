package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyPathVariableController {
	
	
	@GetMapping(value = "/get/{name}")
	public String display(@PathVariable String name , Model model) {
		
		String msg = name + " Welcome to Blog";
		model.addAttribute("welcome", msg);
		return "welcome";
	}

}
