package UI.pages;

import UI.DataProvider.Params;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage extends Helper {
    private final SelenideElement productName = $(By.xpath("//h4/a")),
            addToCart = $(By.xpath("//*[text()='Add to Cart']")),
            SuccessMessage = $(By.xpath("//*[contains(@class,'alert-success')]")),
            cartLnk = $(By.xpath("//a[text()='shopping cart']"));

    Params params = new Params();


    public void addMacToCartAndGetTitle() {
        String name = getTextIn(productName);
        clickOn(addToCart);
        myMap.put("productName", name);
    }

    public void checkSuccessMessage() {
        checkTextIn(SuccessMessage, params.SUCCESS_MESSAGE_IN_CATEGORY);

    }

    public void openCart() {
        clickOn(cartLnk);
    }
}
