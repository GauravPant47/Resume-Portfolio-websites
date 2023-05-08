package net.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.resume.model.ExperienceModel;
import net.resume.repository.ExperienceRepository;

@SpringBootApplication
public class ResumeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ResumeApplication.class, args);
	}
	
	
	@Autowired
	private ExperienceRepository experienceRepository;

	
	@Override
	public void run(String... args) throws Exception {
			ExperienceModel experienceModel1 = new ExperienceModel("Ongrid", "1.6-Years", "Gurugram", "This is a Back ground company");
			experienceRepository.save(experienceModel1);
	}

}
