package UI.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.io.ByteOrderParser;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends Helper {

    final private SelenideElement lnkRegister = $(By.xpath("//*[text() = 'Register']")),
            sltMyAccount = $(By.xpath("//*[text() = 'My Account']")),
            drobdownDesktop = $(By.xpath("//*[@id='menu']//*[@class='dropdown']/a[text()='Desktops']")),
            macProduct = $(By.xpath("//*[@id='menu']//*[@class='dropdown-menu']//*[contains(text(), 'Mac (')]"));

    public void clickOnRegiserLnk() {
        clickOn(sltMyAccount);
        clickOn(lnkRegister);
    }

    public void chooseMac() {
        clickOn(drobdownDesktop);
        clickOn(macProduct);

    }
}
