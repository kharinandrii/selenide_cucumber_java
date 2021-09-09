package UI.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EditProfilePage extends Helper{

    final private SelenideElement firstNameField = $(By.xpath("//*[@id='input-firstname']")),
                                  lastNameField = $(By.xpath("//*[@id='input-lastname']")),
                                  emailField = $(By.xpath("//*[@id='input-email']")),
                                  phoneField = $(By.xpath("//*[@id='input-telephone']")) ;;

    public void checkFirstName() {
        String expectedText = myMap.get("firstName");
         checkValueIn(firstNameField, expectedText);
    }

    public void checkLastName() {
        String expectedText = myMap.get("lastName");
        checkValueIn(lastNameField, expectedText);
    }

    public void checkEmail() {
        String expectedText = myMap.get("email");
        checkValueIn(emailField, expectedText);
    }

    public void checkPhone() {
        String expectedText = myMap.get("phone");
        checkValueIn(phoneField, expectedText);
    }
}
