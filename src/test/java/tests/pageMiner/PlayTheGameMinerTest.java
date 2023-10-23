package tests.pageMiner;


import io.qameta.allure.Description;


import org.openqa.selenium.*;
import org.testng.annotations.Test;

import tests.base.basetests.BaseTest;


import static Constants.Constant.XPath.*;
import static Pages.Miner.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class PlayTheGameMinerTest extends BaseTest {
    @Test(description = "Проверка авторизации и игры в минер",priority = 2,groups = "miner")
    @Description("Смотрим тест в целом")
    public void checkPlayMiner() {
        try{
       /* step("Переход на страницу игры ", () -> {
            basepage.open(MINER_GAME_PAGE);
            TestHttpResponseCode.TestHttpResponseCode(MINER_GAME_PAGE);
        });
        step("Нажатие кнопки 'Войти'", () -> {
            ButtonMinerLoginPage.entergameminerlogin();
            WaitUtils.waitForPageToLoad();
            CheckFindElement.checkWindow(WINDOW_AUTORISATION);
        });
        step("Ввод логина", () -> {
            AutorizationPage.enteremail();
            TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации в игре минер");
        });
        step("Ввод пароля", () -> {
            AutorizationPage.enterpassword();
            TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации в игре минер");
        });
        step("Нажатие кнопки 'Войти'", () -> {
            AutorizationPage.ButtonLogin();
            TakeScreenshot.TakeScreenShot("Скриншот: Страница Минер , авторизованного пользователя");
        });*/

        step("Кнопка 10 бомб",() ->{
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_5_BOMBS));
            basepage.ClickByXpath(BUTTON_10_BOMBS);
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_5_BOMBS));
            Equals.equals(NUMBERS_BOMBS,"10","Кнопка 10 бомб работает","Кнопка 10 бомб не работает");
        });
        step("Кнопка 5 бомб",() ->{
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_5_BOMBS));
            basepage.ClickByXpath(BUTTON_5_BOMBS);
            Equals.equals(NUMBERS_BOMBS,"5","Кнопка 5 бомб работает","Кнопка 5 бомб не работает");
        });
        step("Кнопка 16 бомб",() ->{
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_5_BOMBS));
            basepage.ClickByXpath(BUTTON_16_BOMBS);
            Equals.equals(NUMBERS_BOMBS,"16","Кнопка 16 бомб работает","Кнопка 16 бомб не работает");
        });
        step("Кнопка 24 бомбы",() ->{
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_5_BOMBS));
            basepage.ClickByXpath(BUTTON_24_BOMBS);
            Equals.equals(NUMBERS_BOMBS,"24","Кнопка 24 бомбы работает","Кнопка 24 бомбы не работает");
        });
        step("Кнопка 3 бомбы",() ->{
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_5_BOMBS));
            basepage.ClickByXpath(BUTTON_3_BOMBS);
            Equals.equals(NUMBERS_BOMBS,"3","Кнопка 3 бомбы работает","Кнопка 3 бомбы не работает");
        });
        step("Кнопка повышения ставки на 1",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_MINER_BET_PLUS);
            Equals.equals(BET_MINER,"1.00","Кнопка повышения ставки на 1 работает","Кнопка повышения ставки на 1 не работает");
        });
        step("Кнопка понижения ставки на 1",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_MINER_BET_MINUS);
            Equals.equals(BET_MINER,"1.00","Кнопка понижения ставки на 1 работает","Кнопка понижения ставки на 1 не работает");
        });
        step("Кнопка повышения ставки на 10",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_MINER_BET_PLUS10);
            Equals.equals(BET_MINER,"11","Кнопка повышения ставки на 10 работает","Кнопка повышения ставки на 10 не работает");
        });
        step("Кнопка минимальной ставки",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_MINER_BET_MIN);
            Equals.equals(BET_MINER,"1.00","Кнопка минимальной ставки работает","Кнопка минимальной ставки не работает");
        });
        step("Кнопка повышения ставки на 50",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_MINER_BET_PLUS50);
            Equals.equals(BET_MINER,"51","Кнопка повышения ставки на 50 работает","Кнопка повышения ставки на 50 не работает");
        });
        step("Кнопка повышения ставки на 100",() ->{
            basepage.ClickByXpath(BUTTON_MINER_BET_PLUS100);
            Equals.equals(BET_MINER,"151","Кнопка повышения ставки на 100 работает","Кнопка повышения ставки на 100 не работает");
        });
        step("Кнопка повышения ставки на 200",() ->{
            basepage.ClickByXpath(BUTTON_MINER_BET_PLUS200);
            Equals.equals(BET_MINER,"351","Кнопка повышения ставки на 200 работает","Кнопка повышения ставки на 200 не работает");
        });
        step("Кнопка максимальной ставки",() ->{
            String ExpectedBet = driver.findElement(By.xpath(BALANCE)).getText();
            basepage.ClickByXpath(BUTTON_MINER_BET_MAX);
            Equals.equals(BET_MINER,ExpectedBet,"Кнопка максимальной ставки работает","Кнопка максимальной ставки не работает");
        });
        step("Кнопка минимальной ставки",() ->{
            basepage.ClickByXpath(BUTTON_MINER_BET_MIN);
        });
        step("Нажатие кнопки 'Играть'", () -> {
            WaitUtils.WaitButtonToBeClickableAndClick(BUTTON_PLAY_MINER);
        });
        step("Выбор одной из ячеек", () -> {
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_SLOT_MINER));
            PlayMinerPage.enterSlotMiner();
            TakeScreenshot.TakeScreenShot("Скриншот: Страница Игры");
        });
        step("Нажатие кнопки 'Забрать'", () -> {
            WaitUtils.waitForElementToBeVisible(By.xpath(BUTTON_TAKE_IN_MINER));
            EnterButtonTakeMiner.clickButtonTake();
            TakeScreenshot.TakeScreenShot("Скриншот: Страница Выигрыш/Проигрыш");
        });
        } catch (Exception e) {
        }
    }
}

