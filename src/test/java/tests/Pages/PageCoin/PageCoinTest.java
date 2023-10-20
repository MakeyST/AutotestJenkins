package tests.Pages.PageCoin;



import io.qameta.allure.Attachment;
import io.qameta.allure.Description;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.net.MalformedURLException;

import static Constants.Constant.Id.ID_MENU;

import static Constants.Constant.XPath.BUTTON_COIN_PAGE;

import static io.qameta.allure.Allure.step;

public class PageCoinTest extends BaseTest {

    public PageCoinTest() throws MalformedURLException {
    }

    @Test(description = "Проверка перехода на страницу игры через боковую панель",priority = 2,groups = "coin")
        @Attachment(value = "Screenshot", type = "image/png")
        @Description("Проверка перехода на страницу игры через боковую панель")
        public void checkIsRedirectToPageCoin(){
            try {
                /*step("Переход на страницу игры ", () -> {
                    basepage.open(GETX_HOME_PAGE);
                    TestHttpResponseCode.TestHttpResponseCode(GETX_HOME_PAGE);
                    WaitUtils.waitForPageToLoad();
                    TakeScreenshot.TakeScreenShot("Скриншот: Домашняя страница");
                });*/

                step("Переход на страницу игры через боковую панель", () -> {
                    WaitUtils.waitForElementToBeClickable(By.id(ID_MENU));
                    basepage.ClickById(ID_MENU);
                    WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_COIN_PAGE));
                    basepage.ClickByXpath(BUTTON_COIN_PAGE);
                    TestHttpResponseCode.TestHttpResponseCode();
                    WaitUtils.waitForPageToLoad();
                });

               /* step("Сверяем количество пользователей в таблице ", () -> {
                    CoinPage.checkCountCardsCoin();
                    Thread.sleep(1000); // Пауза 1 секунда
                    TakeScreenshot.TakeScreenShot("Скриншот: Сверяем количество пользователей в таблице");
                });*/
            }catch(Exception e) {
            }
            }
}
