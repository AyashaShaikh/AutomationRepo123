package BaicAPITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Update_Record {
	//same copied from create

	@Test
	public void test1()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/71739";//change create to update and put the id 
		
		RequestSpecification request = RestAssured.given();//to give req
		JSONObject requestParams = new JSONObject();//parameter in jason form
		requestParams.put("name", "Janu786");//change name
		requestParams.put("salary", "240000");
		requestParams.put("age", "29");
		request.header("Content-Type", "application/json");//header postman
		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());//obj convert into string
		
		// Post the request and check the response
		Response response = request.request(Method.PUT);//change post to put
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		JsonPath jsonPathEvaluator = response.jsonPath();//to see id
		String id = jsonPathEvaluator.get("id");
		
		System.out.println(id);
			
	}

}
