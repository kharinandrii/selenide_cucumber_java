package UI.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.open;

public class Helper {
    public void clickOn(SelenideElement element) {
        element.click();
    }

}
