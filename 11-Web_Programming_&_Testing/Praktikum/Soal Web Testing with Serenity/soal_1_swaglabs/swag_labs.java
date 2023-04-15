package starter.stepdefinitions;

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
public class swag_labs {
    @Given("user input correct username {string} and password {string}")
    public void userInputCorrectUsernameAndPassword(String arg0, String arg1) {
        System.out.println("testing selesai berjalan");
    }

    @Then("user can login")
    public void userCanLogin() {
        System.out.println("testing selesai berjalan");
    }

    @Given("user input username {string} and password {string}")
    public void userInputUsernameAndPassword(String arg0, String arg1) {
        System.out.println("testing selesai berjalan");
    }

    @Then("user cannot login, username wrong")
    public void userCannotLoginUsernameWrong() {
        System.out.println("testing selesai berjalan");
    }

    @Then("user cannot login, user unindentified")
    public void userCannotLoginUserUnindentified() {
        System.out.println("testing selesai berjalan");
    }


    @Given("user choose add to chart")
    public void userChooseAddToChart() {
        System.out.println("testing selesai berjalan");
    }

    @Then("product inside cart product")
    public void productInsideCartProduct() {
        System.out.println("testing selesai berjalan");
    }

    @Given("user choose cart product icon")
    public void userChooseCartProductIcon() {
        System.out.println("testing selesai berjalan");
    }

    @Then("user can see product description")
    public void userCanSeeProductDescription() {
        System.out.println("testing selesai berjalan");
    }

    @Given("user choose remove item button")
    public void userChooseRemoveItemButton() {
        System.out.println("testing selesai berjalan");
    }

    @Then("product is removed")
    public void productIsRemoved() {
        System.out.println("testing selesai berjalan");
    }

    @Given("user choose checkout")
    public void userChooseCheckout() {
        System.out.println("testing selesai berjalan");
    }

    @Then("product is checkout")
    public void productIsCheckout() {
        System.out.println("testing selesai berjalan");
    }

    @Given("user input information")
    public void userInputInformation() {
        System.out.println("testing selesai berjalan");
    }

    @Then("user information is add")
    public void userInformationIsAdd() {
        System.out.println("testing selesai berjalan");
    }

    @Given("user choose continue")
    public void userChooseContinue() {
        System.out.println("testing selesai berjalan");
    }

    @Then("user is given shipping information page")
    public void userIsGivenShippingInformationPage() {
        System.out.println("testing selesai berjalan");
    }

    @Given("information granted as user")
    public void informationGrantedAsUser() {
        System.out.println("testing selesai berjalan");
    }

    @Then("user verified")
    public void userVerified() {
        System.out.println("testing selesai berjalan");
    }

    @Given("user choose finish")
    public void userChooseFinish() {
        System.out.println("testing selesai berjalan");
    }

    @Then("user confirmation code")
    public void userConfirmationCode() {
        System.out.println("testing selesai berjalan");
    }
}
