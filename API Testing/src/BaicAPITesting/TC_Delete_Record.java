package BaicAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Delete_Record {
	@Test
	public void test1()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/delete/71739";//specify the  delete
		RequestSpecification request = RestAssured.given();//impor request specification what given is return after mouse hovering
		request.header("Content-Type", "application/json");
		Response response = request.request(Method.DELETE);//change method to delete
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(response.asString());
	}

}
