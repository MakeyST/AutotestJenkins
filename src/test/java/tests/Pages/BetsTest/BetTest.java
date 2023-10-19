package tests.Pages.BetsTest;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import static Constants.Constant.Id.ID_BUTTON_BETS;
import static Pages.Bets.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class BetTest extends BaseTest {
    @Test(description = "Проверка выставления ставки",priority = 2,groups = "bets")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Проверка выставления ставки")
    public void checkToMakeABet(){
        try {
            step("Открытие окна Купон", () -> {
                WaitUtils.waitForPageToLoad();
                FunctionsBet.getShadowDOM();
            });
            step("Открытие окна Купон", () -> {
               WaitUtils.waitForPageToLoad();
               Thread.sleep(5000);
               FunctionsBet.findElementAnsClickInShadowDOM(By.xpath(BUTTON_WINDOW_COUPON));
               TakeScreenshot.TakeScreenShot("Скриншот: Окно купон");
            });
            step("Выбираем случайную ставку", () -> {
                WaitUtils.waitForPageToLoad();
                FunctionsBet.findElementAnsClickInShadowDOM(By.id(BUTTON_RANDOM_BET));
                TakeScreenshot.TakeScreenShot("Скриншот: Выбор случайной ставки");
            });
            step("Проверяем что нет ошибок в авторизации", () -> {
                WaitUtils.waitForPageToLoad();
                FunctionsBet.checkInvisabilityLogin();
                TakeScreenshot.TakeScreenShot("Скриншот: Нет кнопки залогиниться");
            });
            step("Выставляем сумму ставки ", () -> {
                WaitUtils.waitForPageToLoad();
                FunctionsBet.enterTheAmountInInput();
                TakeScreenshot.TakeScreenShot("Скриншот: Выставление суммы ставки");
            });
            step("Нажимаем кнопку поставить ", () -> {
                WaitUtils.waitForPageToLoad();
                FunctionsBet.findElementAnsClickInShadowDOM(By.xpath(BUTTON_TO_MAKE_A_BET));
                TakeScreenshot.TakeScreenShot("Скриншот: Выставление суммы ставки");
            });
            step("Проверяем уведомление ", () -> {
                WaitUtils.waitForPageToLoad();
                FunctionsBet.comparison();
                TakeScreenshot.TakeScreenShot("Скриншот: Выставление суммы ставки");
            });


        }catch(Exception e) {
        }
    }
}