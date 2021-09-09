package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

/**
 * Project Name    : selenide-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/9/2021
 * Time            : 8:47 AM
 * Description     : This is the page object class for Google home page
 **/

public class GooglePage {

    public void search(String text) {
        Selenide.$(By.name("q")).val(text).pressEnter();
    }
}
