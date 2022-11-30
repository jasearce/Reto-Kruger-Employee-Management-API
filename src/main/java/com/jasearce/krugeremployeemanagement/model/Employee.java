package com.jasearce.krugeremployeemanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employees")
public class Employee {
	
	//Seccion inicial para el administrador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(name = "name")
	@Pattern(regexp = "^[a-zA-Z\u00f1]+(([',. ][a-zA-Z \u00f1])?[a-zA-Z\u00f1]*)*$")
	private String firstName;
	
	@NotNull
	@Column(name = "last_name")
	@Pattern(regexp = "^[a-zA-Z\u00f1]+(([',. ][a-zA-Z \u00f1])?[a-zA-Z\u00f1]*)*$")
	private String lastName;
	
	@Column(name = "personal_id", unique = true)
	@Pattern(regexp = "^[0-9]{10}$")
	private String personalId;
	
	@NotEmpty(message = "Email Address cannot be empty")
	@Column(name = "email", unique = true)
	@Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	private String emailId;
	
	//Campos adicionales para la modificacion del usuario
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "main_address")
	private String mainAddress;
	
	@Column(name = "tlf_number")
	private String tlfNumber;
	
	@Column(name = "vaccination_state")
	private Boolean isVaccinated;
	
	@Column(name = "vaccine_type")
	private String vaccineBrand;
	
	@Column(name = "vaccionation_date")
	private Date vaccinationDate;
	
	@Column(name = "dose_number")
	private Integer doseNumber;

	
	
	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(String mainAddress) {
		this.mainAddress = mainAddress;
	}

	public String getTlfNumber() {
		return tlfNumber;
	}

	public void setTlfNumber(String tlfNumber) {
		this.tlfNumber = tlfNumber;
	}

	public Boolean getIsVaccinated() {
		return isVaccinated;
	}

	public void setIsVaccinated(Boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public String getVaccineBrand() {
		return vaccineBrand;
	}

	public void setVaccineBrand(String vaccineBrand) {
		this.vaccineBrand = vaccineBrand;
	}

	public Date getVaccinationDate() {
		return vaccinationDate;
	}

	public void setVaccinationDate(Date vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}

	public Integer getDoseNumber() {
		return doseNumber;
	}

	public void setDoseNumber(Integer doseNumber) {
		this.doseNumber = doseNumber;
	}
	
	@Override
	public String toString() {
		return "Employee [id =" + id + ", Name: " + firstName + " " + lastName + ", Personal Id: " + personalId + ", Email: " + emailId + "]";
		
	}
	
}
