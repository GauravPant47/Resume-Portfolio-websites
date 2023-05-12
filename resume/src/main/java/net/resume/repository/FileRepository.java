package net.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.resume.model.FilesInDatabases;

public interface FileRepository extends JpaRepository<FilesInDatabases, String>{

}
