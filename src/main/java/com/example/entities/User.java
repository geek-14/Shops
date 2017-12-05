package com.example.entities;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String id;

	private String city;
	private Location location;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String city, Location location) {
		super();
		this.city = city;
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
