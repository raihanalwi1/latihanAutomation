package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginPage;

public class LoginStep {
    @Steps
    loginPage lp;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        lp.openLogin();
    }

    @Then("I input username")
    public void iInputUsername() throws InterruptedException {
        lp.InputUsername();
        Thread.sleep(1000);
    }

    @And("I input password")
    public void iInputPassword() throws InterruptedException{
        lp.InputPassword();
        Thread.sleep(1000);
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        lp.ClickButtonLogin();
    }

    @When("I will go to the dashboard page")
    public void iWillGoToTheDashboardPage() {
        lp.ValidateDashboardHeader();
    }
}
