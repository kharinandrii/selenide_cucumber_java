package UI.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BillingDetailsPage extends Helper {
    SelenideElement firstNameField = $(By.xpath("//*[@id='input-payment-firstname']")),
                    lastNameField = $(By.xpath("//*[@id='input-payment-lastname']")),
                    addressField = $(By.xpath("//*[@id='input-payment-address-1']")),
                    cityField = $(By.xpath("//*[@id='input-payment-city']")),
                    postCodeField = $(By.xpath("//*[@id='input-payment-postcode']"));

    public void fillFirstName() {
        String firstName = myMap.get("firstName");
        fillIn(firstNameField, firstName);
    }
    public void fillLastName() {
        String lastName = myMap.get("lastName");
        fillIn(lastNameField, lastName);
    }
    public void fillAddress() {
        String address = faker.address().fullAddress();
        fillIn(addressField, address);
    }

    public void fillCity() {
        String city = faker.address().cityName();
        fillIn(cityField, city);
    }

    public void fillPostcode() {
        String zipcode = faker.address().zipCode();
        fillIn(postCodeField, zipcode);
    }

    public void checkCountry() {
        //todo сделать проверку на страну по value после чего перейти дальше
    }
}
