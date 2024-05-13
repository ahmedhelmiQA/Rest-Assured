import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class GetRequest {
    public static void main(String[] args) {
        RestAssured
                .given().baseUri("https://reqres.in/api/users")
                .queryParam("page","1")
                .when().get().prettyPrint();
    }
}
