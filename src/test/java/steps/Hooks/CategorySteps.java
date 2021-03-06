package steps.Hooks;

import UI.pages.CategoryPage;
import io.cucumber.java.en.Then;

public class CategorySteps {

    CategoryPage categoryPage = new CategoryPage();

    @Then("add Mac to cart")
    public void addMacToCart() {
        categoryPage.addMacToCartAndGetTitle();
    }

    @Then("check success message for category page")
    public void checkSuccessMessageForCategoryPage() {
        categoryPage.checkSuccessMessage();
    }

    @Then("open cart")
    public void openCart() {
        categoryPage.openCart();
    }
}
