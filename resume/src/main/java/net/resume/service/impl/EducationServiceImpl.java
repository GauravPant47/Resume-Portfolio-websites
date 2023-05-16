package net.resume.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.resume.exception.ResourceNotFoundException;
import net.resume.model.Education;
import net.resume.repository.EducationRepository;
import net.resume.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService {
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

	@Override
	public void deletePostById(Long Id) {
		// TODO Auto-generated method stub
		Optional<Education> optional = this.educationRepository.findById(Id);

		if (optional.isPresent()) {
			this.educationRepository.delete(optional.get());
		} else {
			throw new ResourceNotFoundException("Project Record not found");
		}
	}

}
