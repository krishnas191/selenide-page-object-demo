import org.junit.Test;
import page.GooglePage;
import page.SearchResultsPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

  @Test
  public void testUserSearch() {
    open("https://duckduckgo.com");
    new GooglePage().search("selenide");

    SearchResultsPage searchResultsPage = new SearchResultsPage();
    searchResultsPage.getResults().shouldHave(sizeGreaterThan(1));
    searchResultsPage.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
  }
}
