package net.resume.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.resume.model.ExperienceModel;
import net.resume.service.ExperienceService;

@Controller
public class ExperienceController {
	@Autowired
	private ExperienceService experienceService;

	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}

	@GetMapping("/experience")
	public String findAllList(Model model) {
		List<ExperienceModel> experiences = experienceService.findAllListPost();
		model.addAttribute("experience", experiences);
		return "experience";
	}

	@GetMapping("/experience/new")
	public String cerateNewPost(HttpServletRequest servletRequest, Model model) {
		String title = servletRequest.getParameter("title");
		String companyname = servletRequest.getParameter("companyname");
		String location = servletRequest.getParameter("location");
		String workingyear = servletRequest.getParameter("workingyear");
		String description = servletRequest.getParameter("description");

		ExperienceModel experience = new ExperienceModel();

		experience.setTitle(title);
		experience.setCompanyname(companyname);
		experience.setLocation(location);
		experience.setWorkingyear(workingyear);
		experience.setDescription(description);

		model.addAttribute("experience", experience);

		return "new_post";
	}

	@PostMapping("/experience/new")
	public String saveNewPost(@ModelAttribute ExperienceModel experienceModel) {
		experienceService.savePost(experienceModel);
		return "redirect:/experience";
	}
	
	@GetMapping("/experience/delete")
	public String deleteProject(@RequestParam Long id)
	{
		this.experienceService.deleteById(id);
		return "redirect:/experience";
	}

}
