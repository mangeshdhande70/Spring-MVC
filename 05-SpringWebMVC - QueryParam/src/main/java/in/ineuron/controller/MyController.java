package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	
	
	@GetMapping(value = "/service")
	public String display(@RequestParam("name") String str,@RequestParam("id") Integer id , Model model) {
		String reString = str.concat(" Welcome to our Page wiht id = "+id);
		model.addAttribute("message", reString);
		return "index";
	}
	
	

}
