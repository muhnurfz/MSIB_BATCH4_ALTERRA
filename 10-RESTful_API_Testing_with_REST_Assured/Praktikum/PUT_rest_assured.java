import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Test
public void testUpdatePost() {
        String requestBody = "{\"id\": 1, \"title\": \"Updated Title\", \"body\": \"Updated Body\", \"userId\": 1}";

        given().
        contentType(ContentType.JSON).
        body(requestBody).
        when().
        put("https://jsonplaceholder.typicode.com/posts/1").
        then().
        assertThat().
        statusCode(200).
        body("id", equalTo(1)).
        body("title", equalTo("Updated Title")).
        body("body", equalTo("Updated Body")).
        body("userId", equalTo(1));
        }
