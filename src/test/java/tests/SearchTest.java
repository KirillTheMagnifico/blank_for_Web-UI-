package tests;

import io.qameta.allure.Owner;
import pages.MainPage;
import pages.SearchResultPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    String textForSearch = "Колбаса";

    @Owner("Kirill Tishchenko")
    @Test
    @DisplayName("Check search result")
    void checkSearchResultTest () {
        mainPage.openPage()
                .searchText(textForSearch);
        searchResultPage.checkSearchResult(textForSearch);
    }
}