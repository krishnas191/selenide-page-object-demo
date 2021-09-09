import org.testng.annotations.Test;
import page.GooglePage;
import page.SearchResultsPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static org.testng.Assert.assertEquals;

/**
 * Project Name    : selenide-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 9/9/2021
 * Time            : 8:47 AM
 * Description     : This is the test class for Google search
 **/

public class GoogleTest extends BaseTest {

    @Test
    public void testValidSearch() {
        new GooglePage().search("selenide");

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.getResults().shouldHave(sizeGreaterThan(1));
        assertEquals(searchResultsPage.getResult(0).getText(), "Selenide: concise UI tests in Java");
    }

    @Test
    public void testInvalidSearch() {
        new GooglePage().search("selenide");

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.getResults().shouldHave(sizeGreaterThan(1));
        assertEquals(searchResultsPage.getResult(0).getText(), "Selenide: concise UI tests in Java1");
    }
}
