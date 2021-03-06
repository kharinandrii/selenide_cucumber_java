package UI.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;



public class Helper {

    final Faker faker = new Faker(new Locale("en"));
    public static HashMap<String, String> myMap = new HashMap<String, String>();

    public void clickOn(SelenideElement element) {
        element.click();
    }

    public void fillIn(SelenideElement element, String text) {
        element.sendKeys(text);
    }
    public String getTextIn(SelenideElement element){
       return element.getText();
    }
    public Boolean checkTextIn(SelenideElement element, String text) {
        element.shouldBe(Condition.visible);
       String actualText = getTextIn(element);
      if(actualText.equals(text)){
          return true;
      }else {
          return false;
      }
    }
    public void checkValueIn(SelenideElement element, String expectedValue) {
        String actualValue = element.getValue();
        actualValue.equals(expectedValue);

    }
    public boolean containTextIn(SelenideElement element, String text) {
        String actualText = element.getText();
        if(actualText.contains(text)){
            return true;
        }else {
            return false;
        }
    }
}
//TODO - for rest-assured -> petstore.swagger.io