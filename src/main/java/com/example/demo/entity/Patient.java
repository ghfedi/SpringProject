package com.example.demo.entity;
import java.util.Date;
import javax.persistence.*;



@Entity
@Table (name="patients")
public class Patient {

	 @Id
	  	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private String firstName;

	    private String lastName;

	    private String telephoneNumber;

	    private Date dateOfBirth;

	    private Date dateOfEnrollment;

	    private String gender;


	    @OneToOne(optional = false)
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctor;

	    public Patient() {
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

	    public Date getDateOfEnrollment() {
	        return dateOfEnrollment;
	    }

	    public void setDateOfEnrollment(Date dateOfEnrollment) {
	        this.dateOfEnrollment = dateOfEnrollment;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }


	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public Doctor getDoctor() {
	        return doctor;
	    }

	    public void setDoctor(Doctor doctor) {
	        this.doctor = doctor;
	    }
}
