package com.example.demo.entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@SuppressWarnings("serial")
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private String username;

	    private String email;

	    private String password;

	    private boolean isAccountNonExpired;
	    private boolean isCredentialsNonExpired;
	    private boolean isAccountNonLocked;
	    private boolean enabled;

	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(name = "users_roles",
	            joinColumns = @JoinColumn(name = "user_id"),
	            inverseJoinColumns = @JoinColumn(name = "role_id"))
	    private Set<Role> authorities;

	    public User() {
	        this.setAuthorities(new HashSet<>());
	    }

	    
	    public Set<Role> getAuthorities() {
	        return authorities;
	    }

	    
	    public String getPassword() {
	        return password;
	    }

	    
	    public String getUsername() {
	        return username;
	    }


	    
	    public boolean isAccountNonLocked() {
	        return isAccountNonLocked;
	    }


	    
	    public boolean isEnabled() {
	        return enabled;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }



	    public void setAccountNonLocked(boolean accountNonLocked) {
	        isAccountNonLocked = accountNonLocked;
	    }

	    public void setEnabled(boolean enabled) {
	        this.enabled = enabled;
	    }

	    public void setAuthorities(Set<Role> authorities) {
	        this.authorities = authorities;
	    }

	    public void addRole(Role role) {
	        this.getAuthorities().add(role);
	    }

		
		public boolean isAccountNonExpired() {
			return isAccountNonExpired;
		}

		
		public boolean isCredentialsNonExpired() {
			return isCredentialsNonExpired;
		}
}
