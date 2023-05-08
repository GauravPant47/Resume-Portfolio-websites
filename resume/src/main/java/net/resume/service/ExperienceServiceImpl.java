package net.resume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.resume.model.ExperienceModel;
import net.resume.repository.ExperienceRepository;

@Service
public class ExperienceServiceImpl implements ExperienceService {

//	@Autowired
	private ExperienceRepository experienceRepository;

	public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
		super();
		this.experienceRepository = experienceRepository;
	}

	@Override
	public List<ExperienceModel> findAllListItem() {
		return this.experienceRepository.findAll();
	}

}
