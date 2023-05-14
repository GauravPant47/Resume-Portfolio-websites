package net.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EducationController {
	@GetMapping("/education")
	public String myEducation() {
		return "education";
	}
}
