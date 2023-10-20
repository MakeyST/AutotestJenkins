package tests.Pages.Bonuses;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.net.MalformedURLException;

import static Constants.Constant.Id.ID_BUTTON_BONUSES;
import static Constants.Constant.XPath.PUSH;
import static Pages.Bonuses.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class BonusesTest extends BaseTest {
    public BonusesTest() throws MalformedURLException {
    }

    @Test(description = "Проверка страницы Бонусы", priority = 2, groups = "bonuses")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Проверка страницы бонусы ")
    public void checkBonuses() {
        try {
            step("Открытие рулетки", () -> {
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_OPEN_ROULLET));
                basepage.ClickByXpath(BUTTON_OPEN_ROULLET);
                CheckFindElement.checkWindow(WINDOW_ROULLET, " окна рулетки");
                WaitUtils.waitForPageToLoad();
            });
            step("Проверка игры в рулетку", () -> {
                basepage.ClickByXpath(BUTTON_START_ROULLET);
                WaitUtils.waitForElementToBeVisible(By.xpath(PUSH));
                FunctionsRoullet.checkPush();
            });
            step("Проверка появления таймера ", () -> {
                WaitUtils.waitForElementToBeVisible(By.xpath(TIMER_IN_REULLET));
            });
            step("Закрытие окна рулетки ", () -> {
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CLOSE_WINDOW_ROULLET));
                basepage.ClickByXpath(BUTTON_CLOSE_WINDOW_ROULLET );
                CheckFindElement.checkWindowIsGone(WINDOW_ROULLET,"окно рулетки ");
            });
           /* step("Покупка Премиума ", () -> {
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_PREMIUM));
                basepage.MoveToElement(BUTTON_PREMIUM);
                FunctionsRoullet.checkBalance();
                TakeScreenshot.TakeScreenShot("Скриншот: Покупка Премиума");
            });*/
            step("Получение премиум бонуса ", () -> {
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_PREMIUM));
                FunctionsRoullet.takePremiumBonus();
            });
           /* step("Получение кэшбека ", () -> {
                basepage.MoveToElement(BUTTON_TAKE_CASHBACK);
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_TAKE_CASHBACK));
                FunctionsRoullet.takeCashback();
                TakeScreenshot.TakeScreenShot("Скриншот: забрать кэшбек");
            });*/
            step("Проверка открытия окна Подпишись на Telegram ", () -> {
                basepage.MoveToElement(BUTTON_SUBSCRIBE_TO_TELEGRAM);
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_SUBSCRIBE_TO_TELEGRAM));
                basepage.ClickByXpath(BUTTON_SUBSCRIBE_TO_TELEGRAM);
                CheckFindElement.checkWindow(WINDOW_SUBSCRIBE_TO_TELEGRAM,"окно бонуса Подпишись на Telegram");
            });
            step("Проверка закрытия окна Подпишись на Telegram ", () -> {
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CLOSE_WINDOW_SUBSCRIBE_TO_TELEGRAM));
                basepage.ClickByXpath(BUTTON_CLOSE_WINDOW_SUBSCRIBE_TO_TELEGRAM);
                CheckFindElement.checkWindowIsGone(WINDOW_SUBSCRIBE_TO_TELEGRAM,"окно бонуса Подпишись на Telegram");
            });
            step("Проверка открытия окна Бонус за репост ", () -> {
                basepage.MoveToElement(BUTTON_REPOST_VK);
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_REPOST_VK));
                basepage.ClickByXpath(BUTTON_REPOST_VK);
                CheckFindElement.checkWindow(WINDOW_REPOST_VK,"окно Бонус за репост");
            });
            step("Проверка закрытия окна Бонус за репост ", () -> {
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CLOSE_WINDOW_REPOST_VK));
                basepage.ClickByXpath(BUTTON_CLOSE_WINDOW_REPOST_VK);
                CheckFindElement.checkWindowIsGone(WINDOW_REPOST_VK,"окно Бонус за репост");
            });
            step("Проверка перехода к стримерам ", () -> {
                basepage.MoveToElement(BUTTON_FOLLOW_STREAMERS);
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_FOLLOW_STREAMERS));
                basepage.ClickByXpath(BUTTON_FOLLOW_STREAMERS);
                TestHttpResponseCode.TestHttpResponseCode();
            });


        } catch (Exception e) {
        }
    }
}