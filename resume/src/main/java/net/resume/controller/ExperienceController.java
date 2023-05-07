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
	
	
	@GetMapping("/experience")
	public String findAllList(Model model) {
		model.addAttribute("resume",experienceService.findAllListItem());
		return "resume";
	}
}
