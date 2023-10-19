package tests.Pages.pageCrash;



import io.qameta.allure.Description;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;


import static Constants.Constant.Id.ID_MENU;

import static Constants.Constant.XPath.BUTTON_CRASH_PAGE;
import static io.qameta.allure.Allure.step;

public class PageCrashTest extends BaseTest {

    @Test(description = "Проверка входа на страницу игры Краш ччерез боковую панель",priority = 2,groups = "crash")
    @Description("Проверка входа на страницу игры Краш ччерез боковую панель")
    public void checkIsRedirectToPageCrash(){
        try {
           /* step("Переход на страницу сайта ", () -> {
                basepage.open(GETX_HOME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode(GETX_HOME_PAGE);
                TakeScreenshot.TakeScreenShot("Скриншот: Переход на омашнюю страницу");
            });*/
            step("Переход на страницу игры через боковую панель ", () -> {
                WaitUtils.waitForElementToBeClickable(By.id(ID_MENU));
                basepage.ClickById(ID_MENU);
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CRASH_PAGE));
                basepage.ClickByXpath(BUTTON_CRASH_PAGE);
                TestHttpResponseCode.TestHttpResponseCode();
            });
            /*step("Сравнение количества играков в таблице", () -> {
                CrashPage.checkCountCardsCrash();
                TakeScreenshot.TakeScreenShot("Скриншот: Сверяем количество пользователей в таблице");
            });*/
        }catch (Exception e){

        }
    }

}
