package com.example.client.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Client {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String clientname;
    private String principlecontact;
    private String email;
    private String address;
    private String location;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long id, String clientname, String principlecontact, String email, String address, String location) {
		super();
		this.id = id;
		this.clientname = clientname;
		this.principlecontact = principlecontact;
		this.email = email;
		this.address = address;
		this.location = location;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getPrinciplecontact() {
		return principlecontact;
	}
	public void setPrinciplecontact(String principlecontact) {
		this.principlecontact = principlecontact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    
    
	
	
}
