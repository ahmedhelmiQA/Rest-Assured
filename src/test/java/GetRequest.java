import io.restassured.RestAssured;

import org.testng.annotations.Test;
import io.restassured.matcher.RestAssuredMatchers;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;


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
      given().baseUri("https://664378116c6a656587073399.mockapi.io/api/v1")
        .when().get("Users")
        .then()
       .log().all()
       .assertThat().statusCode(200)
       .assertThat().body("[0].name", is(equalTo("Courtney Oberbrunner")))
       .assertThat().body(".name",hasItem("Mrs. Cindy Green"));
    }

}
