package steps.Hooks;

import UI.pages.HomePage;
import UI.pages.RegisterPage;
import UI.pages.YourStorePage;
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

    @Then("user input last name")
    public void userInputLastName() {
        registerPage.fillLastName();
    }

    @Then("user input email")
    public void inputEmail() {
        registerPage.fillEmail();
    }
    @Then("Input password")
    public void inputPassword() {
        registerPage.fillPassword();
    }

    @Then("Input password comfirm")
    public void inputPasswordComfirm() {
        registerPage.fillPasswordConfirm();
    }

    @Then("click on checkbox")
    public void clickOnCheckbox() {
        registerPage.clickOnAgree();
    }

    @Then("user input phone")
    public void userInputPhone() {
        registerPage.fillPhone();
    }

    @Then("click on Continue button")
    public void clickOnRegisterButton() {
        registerPage.clickRegisterButton();
    }
}
