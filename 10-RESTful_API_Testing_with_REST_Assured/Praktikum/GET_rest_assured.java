import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Test
public void testGetPosts() {
        given().
        when().
        get("https://jsonplaceholder.typicode.com/posts").
        then().
        assertThat().
        statusCode(200).
        contentType(ContentType.JSON).
        body("size()", greaterThan(0));
        }
