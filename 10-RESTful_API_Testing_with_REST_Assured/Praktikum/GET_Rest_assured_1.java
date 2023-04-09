import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Test
public void testGetPost() {
        given().
        when().
        get("https://jsonplaceholder.typicode.com/posts/1").
        then().
        assertThat().
        statusCode(200).
        contentType(ContentType.JSON).
        body("id", equalTo(1)).
        body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
        body("userId", equalTo(1));
        }
