package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SearchResultPage {

    //locators
    private SelenideElement searchResultInfo = $(""),
            necessaryProduct = $$("").first(),
            addFavouriteButton = $$("").first().$("").$(".btn_like"),
            goToFavouriteButton = $("").$("");

    //actions
    public SearchResultPage checkSearchResult(String textForSearch) {
        step("Проверка результатов поиска", () -> {
            searchResultInfo.shouldHave(text("По запросу “" + textForSearch + "” найдено"));
        });
        return this;
    }

    public SearchResultPage chooseProduct() {
        step("Поиск нужного товара", () -> {
            necessaryProduct.hover();
        });
        return this;
    }

    public SearchResultPage addFavourite() {
        step("Добавление товара в избранные", () -> {
            addFavouriteButton.click();
        });
        return this;
    }

    public SearchResultPage goToFavouritePage() {
        step("Переход на страницу Избранное", () -> {
            goToFavouriteButton.click();
        });
        return this;
    }
}