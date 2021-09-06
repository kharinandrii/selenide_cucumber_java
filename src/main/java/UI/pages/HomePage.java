package UI.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.io.ByteOrderParser;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends Helper {

    SelenideElement lnkRegister = $(By.xpath("//*[text() = 'Register']"));
    SelenideElement sltMyAccount = $(By.xpath("//*[text() = 'My Account']"));

    public void clickOnRegiserLnk() {
        clickOn(sltMyAccount);
        clickOn(lnkRegister);
    }
}
