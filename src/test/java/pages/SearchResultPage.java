package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


import org.openqa.selenium.By;
import pages.MainPage;
public class SearchResultPage {

    //locators
    private SelenideElement SearchInput = $(By.name("searchTerm")),
    SearchButton = $x("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div[7]/div/div/form/div/div[2]/a[2]"),
    //goToFavouriteButton = $("").$("");
    Text = $x("/html/body/div[1]/div[2]/div/div[1]/div[3]/div[2]/div[1]/div/div/span/div/h1");
    //actions
    public SearchResultPage openPage() {
        step("Открытие главной страницы сайта Окей", () -> {
            open("https://www.okeydostavka.ru/");
        });
        return this;
    }
     public SearchResultPage chooseProduct() {
          step("Поиск нужного товара", () -> {
              SearchInput.setValue("Колбаса");
         });
           return this;
      }

   public SearchResultPage SearchButton() {
           step("Нажмем на кнопку поиска", () -> {
               SearchButton.click();
               Text.shouldHave(text("Колбаса"));
         });
        return this;
    }

    //   public SearchResultPage goToFavouritePage() {
    //       step("Переход на страницу Избранное", () -> {
    //          goToFavouriteButton.click();
    //      });
    //     return this;
}