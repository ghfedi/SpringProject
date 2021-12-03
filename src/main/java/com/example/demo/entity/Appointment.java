package com.example.demo.entity;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "appointments")
@Getter@Setter
public class Appointment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private LocalDateTime date;
	    @OneToOne(mappedBy = "appointment",cascade = CascadeType.REMOVE)
	    private Consultation consultation;
	    @ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patient;

	    @ManyToOne
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctor;

	    @Enumerated(value = EnumType.STRING)
	    private AppointmentType appointmentType = AppointmentType.ONLINE;

	    private String description;
	    private Boolean payed;
	    
	    @Enumerated(value = EnumType.STRING)
	    private PayementType payementType;

	    public void setPayementType(PayementType type) {
	    	if(this.appointmentType==AppointmentType.ONLINE)
	    			type=PayementType.ONLINEPAYEMENT;
	    }

	    public Appointment() {
	    }

	  

}
