package com.example.entities;

public class Location {
	
	private  String type;
	private int[] coordinates;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String type, int[] coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(int[] coordinates) {
		this.coordinates = coordinates;
	}
	
	

}
