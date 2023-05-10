package net.resume.controller;

import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.resume.model.Mail;
import net.resume.service.ExperienceService;
import net.resume.service.MailService;

@Controller
public class ExperienceController {
	@Autowired
	private ExperienceService experienceService;
	
	@Autowired
	private MailService mailService;

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
	
	@PostMapping("/contact")
	public String updatingContact(HttpServletRequest servletRequest) {
		String fullname = servletRequest.getParameter("fullname");
		String email = servletRequest.getParameter("email");
		String subject = servletRequest.getParameter("subject");
		String content = servletRequest.getParameter("content");
		
		Mail mail = new Mail();
		mail.setMailForm("pantg87@gmail.com");
		mail.setMailTo("gaurav556pant@gmail.com");
		
		String mailSubject = fullname + " has sent a message";
		String mailContent = "Sender Name: " + fullname + "\n";
		mailContent += "Sender E-mail: " + email + "\n";
		mailContent += "Subject: " + subject + "\n";
		mailContent += "Content: " + content + "\n";
		
		mail.setMailSubject(mailSubject);
		mail.setMailContent(mailContent);
		mailService.sendEmail(mail);
		return "message";
	}
	
}
