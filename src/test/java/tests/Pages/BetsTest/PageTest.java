package tests.Pages.BetsTest;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import static Constants.Constant.Id.ID_BUTTON_BETS;
import static Constants.Constant.Id.ID_MENU;
import static Constants.Constant.XPath.BUTTON_COIN_PAGE;
import static io.qameta.allure.Allure.step;

public class PageTest extends BaseTest {
    @Test(description = "Проверка перехода на страницу ставок",priority = 2,groups = "bets")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Проверка перехода на страницу ставок через боковую панель")
    public void checkIsRedirectToPageBets(){
        try {
            step("Переход на страницу ставок через боковую панель", () -> {
                WaitUtils.waitForElementToBeClickable(By.id(ID_BUTTON_BETS));
                basepage.ClickById(ID_BUTTON_BETS);
                WaitUtils.waitForPageToLoad();
                TestHttpResponseCode.TestHttpResponseCode();
                TakeScreenshot.TakeScreenShot("Скриншот:Страница ставки");
            });
        }catch(Exception e) {
        }
    }
}

