package net.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.resume.model.ExperienceModel;
import net.resume.repository.ExperienceRepository;

@SpringBootApplication
public class ResumeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ResumeApplication.class, args);
	}

	@Autowired
	private ExperienceRepository experienceRepository;

	@Override
	public void run(String... args) throws Exception {
		// ExperienceModel experienceModel1 = new ExperienceModel("Operations Analyst",
		// "OnGrid - Background verification platform", "Gurugram, Haryana, India", "1
		// year 9 months",
		// "My responsibilities for this company were Field Onboarding, Field management
		// and Cluster Checking, Daily Data Dump Generation, Data Assignment, and Data
		// Entry");
		// experienceRepository.save(experienceModel1);
	}

}
