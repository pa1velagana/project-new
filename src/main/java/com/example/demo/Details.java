package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String message;
    private String email;
	private int phone_no;
   
    
    public Details(int id, String name, String message, String email, int phone_no) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
		this.email = email;
		this.phone_no = phone_no;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhoneNo() {
		return phone_no;
	}


	public void setPhoneNo(int phone_no) {
		this.phone_no = phone_no;
	}

    	 
    }
