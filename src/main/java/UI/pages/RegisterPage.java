package UI.pages;

import UI.DataProvider.Params;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends Helper{
    Params params = new Params();

    final private SelenideElement firstNameField = $(By.xpath("//*[@id='input-firstname']")),
                                  lastNameField = $(By.xpath("//*[@id='input-lastname']")),
                                  emailField = $(By.xpath("//*[@id='input-email']")),
                                  passwordField = $(By.xpath("//*[@id='input-password']")),
                                  passwordConfirmField = $(By.xpath("//*[@id='input-confirm']")),
                                  agreeCheckbox = $(By.xpath("//*[@name='agree']")),
                                  phoneField = $(By.xpath("//*[@id='input-telephone']")),
                                  continueButton = $(By.xpath("//*[@value='Continue']"));



    public void fillFirstName() {
        String firstName = faker.name().firstName();;
        fillIn(firstNameField, firstName);
        myMap.put("firstName", firstName);
    }

    public void fillLastName() {
        String lastName = faker.name().firstName();;
        fillIn(lastNameField, lastName);
        myMap.put("lastName", lastName);
    }

    public void fillEmail() {
        String email = myMap.get("firstName") + myMap.get("lastName") + "@testmail.io";
        fillIn(emailField, email);
        myMap.put("email", email);
    }

    public void fillPassword() {
        fillIn(passwordField, params.PASSWORD);
    }

    public void fillPasswordConfirm() {
        fillIn(passwordConfirmField, params.PASSWORD);
    }

    public void clickOnAgree() {
        clickOn(agreeCheckbox);
    }

    public void fillPhone() {
        String phone = faker.phoneNumber().cellPhone();
        fillIn(phoneField, phone);
    }

    public void clickRegisterButton() {
        clickOn(continueButton);
    }
}
