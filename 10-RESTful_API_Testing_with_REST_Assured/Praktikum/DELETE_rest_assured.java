import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Test
public void testDeletePost() {
        given().
        when().
        delete("https://jsonplaceholder.typicode.com/posts/1").
        then().
        assertThat().
        statusCode(200);

        given().
        when().
        get("https://jsonplaceholder.typicode.com/posts/1").
        then().
        assertThat().
        statusCode(404);
        }
