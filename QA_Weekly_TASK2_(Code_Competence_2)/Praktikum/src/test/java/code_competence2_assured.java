import com.sun.org.apache.bcel.internal.generic.PUTFIELD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;
import org.asynchttpclient.Response;
import org.hamcrest.text.IsEmptyString;

public class code_competence2_assured {
    String basURL = "https://fakestoreapi.com/auth/login";

    @Given("user call an api {string} with method {string}")
    public void callapi(Actor actor, String path, String method) {
        actor.whoCan(CallAnApi.at(basURL));
        switch (method) {
            case "GET":
                actor.attemptsTo(Get.resource(path));
                break;
            case "POST":
                actor.attemptsTo(Post.to(path));
                break;
            case "PUT":
                actor.attemptsTo(Put.to(path));
                break;
            case "DELETE":
                actor.attemptsTo(Delete.from(path));
                break;
            default:
                throw new IllegalStateException("unknow method");
        }

    }


    }


