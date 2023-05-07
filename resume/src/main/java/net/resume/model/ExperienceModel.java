package net.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experience")
public class ExperienceModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "experience_id")
	private long experienceid;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "years_of_experince")
	private String yearsOfExperince;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "description")
	private String description;
	
	
	

	public ExperienceModel() {
		
	}

	public ExperienceModel(String companyName, String yearsOfExperince, String location, String description) {
		super();
		this.companyName = companyName;
		this.yearsOfExperince = yearsOfExperince;
		this.location = location;
		this.description = description;
	}

	
	public long getExperienceid() {
		return experienceid;
	}

	public void setExperienceid(long experienceid) {
		this.experienceid = experienceid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getYearsOfExperince() {
		return yearsOfExperince;
	}

	public void setYearsOfExperince(String yearsOfExperince) {
		this.yearsOfExperince = yearsOfExperince;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
