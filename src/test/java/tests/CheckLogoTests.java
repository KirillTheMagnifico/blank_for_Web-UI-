package tests;

import io.qameta.allure.Owner;
import pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckLogoTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Owner("Kirill Tishchenko")
    @Test
    @DisplayName("Открываем Сайт и проверяем Логотип")
    void CheckImagesVisible() {
        mainPage.openPage();
        mainPage.checkLogo();
    }
}