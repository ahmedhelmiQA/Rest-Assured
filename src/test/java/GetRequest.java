import io.restassured.RestAssured;

import org.testng.annotations.Test;
import io.restassured.matcher.RestAssuredMatchers;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;


public class GetRequest {
  /*
    public static void main(String[] args) {

        RestAssured
                .given().baseUri("https://reqres.in/api/users")
                .queryParam("page","1")
                .when().get().prettyPrint();
     }

   */
    @Test
    public void Gettest(){
      given()
        .when()
        .then();
    }

}
