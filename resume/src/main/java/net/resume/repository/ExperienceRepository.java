package net.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.resume.model.ExperienceModel;

@Repository
public interface ExperienceRepository  extends JpaRepository<ExperienceModel, Long>{

}
