package tests.Pages.Profile;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import tests.base.basetests.BaseTest;

import java.net.MalformedURLException;
import java.util.ArrayList;

import static Constants.Constant.Data.PROMOKOD;
import static Constants.Constant.Urls.GETX_HOME_PAGE;
import static Constants.Constant.XPath.*;
import static Pages.Payment.Locators.XPath.BUTTON_CLOSE_WINDOW_PAYMENT;
import static Pages.Payment.Locators.XPath.WINDOW_PAYMENT;
import static Pages.Profile.Locators.XPath.*;
import static io.qameta.allure.Allure.step;



public class ProfileTest extends BaseTest {

    public ProfileTest() throws MalformedURLException {
    }

    @Test(description = "Проверка профиля",priority = 2,groups = "profile")
    @Description("Смотрим тест в целом")
    public void Profile (){
        try {
            /*step("Переход на страницу сайта", () -> {
                basepage.open(GETX_HOME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode();
            });
            step("Нажатие кнопки Войти", () -> {
                AutorizationPage.enterButtonLogIn();
                WaitUtils.waitForPageToLoad();
                CheckFindElement.checkWindow(WINDOW_AUTORISATION,"Окно авторизациия");
            });

            step("Ввод логина", () -> {
                AutorizationPage.enteremail();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации");
            });

            step("Ввод пароля", () -> {
                AutorizationPage.enterpassword();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации");
            });

            step("Нажатие кнопки Войти", () -> {
                AutorizationPage.ButtonLogin();
                WaitUtils.waitForPageToLoad();
                CheckFindElement.checkWindowIsGone(WINDOW_AUTORISATION,"Окно авторизации ");
            });*/
            step("Открытие попап профиля",() ->{
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_PROFILE));
                basepage.ClickByXpath(BUTTON_PROFILE);
                CheckFindElement.checkWindow(POPUP_PROFILE,"Окно профиля ");
            });
            step("Открытие Аккаунта",() ->{
                basepage.ClickByXpath(BUTTON_ACCOUNT);
            });
            step("Открытие Окна кошелька в профиле",() ->{
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_WALLET_IN_PROFILE));
                basepage.ClickByXpath(BUTTON_WALLET_IN_PROFILE);
                CheckFindElement.checkWindow(WINDOW_PAYMENT,"Окно кошелька ");
            });
            step("Закрытие Окна пополнения",() ->{
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CLOSE_WINDOW_PAYMENT));
                basepage.ClickByXpath(BUTTON_CLOSE_WINDOW_PAYMENT);
                CheckFindElement.checkWindowIsGone(WINDOW_PAYMENT,"Окно кошелька ");
            });
            step("Проверка поля промокода",() ->{
                WaitUtils.waitForElementToBeVisible(By.xpath(INPUT_PROMOKOD_IN_PROFILE));
                basepage.InputTextByXpath(INPUT_PROMOKOD_IN_PROFILE,PROMOKOD);
                basepage.ClickByXpath(BUTTON_USE_PROMOKOD);
                WindowProfilePage.CheckPush();
            });
            step("Проверка таблицы ставки",() ->{
                WindowProfilePage.checkElements(TABLET_BETS_ELEMENTS);
            });
            step("Проверка таблицы платежи",() ->{
                basepage.ClickByXpath(TABLET_PAYMENT);
                WindowProfilePage.checkElements(TABLET_PAYMENTS_ELEMENTS);
            });
            step("Проверка таблицы выплаты",() ->{
                basepage.ClickByXpath(TABLET_PAYOUT);
                WindowProfilePage.checkElements(TABLET_PAYOUT_ELEMENTS);
            });
            step("Проверка таблицы бонусы",() ->{
                basepage.ClickByXpath(TABLET_BONUSES);
                WindowProfilePage.checkElements(TABLET_BONUSES_ELEMENTS);
            });
        }catch(Exception e){

        }

    }

}
