package UI.pages;

import UI.DataProvider.Params;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends Helper{
    Params params = new Params();

    final private SelenideElement productName = $(By.xpath("//*[@id='content']//td[@class='text-left']/a")),
            quantityField = $(By.xpath("//*[contains(@name,'quantity')]")),
            checkoutBtn = $(By.xpath("//*[contains(@class,'buttons')]//a[text()='Checkout']"));

    public void checkProductName() {
        String expectedName = myMap.get("productName");
        checkTextIn(productName, expectedName);
    }

    public void checkQuantity(String value) {
        checkValueIn(quantityField, value);
    }
    public void clickOnCheckout() {
        clickOn(checkoutBtn);
    }
}

//TODO продолжить с работы с товаром в корзине

