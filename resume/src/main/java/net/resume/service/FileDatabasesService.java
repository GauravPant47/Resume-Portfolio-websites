package net.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import net.resume.exception.FileNotFoundException;
import net.resume.exception.FileStorageException;
import net.resume.model.FilesInDatabases;
import net.resume.repository.FileRepository;

@Service
public class FileDatabasesService {

	@Autowired
	private FileRepository fileRepository;

	public FilesInDatabases storeFile(MultipartFile file) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			FilesInDatabases databases = new FilesInDatabases(fileName, file.getContentType(), file.getBytes());
			return fileRepository.save(databases);
		} catch (Exception e) {
			// TODO: handle exception
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", e);
		}
	}

	public FilesInDatabases getFile(String fileId) {
		return fileRepository.findById(fileId)
				.orElseThrow(() -> new FileNotFoundException("File not found with id " + fileId));
	}
}
