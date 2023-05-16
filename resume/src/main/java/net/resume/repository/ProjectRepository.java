package net.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.resume.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
