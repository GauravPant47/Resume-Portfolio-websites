package net.resume.service;

import java.util.List;

import net.resume.model.Education;

public interface EducationService {
	
	List<Education> findAllListPost();
	
	Education savePost(Education education);

	

}
