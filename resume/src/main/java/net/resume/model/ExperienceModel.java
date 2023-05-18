package net.resume.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "experience")
public class ExperienceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "company_name")
	private String companyname;

	@Column(name = "location")
	private String location;

	@Column(name = "working_year")
	private String workingyear;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
	private Account account;

	public ExperienceModel() {
		super();
	}

	public ExperienceModel(String title, String companyname, String location, String workingyear, String description,
			Account account) {
		super();
		this.title = title;
		this.companyname = companyname;
		this.location = location;
		this.workingyear = workingyear;
		this.description = description;
		this.account = account;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWorkingyear() {
		return workingyear;
	}

	public void setWorkingyear(String workingyear) {
		this.workingyear = workingyear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}