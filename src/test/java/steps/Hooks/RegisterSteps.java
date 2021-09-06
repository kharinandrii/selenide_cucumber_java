package steps.Hooks;

import UI.pages.HomePage;
import UI.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterSteps {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("Open register form")
    public void openRegisterForm() {
        homePage.clickOnRegiserLnk();
    }

    @Then("Input first name")
    public void inputFirstName() {
        registerPage.fillFirstName();
    }
}
