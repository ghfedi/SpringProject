package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="admin")
public class Admin {

	 @Id
	  	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	 
	 	private String firstName;

	    private String lastName;
   
	    @OneToOne(optional = false)
	    @JoinColumn(name = "user_id", referencedColumnName = "id")
	    private User user;
	    
	    public Admin() {}
	    
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
	    
	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }


	    
}
