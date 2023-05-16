package net.resume.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.resume.model.Education;
import net.resume.repository.EducationRepository;
import net.resume.service.EducationService;
@Service
public class EducationServiceImpl implements EducationService{
	@Autowired
	private EducationRepository educationRepository;
	

	@Override
	public List<Education> findAllListPost() {
		// TODO Auto-generated method stub
		return this.educationRepository.findAll();
	}

	@Override
	public Education savePost(Education education) {
		// TODO Auto-generated method stub
		return educationRepository.save(education);
	}

}
