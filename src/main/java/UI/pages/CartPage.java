package UI.pages;

import UI.DataProvider.Params;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends Helper{
    Params params = new Params();

    final private SelenideElement productName = $(By.xpath("//*[@id='content']//td[@class='text-left']/a"));

    public void checkProductName() {
        String expectedName = myMap.get("productName");
        checkTextIn(productName, expectedName);
    }
}

//TODO продолжить с работы с товаром в корзине

