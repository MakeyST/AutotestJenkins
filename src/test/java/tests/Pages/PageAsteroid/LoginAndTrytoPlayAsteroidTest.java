package tests.Pages.PageAsteroid;



import io.qameta.allure.Attachment;
import io.qameta.allure.Description;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;



import static Constants.Constant.XPath.*;
import static Pages.Asteroid.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class LoginAndTrytoPlayAsteroidTest extends BaseTest {

    @Test(description = "Проверка авторизации и игры в Астероид",priority = 2,groups = "asteroid")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Смотрим тест в целом")
    public void checkButtonPlayAsteroid(){
        try {
           /* step("Переход на страницу игры ", () -> {
                basepage.open(ASTEROID_GAME_PAGE);
                TestHttpResponseCode.TestHttpResponseCode(ASTEROID_GAME_PAGE);
                TakeScreenshot.TakeScreenShot("Скриншот: Страница Астериод");
            });
            step("Нажатие кнопки Войти", () -> {
                ButtonAsteroidLoginPage.entergameasteroidlogin();
                TakeScreenshot.TakeScreenShot("Скриншот: Окно авторизации");
            });
            step("Ввод логина ", () -> {
                AutorizationPage.enteremail();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот логина при авторизации в игре Астероид");
            });
            step("Ввод пароля", () -> {
                AutorizationPage.enterpassword();
                TakeScreenshot.TakeScreenShot("Скриншот: Скриншот пароля при авторизации в игре Астероид");
            });
            step("Нажатие кнопки Войти ", () -> {
                AutorizationPage.ButtonLogin();
                WaitUtils.waitForPageToLoad();
                TakeScreenshot.TakeScreenShot("Скриншот: Страница игры авторизованного пользователя");
            });*/
            step("Увеличение ставки вдвое",() ->{
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_BET_X2_ASTEROID));
                basepage.ClickByXpath(BUTTON_BET_X2_ASTEROID);
                Equals.equals(BET_ASTEROID,"2.00","Кнопка Увеличение ставки вдвое работает","Кнопка Увеличение ставки вдвое не работает");
            });

            step("Уменьшение ставки вдвое",() ->{
                basepage.ClickByXpath(BUTTON_BET_HALF_ASTEROID);
                Equals.equals(BET_ASTEROID,"1.00","Кнопка уменьшения ставки вдвое работает","Кнопка уменьшения ставки вдвое не работает");
            });

            step("Проверка повышения ставки на max",() ->{
                basepage.ClickByXpath(BUTTON_BET_MAX_ASTEROID);
                String ExpectedBet = driver.findElement(By.xpath(BALANCE)).getText();
                Equals.equals(BET_ASTEROID,ExpectedBet,"Кнопка повышения ставки на max работает","Кнопка повышения ставки на max не работает");
                WaitUtils.waitForPageToLoad();
            });

            step("Проверка ставка Min",() ->{
                basepage.ClickByXpath(BUTTON_BET_MIN_ASTEROID);
                Equals.equals(BET_ASTEROID,"1.00","Ставка Min работает","Ставка Min не работает");
            });

            step("Нажатие кнопки Играть", () -> {
                WaitUtils.WaitButtonToBeClickableAndClick(BUTTON_PLAY_ASTEROID);
                CheckFindElement.CheckPush();
                WaitUtils.waitForPageToLoad();
            });
        }catch (Exception e) {
        }
        }
}
