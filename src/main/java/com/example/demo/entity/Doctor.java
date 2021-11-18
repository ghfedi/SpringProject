package com.example.demo.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "doctors")
public class Doctor {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private String firstName;

	    private String lastName;

	   
	    private String gender;


	    private String telephoneNumber;

	    private Date dateOfBirth;

	    private Date startPracticeDate;


	    private String address;

	    private String description;

	    private String picturePath;

	  



	    @OneToOne(optional = false)
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;

	    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "doctor")
	    private Set<Patient> patients;

	    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "doctor")
	    private Set<Appointment> appointments;

	    public Doctor() {
	        this.setPatients(new HashSet<>());
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
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

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }


	    public String getTelephoneNumber() {
	        return telephoneNumber;
	    }

	    public void setTelephoneNumber(String telephoneNumber) {
	        this.telephoneNumber = telephoneNumber;
	    }

	    public Date getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(Date dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public Date getStartPracticeDate() {
	        return startPracticeDate;
	    }

	    public void setStartPracticeDate(Date startPracticeDate) {
	        this.startPracticeDate = startPracticeDate;
	    }


	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }



	    public String getPicturePath() {
	        return picturePath;
	    }

	    public void setPicturePath(String picturePath) {
	        this.picturePath = picturePath;
	    }




	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public Set<Patient> getPatients() {
	        return patients;
	    }

	    public void setPatients(Set<Patient> patients) {
	        this.patients = patients;
	    }

}
