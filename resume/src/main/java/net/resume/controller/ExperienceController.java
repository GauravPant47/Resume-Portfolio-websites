package net.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.resume.service.ExperienceService;

@Controller
public class ExperienceController {
	@Autowired
	private ExperienceService experienceService;

	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}

	@GetMapping("/index")
	public String mainPage(Model model) {
		model.addAttribute("message", "Hello");
		return "index";
	}

	@GetMapping("/experience")
	public String findAllList(Model model) {
		model.addAttribute("experience", experienceService.findAllListItem());
		return "experience";
	}

	@GetMapping("/education")
	public String myEducation() {
		return "education";
	}

	@GetMapping("/project")
	public String myProjects() {
		return "project";
	}

	@GetMapping("/contact")
	public String myContact() {
		return "contact";
	}
}
