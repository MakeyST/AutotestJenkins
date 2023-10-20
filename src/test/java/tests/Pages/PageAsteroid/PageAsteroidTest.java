package tests.Pages.PageAsteroid;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.model.Status;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;

import static Constants.Constant.Id.ID_MENU;
import static Constants.Constant.Urls.GETX_HOME_PAGE;
import static Constants.Constant.XPath.BUTTON_ASTEROID_PAGE;
import static Constants.Constant.XPath.BUTTON_COIN_PAGE;
import static io.qameta.allure.Allure.step;

public class PageAsteroidTest extends BaseTest {
    public PageAsteroidTest() throws MalformedURLException {
    }

    @Test(description = "Проверка открытия страницы игры Астероид через боковую панель",priority = 2,groups = "asteroid")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Проверка открытия страницы игры Астероид через боковую панель ")
    public void checkIsRedirectingToPageAsteroid(){
        try{
       /* step("Переход на страницу сайта", () -> {
            basepage.open(GETX_HOME_PAGE);
               TestHttpResponseCode.TestHttpResponseCode(GETX_HOME_PAGE);
               TakeScreenshot.TakeScreenShot("Скриншот: Домашняя страница");
        });
*/
        step("Переход на страницу игры ", () -> {
            WaitUtils.waitForElementToBeClickable(By.id(ID_MENU));
            basepage.ClickById(ID_MENU);
            WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_ASTEROID_PAGE));
            basepage.ClickByXpath(BUTTON_ASTEROID_PAGE);
            TestHttpResponseCode.TestHttpResponseCode();
            WaitUtils.waitForPageToLoad();
        });
       /* step("Сравнение количества игроков", () -> {
            AsteroidPage.checkCountCardsAsteroid();
            WaitUtils.waitForPageToLoad();
            TakeScreenshot.TakeScreenShot("Скриншот: Сверяем количество пользователей в таблице");
        });*/
        }catch (Exception e) {
        }
    }
}
