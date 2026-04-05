package com.herokuapp.booker.restful;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestfulbookerTest {

    public String token;
    public String bookingid;

    @Test(priority = 1)
    public void CreateToken() {
        Response response = RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"username\" : \"admin\",\n" +
                        "    \"password\" : \"password123\"\n" +
                        "}")
                .post("/auth")
                .then()
                .log()
                .all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        token = response.jsonPath().getString("token");
        System.out.printf("token: " + token);
    }

    @Test(priority = 2)
    public void CreateBooking() {
        Response response = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + token)
                .body("{\n" +
                        "    \"firstname\" : \"Jim\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .log().all()
                .post("/booking")
                .then()
                .log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        bookingid = response.jsonPath().getString("bookingid");
        System.out.printf("token: " + bookingid);
    }

    @Test(priority = 3, dependsOnMethods = "CreateBooking")
    public void GetBookingById() {
        Response response = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + token).log().all()
                .get("/booking/" + bookingid)
                .then()
                .log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        bookingid = response.jsonPath().getString("bookingid");
        System.out.printf("token: " + bookingid);
    }

    @Test(priority = 4)
    public void GetAllBookingById() {
        Response response = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + token).log().all()
                .get("/booking/")
                .then()
                .log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 5, dependsOnMethods = {"CreateBooking", "CreateToken"})
    public void UpdateBooking() {
        Response response = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + token)
                .body("{\n" +
                        "    \"firstname\" : \"Jim\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .log().all()
                .put("/booking/" + bookingid)
                .then()
                .log().all().extract().response();
    }

    @Test(priority = 6, dependsOnMethods = {"CreateBooking", "CreateToken"})
    public void PartialUpdateBooking() {
        Response response = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + token)
                .body("{\n" +
                        "    \"firstname\" : \"James\",\n" +
                        "    \"lastname\" : \"Brown\"\n" +
                        "}")
                .log().all()
                .patch("/booking/" + bookingid)
                .then()
                .log().all().extract().response();
    }

    @Test(priority = 7, dependsOnMethods = {"CreateBooking", "CreateToken"})
    public void DeleteBooking() {
        Response response = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + token).log().all()
                .delete("/booking/" + bookingid)
                .then()
                .log().all().extract().response();
    }
}
