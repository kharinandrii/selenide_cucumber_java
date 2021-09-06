package junitTests;

import UI.DataProvider.Params;
import UI.pages.HomePage;
import org.junit.Test;

public class FirstTest {
    HomePage homePage = new HomePage();
    Params params = new Params();
    @Test
    public void firstTest() {
        homePage.clickOnRegiserLnk();
    }
}
