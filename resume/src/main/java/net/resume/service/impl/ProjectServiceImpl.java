package net.resume.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.resume.exception.ResourceNotFoundException;
import net.resume.model.Project;
import net.resume.repository.ProjectRepository;
import net.resume.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> findAllProject() {
		// TODO Auto-generated method stub
		return this.projectRepository.findAll();
	}

	@Override
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

	@Override
	public void deleteProjectById(Long Id) {
		// TODO Auto-generated method stub
		Optional<Project> optional = this.projectRepository.findById(Id);
		
		if(optional.isPresent()) {
			this.projectRepository.delete(optional.get());
		}else {
			throw new ResourceNotFoundException("Project Record not found");
		}
		
	}

}
