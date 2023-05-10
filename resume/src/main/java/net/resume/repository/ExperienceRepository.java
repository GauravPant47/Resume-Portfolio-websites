package net.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.resume.model.ExperienceModel;


public interface ExperienceRepository  extends JpaRepository<ExperienceModel, Long>{

}
