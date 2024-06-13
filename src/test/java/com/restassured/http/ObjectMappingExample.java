package com.restassured.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMappingExample {
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Business mahindra = new Business("Mahindra Corp", "Leading Automobile giant");
		System.out.println(mahindra.toString());
		System.out.println("----------------------------------");
		System.out.println(mapper.writeValueAsString(mahindra));
	}
}
