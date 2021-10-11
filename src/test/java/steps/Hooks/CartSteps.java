package steps.Hooks;

import UI.pages.CartPage;
import io.cucumber.java.en.Then;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("check product name in cart")
    public void checkProductNameInCart() {
        cartPage.checkProductName();
    }
}
