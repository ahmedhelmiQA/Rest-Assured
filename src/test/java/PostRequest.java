import io.restassured.RestAssured;

public class PostRequest {
    public static void main(String[] args) {
        RestAssured

                .given().baseUri("https://reqres.in/api/users")
                .header("Content-Type","application/json")
                .body("{\"name\": \"ahmed\", \"job\": \"leader\"}")
                .when().post()
                .prettyPrint();
    }
}
