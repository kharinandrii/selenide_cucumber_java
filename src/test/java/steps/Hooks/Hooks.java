package steps.Hooks;

import UI.DataProvider.Params;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    Params params = new Params();
    @Before
    public void openSite() {
        open(params.BASE_URL);
    }
}
