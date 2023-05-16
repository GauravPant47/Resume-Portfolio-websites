package net.resume.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import net.resume.model.Project;
import net.resume.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/project")
	public String myProjects(Model model) {
		List<Project> projects = projectService.findAllProject();
		model.addAttribute("project", projects);
		return "project";
	}
	
	@GetMapping("/project/new")
	public String addNewProject(HttpServletRequest servletRequest,Model model)
	{
		String title = servletRequest.getParameter("title");
		String url = servletRequest.getParameter("url");
		String detailofproject = servletRequest.getParameter("detailofproject");

		Project project = new Project();
		
		project.setTitle(title);
		project.setUrl(url);
		project.setDetailofproject(detailofproject);
		
		model.addAttribute("project", project);
		return "add_project";
	}
	
	@PostMapping("/project/new")
	public String saveProject(@ModelAttribute Project project)
	{
		projectService.saveProject(project);
		return "redirect:/project";
	}
	
	@GetMapping("/project/delete")
	public String deleteProject(@RequestParam Long id)
	{
		this.projectService.deleteProjectById(id);
		return "redirect:/project";
	}

}
