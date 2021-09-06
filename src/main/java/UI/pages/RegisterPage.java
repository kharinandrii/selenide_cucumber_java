package UI.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends Helper{

    final private SelenideElement firstNameField = $(By.xpath("//*[@id='input-firstname']")),
                                  lastNameField = $(By.xpath("//*[@id='input-lastname']")),
                                  emailField = $(By.xpath("//*[@id='input-email']"));



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
}
