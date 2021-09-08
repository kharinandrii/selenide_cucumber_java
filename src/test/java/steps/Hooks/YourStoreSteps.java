package steps.Hooks;

import UI.pages.YourStorePage;
import io.cucumber.java.en.Then;

public class YourStoreSteps {
    YourStorePage yourStorePage = new YourStorePage();

    @Then("check on Your store page")
    public void checkOnYourStorePage() {
        yourStorePage.checkCongratulationsText();
    }

    @Then("open edit profile form")
    public void openEditProfileForm() {
        yourStorePage.openEditProfile();
    }
}
