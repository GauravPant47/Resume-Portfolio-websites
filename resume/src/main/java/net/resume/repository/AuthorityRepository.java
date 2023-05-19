package net.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.resume.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>{

}
