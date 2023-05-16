package net.resume.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.resume.exception.ResourceNotFoundException;
import net.resume.model.ExperienceModel;
import net.resume.model.Project;
import net.resume.repository.ExperienceRepository;
import net.resume.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService {

	@Autowired
	private ExperienceRepository experienceRepository;

	@Override
	public List<ExperienceModel> findAllListPost() {
		return this.experienceRepository.findAll();
	}

	@Override
	public Optional<ExperienceModel> searchByID(Long id) {
		// TODO Auto-generated method stub
		return experienceRepository.findById(id);
	}

	@Override
	public ExperienceModel savePost(ExperienceModel experienceModel) {
		// TODO Auto-generated method stub
		return experienceRepository.save(experienceModel);
	}

	@Override
	public void deleteById(Long Id) {
		// TODO Auto-generated method stub
		Optional<ExperienceModel> optional = this.experienceRepository.findById(Id);

		if (optional.isPresent()) {
			this.experienceRepository.delete(optional.get());
		} else {
			throw new ResourceNotFoundException("Project Record not found");
		}
	}

}
