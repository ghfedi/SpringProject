package com.example.demo.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "appointments")
public class Appointment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private Date date;

	    @ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patient;

	    @ManyToOne
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctor;

	    @Enumerated(value = EnumType.STRING)
	    private AppointmentType appointmentType;

	    private String description;

	    public Appointment() {
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    public Patient getPatient() {
	        return patient;
	    }

	    public void setPatient(Patient patient) {
	        this.patient = patient;
	    }

	    public Doctor getDoctor() {
	        return doctor;
	    }

	    public void setDoctor(Doctor doctor) {
	        this.doctor = doctor;
	    }

	    public AppointmentType getAppointmentType() {
	        return appointmentType;
	    }

	    public void setAppointmentType(AppointmentType appointmentType) {
	        this.appointmentType = appointmentType;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

}
