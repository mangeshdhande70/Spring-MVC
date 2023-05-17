package in.ineuron.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> model) {

		model.put("name", "kohli");
		model.put("age", 49);
		model.put("address", "RCB");

		String[] countryNames = new String[] { "IND", "USA", "Russia", "UK" };
		model.put("countryNames", countryNames);

		List<String> subjetList = List.of("java", "jee", "spring", "springboot", "hibernate");
		model.put("subjectList", subjetList);

		Set<Long> mobileSet = Set.of(9999777888L, 6665554443L, 888777654L);
		model.put("mobileSet", mobileSet);

		Map<String, Number> idsMap = Map.of("adhar", 456783, "voterId", 543456L, "panNo", 4534524L);
		model.put("idsMap", idsMap);

		return "show_report";
	}

}
