package net.resume.service;

import java.util.List;
import java.util.Optional;

import net.resume.model.ExperienceModel;

public interface ExperienceService {
	List<ExperienceModel> findAllListPost();

	Optional<ExperienceModel> searchByID(Long id);

	ExperienceModel savePost(ExperienceModel experienceModel);
	void deleteById(Long Id);
}
