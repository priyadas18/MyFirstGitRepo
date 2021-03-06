package com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {
	@Test
	public void GetWeatherDetails() {
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.queryParam("q", "value").get("/Hyderbad");
		response.prettyPrint();
		int statusCode = response.getStatusCode();
		String statusLine = response.getStatusLine();
		String headerServer = response.header("Server");
		String headerType = response.header("Content-Type");
		JsonPath jsoneval = response.jsonPath();
		String temp = jsoneval.get("Temperature");
		System.out.println(temp);
		System.out.println(headerType);

	}

}
