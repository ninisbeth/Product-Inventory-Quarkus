package com.kineteco;

import com.kineteco.model.ProductInventory;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/products")
          .then()
             .statusCode(200)
             .body(is("Products inventory Nini up!"));
    }

    @Test
    public void testInventory() {
        ProductInventory productInventory=
                given().when().get("/products/KE180").then().statusCode(200).extract().body()
                .as(ProductInventory.class);

        Assertions.assertEquals("KE180", productInventory.getSku());
    }
}