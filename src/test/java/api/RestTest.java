package api;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestTest {
    @Test
    public void getAnimals() {
        given()
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/pet/findByStatus?status=pending")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);
    }
}
