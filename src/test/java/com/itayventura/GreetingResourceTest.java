package com.itayventura;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

    @Test
    public void testProduct() {
        Product product = given()
                .when().get("/hello/world")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(Product.class);

        Assertions.assertEquals("Hello World", product.getName());
    }

}