package tests.Pages.PageCoin;


import io.qameta.allure.Attachment;
import io.qameta.allure.Description;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;


import static Constants.Constant.XPath.*;
import static Pages.Coin.Locators.XPath.*;
import static io.qameta.allure.Allure.step;


public class LoginAndPlayCoinTest extends BaseTest {


    @Test(description = "Проверка авторизации и игры в монетка",priority = 2,groups = "coin")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Смотрим тест в целом")
    public void checkPlayCoin() {
        try {
            /*step("Переход на страницу игры ", () -> {
                basepage.open(COIN_GAME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode(COIN_GAME_PAGE);
                WaitUtils.waitForPageToLoad();
                TakeScreenshot.TakeScreenShot("Скриншот: Страница Монетка");
            });

            step("Нажатие кнопки 'Войти'", () -> {
                ButtonCoinLoginPage.entergamecoinlogin();
                WaitUtils.waitForPageToLoad();
                CheckFindElement.checkWindow(WINDOW_AUTORISATION);
            });

            step("Ввод логина", () -> {
                AutorizationPage.enteremail();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации в игре монетка");
            });
            step("Ввод пароля", () -> {
                AutorizationPage.enterpassword();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации в игре монетка");
            });
            step("Нажатие кнопки 'Войти'", () -> {
                AutorizationPage.ButtonLogin();
                TakeScreenshot.TakeScreenShot("Скриншот: Страница Монетка , авторизованного пользователя");
                WaitUtils.waitForPageToLoad();
            });
*/
            step("Увеличение ставки вдвое",() ->{
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_BET_X2_COIN));
                basepage.ClickByXpath(BUTTON_BET_X2_COIN);
                WaitUtils.waitForPageToLoad();
                Equals.equals(BET_COIN,"2.00","Кнопка Увеличение ставки вдвое работает","Кнопка Увеличение ставки вдвое не работает");
            });

            step("Уменьшение ставки вдвое",() ->{
                basepage.ClickByXpath(BUTTON_BET_HALF_COIN);
                WaitUtils.waitForPageToLoad();
                Equals.equals(BET_COIN,"1.00","Кнопка уменьшения ставки вдвое работает","Кнопка уменьшения ставки вдвое не работает");
            });

            step("Проверка повышения ставки на max",() ->{
                basepage.ClickByXpath(BUTTON_BET_MAX_COIN);
                WaitUtils.waitForPageToLoad();
                String ExpectedBet = driver.findElement(By.xpath(BALANCE)).getText();
                Equals.equals(BET_COIN,ExpectedBet,"Кнопки повышения ставки на max работает","Кнопки повышения ставки на max не работает");
            });

            step("Проверка ставка Min",() ->{
                basepage.ClickByXpath(BUTTON_BET_MIN_COIN);
                WaitUtils.waitForPageToLoad();
                Equals.equals(BET_COIN,"1.00","Ставка Min работает","Ставка Min не работает");
            });

            step("Нажатие кнопки 'Играть'", () -> {
                WaitUtils.WaitButtonToBeClickableAndClick(BUTTON_PLAY_COIN);
            });

            step("Выбор одной из ячеек", () -> {
                PlayCoinPage.enterSlotCoin();
                WaitUtils.waitForPageToLoad();
            });

            step("Нажатие кнопки 'Забрать'", () -> {
                EnterButtonTakeCoin.clickButtonTake();
                WaitUtils.waitForPageToLoad();
            });
        }catch (Exception e) {
        }
    }


}




