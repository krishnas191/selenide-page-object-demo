package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class GooglePage {

    public void search(String text) {
        Selenide.$(By.name("q")).val(text).pressEnter();
    }
}
