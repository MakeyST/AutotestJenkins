package tests.Pages.pageCases;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import static Constants.Constant.Id.ID_MENU;
import static Constants.Constant.XPath.BUTTON_CASES_PAGE;
import static Constants.Constant.XPath.BUTTON_COIN_PAGE;
import static io.qameta.allure.Allure.step;

public class PageCasesTest extends BaseTest {
    @Test(description = "Проверка перехода на страницу игры через боковую панель",priority = 2,groups = "cases")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Проверка перехода на страницу игры через боковую панель")
    public void checkIsRedirectToPageCases(){
        try {
            step("Переход на страницу игры через боковую панель", () -> {
                //Ждем когда боковое меню будет кликабельным
                WaitUtils.waitForElementToBeClickable(By.id(ID_MENU));
                //Нажимаем на кнопку Игры
                basepage.ClickById(ID_MENU);
                //Ждем пока кнопка Кейсы станет кликабельной
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CASES_PAGE));
                //Нажимаем на кнопку Кейсы
                basepage.ClickByXpath(BUTTON_CASES_PAGE);
                //Проверяем статус-код
                TestHttpResponseCode.TestHttpResponseCode();
                //Ждем полной загрузки страницы
                WaitUtils.waitForPageToLoad();
            });
        }catch(Exception e) {
        }
    }
}
