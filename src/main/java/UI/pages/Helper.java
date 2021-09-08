package UI.pages;

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
    public void checkTextIn(SelenideElement element, String text) {
        //TODO дописать метод для получения текста с элемента и его проверки на совпадение - возможно метод будет не воид
    }

}
