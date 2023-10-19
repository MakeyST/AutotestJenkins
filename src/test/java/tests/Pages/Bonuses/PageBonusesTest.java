package tests.Pages.Bonuses;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import static Constants.Constant.Id.ID_BUTTON_BONUSES;
import static Constants.Constant.Id.ID_MENU;
import static Constants.Constant.XPath.BUTTON_ASTEROID_PAGE;
import static io.qameta.allure.Allure.step;

public class PageBonusesTest extends BaseTest {
    @Test(description = "Проверка открытия страницы Бонусы",priority = 2,groups = "bonuses")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Проверка открытия страницы бонусы ")
    public void checkIsRedirectingToPageBonuses(){
        try{
            step("Переход на страницу бонусы ", () -> {
                WaitUtils.waitForElementToBeClickable(By.id(ID_BUTTON_BONUSES));
                basepage.ClickById(ID_BUTTON_BONUSES);
                TestHttpResponseCode.TestHttpResponseCode();
                WaitUtils.waitForPageToLoad();
            });
        }catch (Exception e) {
        }
    }

}
