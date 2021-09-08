package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SearchResultsPage {

    public ElementsCollection getResults() {
        return Selenide.$$(".results .result");
    }

    public SelenideElement getResult(int index) {
        return Selenide.$("#r1-" + index);
    }
}
