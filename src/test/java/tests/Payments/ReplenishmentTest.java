package tests.Payments;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;
import tests.pageMiner.LoginAndTrytoPlayMinerTest;

import static Constants.Constant.Id.ID_MENU;
import static Constants.Constant.Urls.GETX_HOME_PAGE;
import static Constants.Constant.XPath.*;
import static Pages.Payment.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class ReplenishmentTest extends BaseTest {

    @Test(description = "Проверка окна пополнение",priority = 2,groups = "wallet")
    @Description("Смотрим тест в целом")
    public void checkWindowReplenishment() {
        try {
            /*step("Переход на страницу игры ", () -> {
                basepage.open(GETX_HOME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode(GETX_HOME_PAGE);
                WaitUtils.waitForPageToLoad();
                TakeScreenshot.TakeScreenShot("Скриншот: Домашняя страница");
            });
            step("Нажатие кнопки Войти", () -> {
                AutorizationPage.enterButtonLogIn();
            });
            step("Ввод логина ", () -> {
                AutorizationPage.enteremail();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации ");
            });
            step("Ввод пароля", () -> {
                AutorizationPage.enterpassword();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации ");
            });

            step("Нажатие кнопки Войти ", () -> {
                AutorizationPage.ButtonLogin();
                WaitUtils.waitForPageToLoad();
                TakeScreenshot.TakeScreenShot("Скриншот: Страница авторизованного пользователя");
            });*/
            step("Окно платежей", () -> {
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_PAYMENT));
                basepage.ClickByXpath(BUTTON_PAYMENT);
                CheckFindElement.checkWindow(WINDOW_PAYMENT,"Окно кошелька");
            });
            step("Проверка 1 платежной системы", () -> {
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkInputPromokod();
                basepage.ClickByXpath(BUTTON_NEXT);
                WaitUtils.waitForElementToBeVisible(By.xpath(WINDOW_WAITING_PAYMENT));
                Buttons.enterButtonNextSBP();
                CheckFindElement.checkPaymentWaitingWindow();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно ожидания оплаты");
            });
            step("Проверка кнопки 2 платежной системы", () -> {
                basepage.ClickByXpath(CHOOSE_METOD_2);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkInputPromokod();
                basepage.ClickByXpath(BUTTON_NEXT);
                WaitUtils.waitForElementToBeVisible(By.xpath(WINDOW_WAITING_PAYMENT));
                Buttons.enterButtonNextSBP();
                CheckFindElement.checkPaymentWaitingWindow();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно ожидания оплаты");
            });
            step("Проверка кнопки 3 платежной системы", () -> {
                basepage.ClickByXpath(CHOOSE_METOD_3);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkInputPromokod();
                basepage.ClickByXpath(BUTTON_NEXT);
                WaitUtils.waitForElementToBeVisible(By.xpath(WINDOW_WAITING_PAYMENT));
                Buttons.enterButtonNextSBP();
                CheckFindElement.checkPaymentWaitingWindow();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно ожидания оплаты");
            });
            step("Проверка кнопки 4 платежной системы", () -> {
                basepage.ClickByXpath(CHOOSE_METOD_4);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkInputPromokod();
                basepage.ClickByXpath(BUTTON_NEXT);
                WaitUtils.waitForElementToBeVisible(By.xpath(WINDOW_WAITING_PAYMENT));
                Buttons.enterButtonNextSBP();
                CheckFindElement.checkPaymentWaitingWindow();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно ожидания оплаты");
            });
            step("Проверка кнопки 5 платежной системы", () -> {
                basepage.ClickByXpath(CHOOSE_METOD_5);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkInputPromokod();
                basepage.ClickByXpath(BUTTON_NEXT);
                WaitUtils.waitForElementToBeVisible(By.xpath(WINDOW_WAITING_PAYMENT));
                Buttons.enterButtonNextSBP();
                CheckFindElement.checkPaymentWaitingWindow();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно ожидания оплаты");
            });
            step("Проверка кнопки 6 платежной системы", () -> {
                basepage.ClickByXpath(CHOOSE_METOD_6);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkInputPromokod();
                basepage.ClickByXpath(BUTTON_NEXT);
                WaitUtils.waitForElementToBeVisible(By.xpath(WINDOW_WAITING_PAYMENT));
                Buttons.enterButtonNextSBP();
                CheckFindElement.checkPaymentWaitingWindow();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно ожидания оплаты");
            });
            step("Проверка кнопки 7 платежной системы", () -> {
                basepage.ClickByXpath(CHOOSE_METOD_7);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkInputPromokod();
                basepage.ClickByXpath(BUTTON_NEXT);
                WaitUtils.waitForElementToBeVisible(By.xpath(WINDOW_WAITING_PAYMENT));
                Buttons.enterButtonNextSBP();
                CheckFindElement.checkPaymentWaitingWindow();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно ожидания оплаты");
            });
            step("Проверка кнопки 2 метода вывода", () -> {
                basepage.ClickByXpath(PAYOUT);
                basepage.ClickByXpath(CHOOSE_METOD_2);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkAmountPayout();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно вывода");
            });
            step("Проверка кнопки 1 метода вывода", () -> {
                basepage.ClickByXpath(PAYOUT);
                basepage.ClickByXpath(CHOOSE_METOD_1);
                Buttons.checkButtonsOnWindow();
                CheckFindElement.checkAmountPayout();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно вывода");
            });
            step("Закрытие окна пополнения", () -> {
                basepage.ClickByXpath(BUTTON_CLOSE_WINDOW_PAYMENT);
                CheckFindElement.checkWindowIsGone(WINDOW_PAYMENT,"Окно кошелька ");
                TakeScreenshot.TakeScreenShot("Скриншот: Окно пополнения закрыто");
            });
        } catch (Exception e) {
        }
    }

}

