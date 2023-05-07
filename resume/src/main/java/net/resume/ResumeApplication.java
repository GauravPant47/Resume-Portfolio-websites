package net.resume;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.resume.repository.ExperienceRepository;

@SpringBootApplication
public class ResumeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ResumeApplication.class, args);
	}
	
	private ExperienceRepository experienceRepository;

	@Override
	public void run(String... args) throws Exception {
				
	}

}
