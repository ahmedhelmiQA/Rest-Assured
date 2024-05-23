import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Log {
  /*  @Test
    public void Logging() {
        given().baseUri("https://664378116c6a656587073399.mockapi.io/api/v1")
                //.log().all()
                //.log().method()
                .when().get("Users")
                .then()
        //.log().body()
        // .log().status()
        ;
    }
   */
   /* @Test
    public void IfError() {
        given().baseUri("https://664378116c6a656587073399.mockapi.io/api/v1")
        // ("https://664378116c6a656587073399.mockapi.io/api/") error 404
        .when().get("Users")
        .then().log().ifError();
    }
    */
    @Test
    public void IfValidationError(){
        given().baseUri("https://664378116c6a656587073399.mockapi.io/api/v1")
                //.log().ifValidationFails()
       .when().get("Users")
        .then().log().ifValidationFails()
       .body("[0].name", equalTo("Denis4444"));
    }
}
