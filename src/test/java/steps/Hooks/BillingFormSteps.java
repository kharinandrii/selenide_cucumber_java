package steps.Hooks;

import UI.pages.BillingDetailsPage;
import io.cucumber.java.en.Then;

public class BillingFormSteps {

    BillingDetailsPage billingDetails = new BillingDetailsPage();

    @Then("fill name on billing form")
    public void fillNameOnBillingForm() {
        billingDetails.fillFirstName();
    }

    @Then("fill lastname")
    public void fillLastname() {
        billingDetails.fillLastName();
    }

    @Then("fill address")
    public void fillAddress() {
        billingDetails.fillAddress();
    }

    @Then("fill city")
    public void fillCity() {
        billingDetails.fillCity();
    }

    @Then("fill postcode")
    public void fillPostcode() {
        billingDetails.fillPostcode();
    }

    @Then("check country")
    public void checkCountry() {
        billingDetails.checkCountry();
    }

}
