package com.rest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimplePostTest {

	@Test
	public void registration() {
		RestAssured.baseURI = "https://restapi.demoqa.com/customer";
		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Priya");
		requestParams.put("LastName", "Das");
		requestParams.put("UserName", "simpleuser002");
		requestParams.put("Password", "password123");
		requestParams.put("Email", "someuser@gmail.com");
		request.header("Content-Type", "application/json");
		request.body(requestParams.toString());
		Response response = request.post("/register");
		int statusCode = response.getStatusCode();
		System.out.print(statusCode);
		Assert.assertEquals(statusCode, "201");
	}

}
