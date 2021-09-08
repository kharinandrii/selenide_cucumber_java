package UI.pages;

import UI.DataProvider.Params;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class YourStorePage extends Helper {

    Params params = new Params();

    final private SelenideElement headerText = $(By.xpath("//*[@id='content']/h1")),
                                  continueButton = $(By.xpath("//*[text()='Continue']")),
                                  congratulationMessage = $(By.xpath("//*[@id='content']/p[1]")),
                                  editProgileLnk = $(By.xpath("//*[@id='content']//*[text()='Edit Account']"));



    public void checkCongratulationsText() {
        if(checkTextIn(headerText, params.YOUR_STORE_H1) && checkTextIn(congratulationMessage, params.SUCCESSFULL_MESSAGE)){
            clickOn(continueButton);
        }
    }
    public void openEditProfile() {
        clickOn(editProgileLnk);
    }

}
