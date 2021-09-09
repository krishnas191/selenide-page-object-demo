package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

/**
 * Project Name    : selenide-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/9/2021
 * Time            : 8:47 AM
 * Description     : This is the page object class for Search Results page
 **/

public class SearchResultsPage {

    public ElementsCollection getResults() {
        return Selenide.$$(".results .result");
    }

    public SelenideElement getResult(int index) {
        return Selenide.$("#r1-" + index);
    }
}
