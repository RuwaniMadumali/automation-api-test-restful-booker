package com.herokuapp.restfulbooker;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BasicAuthTest {

    //Creates a new auth token to use for access to the PUT and DELETE /booking

    String BASE_ENDPOINT ="https://restful-booker.herokuapp.com";
    String PAY_LOAD= "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    @Test
    public void testBasicAuth() {
        given().log().headers()
                .header("Content-Type","application/json")
                .body(PAY_LOAD)
                .when()
                .post(BASE_ENDPOINT+"/auth")
                //.then().log().body()
                .then().log().all()
                .statusCode(200)
                ;
    }

}
