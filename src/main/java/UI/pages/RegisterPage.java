package UI.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage extends Helper{
    SelenideElement firstNameField = $(By.xpath("//*[@id='input-firstname']"));
    public void fillFirstName() {
    }
}
