package tests.Pages.pageMiner;



import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;


import java.net.MalformedURLException;

import static Constants.Constant.Id.ID_MENU;

import static Constants.Constant.XPath.BUTTON_MINER_PAGE;
import static io.qameta.allure.Allure.step;

@DisplayName("фыыфв")
public class PageMinerTest extends BaseTest {
    public PageMinerTest() throws MalformedURLException {
    }

    @Test(description = "Проверка перехода на страницу игры через боковую панель",priority = 1,groups = "miner")
    @Description("Проверка перехода на страницу игры через боковую панель")
    public void checkIsRedirectToPageMiner(){
        try {
           /* step("Переход на страницу игры ", () -> {
                basepage.open(GETX_HOME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode(GETX_HOME_PAGE);
                TakeScreenshot.TakeScreenShot("Скриншот: Переход на омашнюю страницу");
            });*/
            step("Переход на страницу игры через боковую панель", () -> {
                WaitUtils.waitForElementToBeClickable(By.id(ID_MENU));
                basepage.ClickById(ID_MENU);
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_MINER_PAGE));
                basepage.ClickByXpath(BUTTON_MINER_PAGE);
                TestHttpResponseCode.TestHttpResponseCode();
            });
           /* step("Сверяем количество пользователей в таблице ", () -> {
                MinerPage.checkCountCardsMiner();
                WaitUtils.waitForPageToLoad();
                TakeScreenshot.TakeScreenShot("Скриншот: Сверяем количество пользователей в таблице");
            });*/
        }catch(Exception e) {
        }
    }
}
