package UI.pages;

import UI.DataProvider.Params;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YourStorePage extends Helper {
    Params params = new Params();
    final private SelenideElement headerText = $(By.xpath("//h1"));


    public void checkCongratulationsText() {
        checkTextIn(headerText, params.YOUR_STORE_H1);
    }
    //TODO продолжить с написания кода для проверки зоголовка
}
