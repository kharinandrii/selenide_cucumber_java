package UI.pages;

import UI.DataProvider.Params;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage extends Helper {
   private final SelenideElement addToCart = $(By.xpath("//*[text()='Add to Cart']")),
                                 SuccessMessage = $(By.xpath("//*[contains(@class,'alert-success')]")),
                                 successPageLink1 = $(By.xpath("//*[contains(@class,'alert-success')]/a[1]"));

   Params params = new Params();

    public void addMacToCart() {
        clickOn(addToCart);
    }

    public void checkSuccessMessage() {
        checkTextIn(SuccessMessage, params.SUCCESS_MESSAGE_IN_CATEGORY);

    }
    //TODO продолжить с работы с товаром в корзине
}
