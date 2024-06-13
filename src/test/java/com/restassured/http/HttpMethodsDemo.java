package com.restassured.http;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HttpMethodsDemo {
	
//	public static void main(String[] args) {
//		RestAssured.baseURI = "https://business-api-no-auth.onrender.com";
//		given().when().post("/businesses").then().statusCode(200);
//	}
	
//	public static void main(String[] args) throws JsonProcessingException {
//		RestAssured.baseURI = "https://business-api-no-auth.onrender.com";
//		Faker faker = new Faker();
//		for(int i = 0 ; i< 5; i++) {
//			String name = faker.company().name()+" Pvt Ltd";
//			String Description = faker.company().catchPhrase();
//			Business mahindra = new Business(name, Description);
//			ObjectMapper mapper = new ObjectMapper();
//			Header header = new Header("Content-Type", "application/json");
//			int status = given().header(header).body(mapper.writeValueAsString(mahindra)).when().post("/businesses").getStatusCode();
//			System.out.println(status);
//		}
//	}
	
//	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
//		String data = "{\r\n"
//				+ "        \"displayName\": \"Tesla\",\r\n"
//				+ "        \"description\": \"A leading EV manufacturing Company.\"\r\n"
//				+ "}";
//		ObjectMapper mapper = new ObjectMapper();
//		Business b = mapper.readValue(data, Business.class);
//		System.out.println(b.getName());
//	}
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://business-api-no-auth.onrender.com";
		Response response = given().when().get("/businesses/1");
		JsonPath path = new JsonPath(response.asString());
		System.out.println(path.getString("description"));
	}
}
