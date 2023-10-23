package tests.pageMiner;

import io.qameta.allure.Description;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;


import static Constants.Constant.Id.ID_BUTTON_LOG_IN_WINAUT;

import static io.qameta.allure.Allure.step;

public class LoginAndTrytoPlayMinerTest extends BaseTest {


    @Test(description = "Авторизация и нажатие кнопки Играть на странице Минер")
    @Description("Смотрим тест в целом")

    public void checkButtonPlayMiner() {
        try{
        /*step("Переход на страницу игры ", () -> {
            basepage.open(MINER_GAME_PAGE);
            TestHttpResponseCode.TestHttpResponseCode();
            WaitUtils.waitForPageToLoad();
            TakeScreenshot.TakeScreenShot("Скриншот: Страница Минер");

        });

        step("Нажатие кнопки Войти ", () -> {
            ButtonMinerLoginPage.entergameminerlogin();
            CheckFindElement.checkWindow(WINDOW_AUTORISATION,"Окно авторизациия");
        });

        step("Ввод логина ", () -> {
            AutorizationPage.enteremail();
            TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации в игре минер");
        });

        step("Ввод пароля", () -> {
            AutorizationPage.enterpassword();
            TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации в игре минер");
        });
*/
        step("Нажатие кнопки Войти ", () -> {
            basepage.ClickById(ID_BUTTON_LOG_IN_WINAUT);
            WaitUtils.waitForPageToLoad();
            TakeScreenshot.TakeScreenShot("Скриншот: Страница Минер , авторизованного пользователя");
        });

      /*  step("Нажатие кнопки Играть", () -> {
            WaitButtonPlayMiner.clickButtonPlayMiner();
        });*/
        } catch (Exception e) {
        }

    }

}
