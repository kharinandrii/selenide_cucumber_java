package steps.Hooks;

import UI.pages.EditProfilePage;
import io.cucumber.java.en.Then;

public class EditProfileSteps {
    EditProfilePage  editProfilePage = new EditProfilePage();
    @Then("check First Name in Edit form")
    public void checkFirstNameInEditForm() {
        editProfilePage.checkFirstName();
    }

    @Then("check Last Name in Edit form")
    public void checkLastNameInEditForm() {
        editProfilePage.checkLastName();
    }

    @Then("check Email in Edit form")
    public void checkEmailInEditForm() {
        editProfilePage.checkEmail();
    }

    @Then("check Phone in Edit form")
    public void checkPhoneInEditForm() {
        editProfilePage.checkPhone();
    }


}
