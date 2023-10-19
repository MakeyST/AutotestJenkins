package tests.Pages.Registration;


import io.qameta.allure.Description;

import org.openqa.selenium.*;

import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.io.IOException;

import static Constants.Constant.Data.PASSWORD_LOGIN;
import static Constants.Constant.Data.RANDOM_EMAIL;
import static Constants.Constant.Id.ID_BUTTON_REGISTRATION;
import static Constants.Constant.Urls.GETX_HOME_PAGE;
import static Pages.Autorization.Locators.XPath.WINDOW_AUTORISATION;
import static Pages.Registration.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends BaseTest {

    @Test(description = "Проверка регистрации",priority = 2,groups = "registration")
        @Description("Проверка регистрации")
        public void checkRedirectAfterRegistration () {
            try{
                step("Переход на страницу сайта",()-> {
                    basepage.open(GETX_HOME_PAGE);
                    TestHttpResponseCode.TestHttpResponseCode();
                });
                step("Нажатие кнопки Войти", () -> {
                    basepage.ClickById(ID_BUTTON_REGISTRATION);
                    CheckFindElement.checkWindow(WINDOW_AUTORISATION,"Окно регистрации ");
                });
                step("Нажатие кнопки Email", () -> {
                    basepage.ClickByXpath(BUTTON_EMAIL_REGISTRATION);
                });
                step("Ввод логина", () -> {
                    basepage.InputTextByXpath(INPUT_EMAIL_REGISTRATION,RANDOM_EMAIL);
                });

                step("Ввод пароля", () -> {
                    basepage.InputTextByXpath(INPUT_PASSWORD_REGISTRATION,PASSWORD_LOGIN);
                });

                step("Ввод пароля", () -> {
                    basepage.ClickByXpath(BUTTON_18_YEARS);
                });
                step("Нажатие кнопки Войти", () -> {
                    WaitUtils.waitForPageToLoad();
                    basepage.ClickByXpath(BUTTON_LOGIN_REGISTRATION);
                });
                step("Сравнение элементов ", () -> {
                    TestHttpResponseCode.TestHttpResponseCode();
                });
                step("Сравнение элементов ", () -> {
                    basepage.ClickByXpath(BUTTON_FINISH_REGISTRATION);
                    CheckFindElement.checkWindowIsGone(WINDOW_AUTORISATION,"Окно регистрации ");
                });
                WaitUtils.waitForPageToLoad();
        }catch (Exception e) {
        }
    }
}
