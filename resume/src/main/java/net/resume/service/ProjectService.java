package net.resume.service;

import java.util.List;

import net.resume.model.Project;

public interface ProjectService {
	List<Project> findAllProject();
	
	Project saveProject(Project project);
	
	void deleteProjectById(Long Id);
}
