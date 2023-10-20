package tests.Pages.Autorisation;



import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;


import java.net.MalformedURLException;

import static Constants.Constant.Data.*;
import static Constants.Constant.Id.*;

import static Constants.Constant.Urls.GETX_HOME_PAGE;

import static Pages.Autorization.Locators.XPath.WINDOW_AUTORISATION;
import static io.qameta.allure.Allure.step;



public class AutorisationTest extends BaseTest {

    public AutorisationTest() throws MalformedURLException {
    }

    @Test(description = "Проверка авторизации",priority = 1,groups = "autorisation")
    @Severity(value= SeverityLevel.CRITICAL)
    @Description("Проверка авторизации")
    public void checkRedirectAfterAutorisation() {
        try {
            step("Переход на страницу сайта", () -> {
                basepage.open(GETX_HOME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode();
            });
            step("Нажатие кнопки Войти", () -> {
                basepage.ClickById(ID_BUTTON_LOG_IN);
                CheckFindElement.checkWindow(WINDOW_AUTORISATION,"Окно авторизациия ");
            });

            step("Ввод логина", () -> {
                basepage.InputTextById(ID_INPUT_EMAIL,EMAIL_LOGIN);
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации");
            });

            step("Ввод пароля", () -> {
                basepage.InputTextById(ID_INPUT_PASSWORD,PASSWORD_LOGIN);
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации");
            });

            step("Нажатие кнопки Войти", () -> {
                basepage.ClickById(ID_BUTTON_LOG_IN_WINAUT);
            });

            step("Сравнение элементов ", () -> {
                WaitUtils.WaitForElementToBeInvisability(WINDOW_AUTORISATION);
                CheckFindElement.checkWindowIsGone(WINDOW_AUTORISATION,"Окно авторизации ");
                TestHttpResponseCode.TestHttpResponseCode();
            });

        } catch (Exception e) {
        }
    }
}




