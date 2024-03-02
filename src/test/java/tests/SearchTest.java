package tests;
import helpers.Attach;
import tests.TestBase;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import io.qameta.allure.Owner;
import pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SearchResultPage;

public class SearchTest extends TestBase {

    SearchResultPage SearchResultPage = new SearchResultPage();

    @Owner("Kirill Tishchenko")
    @Test
    @DisplayName("Открываем Сайт и ищем продукты")
    void SearchResultTest (){
        SearchResultPage.openPage();
        SearchResultPage.chooseProduct();
        SearchResultPage.SearchButton();
    }
}