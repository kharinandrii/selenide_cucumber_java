package steps.Hooks;

import UI.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeSteps {
    HomePage homePage = new HomePage();
    @Then("choose Mac in desktop category")
    public void chooseMacInDesktopCategory() {
        homePage.chooseMac();
    }
}
