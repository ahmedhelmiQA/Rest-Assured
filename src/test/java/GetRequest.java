import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import io.restassured.matcher.RestAssuredMatchers;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static java.util.function.Predicate.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.*;
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
   /*@Test
    public void Response-Assertions(){
      given().baseUri("https://664378116c6a656587073399.mockapi.io/api/v1")
        .when().get("Users")
        .then()
       .log().all()
       .assertThat().statusCode(200)
       .assertThat().body("[0].name", is(equalTo("Denise Cummerata")))
      // .assertThat().body("name",hasItem("Katherine Schamberger"))
      // .assertThat().body("name",hasItems("Katherine Schamberger","Edna Haag"))
      // .assertThat().body("name",Matchers.not(hasItem("Kathe Schamberger")))
      // .assertThat().body("name",contains("Denise Cummerata", "Katherine Schamberger", "Angelina Langosh", "Fannie Swaniawski PhD", "Edna Haag"))
      //.assertThat().body("name",containsInAnyOrder("Katherine Schamberger","Denise Cummerata",  "Angelina Langosh", "Fannie Swaniawski PhD", "Edna Haag"))
      //.assertThat().body("name",empty())
      // .assertThat().body("name",is(Matchers.not(empty())))
      // .assertThat().body("name",hasSize(5))
      // .assertThat().body("name.size()",equalTo(5))
      // .assertThat().body("createdAt",everyItem(startsWith("2024")))
      //.assertThat().body("id",everyItem(startsWith("1")))
      //.assertThat().body("[0]",hasKey("id"))
      //.assertThat().body("[0]",hasKey("country"))
      //.assertThat().body("[0]",hasValue("Denar"))
      //.assertThat().body("[0]",hasValue("Denise Cummerata"))
      //.assertThat().body("[0]",hasEntry("name","Denise Cummerata"));
     }
     */
    @Test
    public void ResponseExtrack(){
        String name = given().baseUri("https://664378116c6a656587073399.mockapi.io/api/v1")
                .when().get("Users")
                .then().extract().response().path("[0].name");
                  /// extract the full response //
                //System.out.println(res.asString());

               //  String name = res.path("[0].name"); // extract an item
                // System.out.println(name);

            // String name = JsonPath.from(res.asString()).getString("[0].name");
              System.out.println(name);

    }
}
