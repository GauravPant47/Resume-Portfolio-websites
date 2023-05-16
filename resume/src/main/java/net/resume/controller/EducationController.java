package net.resume.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.resume.model.Education;
import net.resume.service.EducationService;

@Controller
public class EducationController {
		
	@Autowired
	private EducationService educationService;
	
	@GetMapping("/education")
	public String findAllList(Model model) {
		List<Education> educations = educationService.findAllListPost();
		model.addAttribute("education", educations);
		return "education";
	}
	
	@GetMapping("/education/new")
	public String createNew(HttpServletRequest servletRequest,Model model) {
		String title = servletRequest.getParameter("title");
		String college = servletRequest.getParameter("college");
		String location = servletRequest.getParameter("location");
		String course = servletRequest.getParameter("course");
		String description = servletRequest.getParameter("description");
		
		Education education = new Education();
		
		education.setTitle(title);
		education.setCollege(college);
		education.setLocation(location);
		education.setCourse(course);
		education.setDescription(description);
		
		model.addAttribute("education", education);
		
		return "second_post";
	}
	
	@PostMapping("/education/new")
	public String saveNewList(@ModelAttribute Education education) {
		educationService.savePost(education);
		return "redirect:/education";
		
	}
	
	
}
