package com.restassured.http;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Business {
	
	@JsonProperty("displayName")
	private String name;
	private String description;
	
	public Business() {
		
	}
	
	public Business(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Business [name=" + name + ", description=" + description + "]";
	}
	
	
}
