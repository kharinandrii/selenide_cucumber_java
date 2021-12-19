package steps.Hooks;

import UI.pages.CartPage;
import io.cucumber.java.en.Then;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("check product name in cart")
    public void checkProductNameInCart() {
        cartPage.checkProductName();
    }

    @Then("check product quantity")
    public void checkProductQuantity() {
        cartPage.checkQuantity("1");
    }

    @Then("click on Checkout")
    public void clickOnCheckout() {
        cartPage.clickOnCheckout();
    }
}
