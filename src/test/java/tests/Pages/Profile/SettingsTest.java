package tests.Pages.Profile;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import static Constants.Constant.Data.*;
import static Constants.Constant.Urls.GETX_HOME_PAGE;
import static Constants.Constant.XPath.*;
import static Pages.Profile.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class SettingsTest extends BaseTest {
    @Test(description = "Проверка профиля",priority = 2,groups = "profile")
    @Description("Смотрим тест в целом")
    public void Settings (){
        try {
            /*step("Переход на страницу сайта", () -> {
                basepage.open(GETX_HOME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode();
            });
            step("Нажатие кнопки Войти", () -> {
                AutorizationPage.enterButtonLogIn();
                WaitUtils.waitForPageToLoad();
                CheckFindElement.checkWindow(WINDOW_AUTORISATION,"Окно авторизации ");
            });

            step("Ввод логина", () -> {
                AutorizationPage.enteremail();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации");
            });

            step("Ввод пароля", () -> {
                AutorizationPage.enterpassword();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации ");
            });

            step("Нажатие кнопки Войти", () -> {
                AutorizationPage.ButtonLogin();
                WaitUtils.waitForPageToLoad();
                CheckFindElement.checkWindowIsGone(WINDOW_AUTORISATION,"Окно авторизации ");
            });*/
           /* step("Открытие попап профиля",() ->{
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_PROFILE));
                basepage.ClickByXpath(BUTTON_PROFILE);
                CheckFindElement.checkWindow(POPUP_PROFILE,"Окно профиля ");
                TakeScreenshot.TakeScreenShot("Скриншот: Попап профиля");
            });
            step("Открытие Аккаунта",() ->{
                basepage.ClickByXpath(BUTTON_ACCOUNT);
                TakeScreenshot.TakeScreenShot("Скриншот: Аккаунт");
            });*/
            step("Открытие раздела Настройка",() ->{
                basepage.ClickByXpath(BUTTON_SETTINGS_IN_PROFILE);
            });
            step("Проверка поля смены никнйма",() ->{
                WaitUtils.waitForElementToBeVisible(By.xpath(INPUT_NICKNAME));
                basepage.InputTextByXpath(INPUT_NICKNAME,NEW_NICKNAME);
                basepage.ClickByXpath(BUTTON_CHANGE_NICKNAME);
                WindowProfilePage.CheckPushChangeNickname();
            });
            step("Проверка изменения языка",() ->{
                WaitUtils.waitForElementToBeVisible(By.xpath(BUTTON_CHANGE_LANGUEGE));
                basepage.ClickByXpath(BUTTON_CHANGE_LANGUEGE);
                CheckFindElement.checkWindow(WINDOW_CHANGE_LANGUEGE,"Окно выбора языка ");
                basepage.ClickByXpath(BUTTON_CHANGE_LANGUEGE);
            });
            step("Проверка включения звуковых эффектов",() ->{
                WebElement SoundsEffects = driver.findElement(By.xpath(TURN_ON_SOUND_EFFECTS));
                String initialPosition = SoundsEffects.getAttribute("class");
                basepage.ClickByXpath(TURN_ON_SOUND_EFFECTS);
                String newPosition = SoundsEffects.getAttribute("class");
                ChengedPosition.CheckChenger(initialPosition,newPosition);
            });
            step("Проверка выключения звуковых эффектов",() ->{
                WebElement SoundsEffects = driver.findElement(By.xpath(TURN_ON_SOUND_EFFECTS));
                String initialPosition = SoundsEffects.getAttribute("class");
                basepage.ClickByXpath(TURN_ON_SOUND_EFFECTS);
                String newPosition = SoundsEffects.getAttribute("class");
                ChengedPosition.CheckChenger(initialPosition,newPosition);
            });

            step("Проверка включения скрыть аватар и никнейм",() ->{
                WebElement SoundsEffects = driver.findElement(By.xpath(TURN_ON_HIDE_AVATAR_AND_NICKNIME));
                String initialPosition = SoundsEffects.getAttribute("class");
                basepage.ClickByXpath(TURN_ON_HIDE_AVATAR_AND_NICKNIME);
                String newPosition = SoundsEffects.getAttribute("class");
                ChengedPosition.CheckChenger(initialPosition,newPosition);
            });
            step("Проверка выключения скрыть аватар и никнейм",() ->{
                WebElement SoundsEffects = driver.findElement(By.xpath(TURN_ON_HIDE_AVATAR_AND_NICKNIME));
                String initialPosition = SoundsEffects.getAttribute("class");
                basepage.ClickByXpath(TURN_ON_HIDE_AVATAR_AND_NICKNIME);
                String newPosition = SoundsEffects.getAttribute("class");
                ChengedPosition.CheckChenger(initialPosition,newPosition);
            });
            step("Проверка скрыть статистику",() ->{
                WebElement SoundsEffects = driver.findElement(By.xpath(TURN_ON_HIDE_GAME_STATISTIC));
                String initialPosition = SoundsEffects.getAttribute("class");
                basepage.ClickByXpath(TURN_ON_HIDE_GAME_STATISTIC);
                String newPosition = SoundsEffects.getAttribute("class");
                ChengedPosition.CheckChenger(initialPosition,newPosition);
            });
            step("Проверка показать статистику",() ->{
                WebElement SoundsEffects = driver.findElement(By.xpath(TURN_ON_HIDE_GAME_STATISTIC));
                String initialPosition = SoundsEffects.getAttribute("class");
                basepage.ClickByXpath(TURN_ON_HIDE_GAME_STATISTIC);
                String newPosition = SoundsEffects.getAttribute("class");
                ChengedPosition.CheckChenger(initialPosition,newPosition);
            });
            step("Проверка поля смены пароля",() ->{
                WaitUtils.WaitForElementToBeInvisability(PUSH);
                WaitUtils.waitForElementToBeVisible(By.xpath(INPUT_OLD_PASWORD));
                basepage.InputTextByXpath(INPUT_OLD_PASWORD,OLD_PASSWORD);
                basepage.InputTextByXpath(INPUT_NEW_PASWORD,NEW_PASSWORD);
                basepage.InputTextByXpath(INPUT_DOUBLE_NEW_PASSWORD,NEW_PASSWORD);
                basepage.ClickByXpath(BUTTON_CHANGE_PASSWORD);
                WindowProfilePage.CheckPushChangePassword();
            });
            step("Проверка поля промокода",() ->{
                WaitUtils.WaitForElementToBeInvisability(PUSH);
                WaitUtils.waitForElementToBeVisible(By.xpath(INPUT_OLD_PASWORD));
                basepage.InputTextByXpath(INPUT_OLD_PASWORD,NEW_PASSWORD);
                basepage.InputTextByXpath(INPUT_NEW_PASWORD,OLD_PASSWORD);
                basepage.InputTextByXpath(INPUT_DOUBLE_NEW_PASSWORD,OLD_PASSWORD);
                basepage.ClickByXpath(BUTTON_CHANGE_PASSWORD);
                WindowProfilePage.CheckPushChangePassword();
            });
            step("Выставляем старый никнейм",() ->{
                WaitUtils.WaitForElementToBeInvisability(PUSH);
                WaitUtils.waitForElementToBeVisible(By.xpath(INPUT_NICKNAME));
                basepage.InputTextByXpath(INPUT_NICKNAME,OLD_NICKNAME);
                basepage.ClickByXpath(BUTTON_CHANGE_NICKNAME);
                WindowProfilePage.CheckPushChangeNickname();
            });
        }catch(Exception e){

        }
    }
}

