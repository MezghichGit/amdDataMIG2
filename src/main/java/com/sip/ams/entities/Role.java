package com.sip.ams.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank; 
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    @Column(name = "role",unique=true)
    @NotBlank(message = "Name is mandatory")
    private String role;
	public Role(String role) {
		this.role = role;
	}
	
	public Role() {

	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}

