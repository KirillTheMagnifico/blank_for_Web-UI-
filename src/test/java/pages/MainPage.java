package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
public class MainPage {



    //locators
    private SelenideElement mainLogo = $(""),
            emailButton = $(".form-row_block").$("button"),
            emptyInputError = $(".form-row_block").$(".rich-text-input__error"),
            searchBar = $(""),
            bannerImage = $(""),
            aboutUsLink = $("").$(withText("О компании"));

    //actions
    public MainPage openPage() {
        step("Открытие главной страницы сайта Окей", () -> {
            open("https://www.okeydostavka.ru/");
        });
        return this;
    }

    public MainPage checkLogo() {
        step("Проверка видимости логотипа", () -> {
            mainLogo.shouldBe(visible);
        });
        return this;
    }

    public MainPage clickEmailButton() {
        step("Нажатие кнопки отправки email", () -> {
            emailButton.click();
        });
        return this;
    }

    public MainPage checkEmptyInputError(String textErrorMessage) {
        step("Проверка пустого поля для email", () -> {
            emptyInputError.shouldHave(text(textErrorMessage));
        });
        return this;
    }

    public MainPage searchText(String textForSearch) {
        step("Ввод текста в поисковую строку", () -> {
            searchBar.setValue(textForSearch).pressEnter();
        });
        return this;
    }

    public MainPage clickBanner() {
        step("Нажать на рекламный баннер", () -> {
            bannerImage.click();
        });
        return this;
    }

    public MainPage clickAboutUs() {
        step("Переход на страницу О компании", () -> {
            aboutUsLink.click();
        });
        return this;
    }
}