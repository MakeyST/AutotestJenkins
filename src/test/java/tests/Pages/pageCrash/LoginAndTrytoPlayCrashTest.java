package tests.Pages.pageCrash;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import tests.base.basetests.BaseTest;


import java.net.MalformedURLException;

import static Constants.Constant.XPath.*;
import static Pages.Crash.Locators.XPath.*;
import static io.qameta.allure.Allure.step;


public class LoginAndTrytoPlayCrashTest extends BaseTest {


    public LoginAndTrytoPlayCrashTest() throws MalformedURLException {
    }

    @Test(description = "Провверка авторизации и игры в Краш",priority = 2,groups = "crash")
    @Description("Смотрим тест в целом")
    public void checkButtomPlayCrash() {
        try{
        /*step("Переход на страницу игры ", () -> {
            basepage.open(CRASH_GAME_PAGE);
            TestHttpResponseCode.TestHttpResponseCode(CRASH_GAME_PAGE);
            WaitUtils.waitForPageToLoad();
            TakeScreenshot.TakeScreenShot("Скриншот: Страница Астериод");
        });

        step("Нажатие кнопки Войти ", () -> {
            ButtonCrashLoginPage.entergamecrashlogin();
            WaitUtils.waitForPageToLoad();
            CheckFindElement.checkWindow(WINDOW_AUTORISATION);
        });

        step("Ввод логина ", () -> {
            AutorizationPage.enteremail();
            TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации в игре Краш");
        });

        step("Ввод пароля", () -> {
            AutorizationPage.enterpassword();
            TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации в игре Краш");
        });
        step("Нажатие кнопки Войти", () -> {
            AutorizationPage.ButtonLogin();
            TakeScreenshot.TakeScreenShot("Скриншот: Страница Монетка , авторизованного пользователя");
            WaitUtils.waitForPageToLoad();
        });*/
        step("Проверка повышения ставки на 1",() -> {
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_PLUS_ONE));
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_PLUS_ONE);
            Equals.equals(BET_CRASH,"2","Кнопка повышения ставки на 1 работает","Кнопка повышения ставки на 1 не работает");
        });
        step("Проверка понижения ставки на 1",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_BET_MINUS);
            Equals.equals(BET_CRASH,"1","Кнопка уменьшения ставки на 1 работает","Кнопка уменьшения ставки на 1 не работает");
        });
        step("Проверка повышения ставки на 10",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_BET_X10);
            Equals.equals(BET_CRASH,"11","КнопкА повышения ставки на 10 работает","Кнопка повышения ставки на 10 неработает");
        });
        step("Проверка повышения ставки на 50",() ->{
            WaitUtils.waitForPageToLoad();
            basepage.ClickByXpath(BUTTON_BET_X50);
            Equals.equals(BET_CRASH,"61","Кнопка повышения ставки на 50 работает","Кнопка повышения ставки на 50 работает");
        });
        step("Проверка повышения ставки на 100",() ->{
            basepage.ClickByXpath(BUTTON_BET_X100);
            Equals.equals(BET_CRASH,"161","Кнопка повышения ставки на 100 работает","Кнопка повышения ставки на 100 работает");
        });
        step("Проверка повышения ставки на 200",() ->{
            basepage.ClickByXpath(BUTTON_BET_X200);
            Equals.equals(BET_CRASH,"361","Кнопка повышения ставки на 200 работает","Кнопка повышения ставки на 200 работает");
        });
        step("Проверка повышения ставки на max",() ->{
            basepage.ClickByXpath(BUTTON_BET_MAX);
            String ExpectedBet = driver.findElement(By.xpath(BALANCE)).getText();
            Equals.equals(BET_CRASH,ExpectedBet,"Кнопка повышения ставки на max работает","Кнопка повышения ставки на max работает");

        });
        step("Проверка повышения автостопа на 0,1",() ->{
            basepage.ClickByXpath(AUTOSTOP_UP);
            Equals.equals(AUTOSTOP,"2.10","Кнопка повышения автостопа работает","Кнопка повышения автостопа не работает");
        });
        step("Проверка понижение автостопа на 0,1",() ->{
            basepage.ClickByXpath(AUTOSTOP_DOWN);
            Equals.equals(AUTOSTOP,"2.00","Кнопка понижение автостопа на 0,1 работает","Кнопка понижение автостопа на 0,1 не работает");
        });
        step("Проверка выключения",() ->{
            WebElement Autostop = driver.findElement(By.xpath(CHENGER_CRASH));
            String initialPosition = Autostop.getAttribute("class");
            basepage.ClickByXpath(AUTOSTOP_ON);
            String newPosition = Autostop.getAttribute("class");
            ChengedPosition.CheckChenger(initialPosition,newPosition);
        });
        step("Проверка включения",() ->{
            WebElement Autostop = driver.findElement(By.xpath(CHENGER_CRASH));
            String initialPosition = Autostop.getAttribute("class");
            basepage.ClickByXpath(AUTOSTOP_ON);
            String newPosition = Autostop.getAttribute("class");
            ChengedPosition.CheckChenger(initialPosition,newPosition);
        });

        step("Выставление ставки 1",() ->{
            basepage.InputTextByXpath(BET_CRASH,"0");
        });

        step("Нажатие кнопки Играть ", () -> {
            WaitUtils.WaitButtonToBeClickableAndClick(BUTTON_PLAY_CRASH);
            CheckFindElement.CheckPush();
        });
        }catch(Exception e) {
        }
    }

}
