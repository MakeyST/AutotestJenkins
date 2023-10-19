package Pages.Coin;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static Constants.Constant.XPath.*;
import static Pages.Coin.Locators.XPath.BUTTON_TAKE_IN_COIN;
import static org.springframework.util.ClassUtils.isVisible;

public class EnterButtonTakeCoin extends BasePage {
    public EnterButtonTakeCoin(WebDriver driver) {
        super(driver);
    }

    //Проверяем появление пуша и его текст
    public void clickButtonTake() throws InterruptedException {
        WebElement ButtonTake = driver.findElement(By.xpath(BUTTON_TAKE_IN_COIN));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        if (ButtonTake.isDisplayed()) {
            driver.findElement(By.xpath(BUTTON_TAKE_IN_COIN)).click();
            WebElement element = driver.findElement(By.xpath(PUSH));
            if (element.isDisplayed()) {
                System.out.println("Уведомление видимо");
                Allure.step("Проверка успешна", Status.PASSED);
                WebElement inputElement = driver.findElement(By.xpath(PUSH));
                String value1 = inputElement.getText();
                boolean contains = value1.contains("Выигрыш");
                if (contains){
                    System.out.println("Ставка выиграла");
                    Allure.step("Ставка выиграла", Status.PASSED);
                }else {
                    System.out.println("Ошибка");
                    Allure.step("Ошибка", Status.FAILED);
                    byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    Allure.addAttachment("Скриншот: Ошибка при ставке" , new ByteArrayInputStream(Page));
                }
            } else {
                System.out.println("Элемент не видим на странице");
                Allure.step("Уведомление не видимо", Status.FAILED);
                byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Скриншот: Уведомления нет ", new ByteArrayInputStream(Page));
            }
        }else {
            Reporter.log("Проигрыш",true);
            Allure.step("Проигрыш", Status.PASSED);
        }
    }

}
