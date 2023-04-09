import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Test
public void testCreatePost() {
        String requestBody = "{\"title\": \"Test Title\", \"body\": \"Test Body\", \"userId\": 1}";

        given().
        contentType(ContentType.JSON).
        body(requestBody).
        when().
        post("https://jsonplaceholder.typicode.com/posts").
        then().
        assertThat().
        statusCode(201).
        body("title", equalTo("Test Title")).
        body("body", equalTo("Test Body")).
        body("userId", equalTo(1));
        }
