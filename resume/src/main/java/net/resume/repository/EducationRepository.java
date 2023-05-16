package net.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.resume.model.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long>{

}
