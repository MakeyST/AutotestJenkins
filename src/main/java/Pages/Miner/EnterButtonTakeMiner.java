package Pages.Miner;

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
import java.util.List;

import static Constants.Constant.XPath.PUSH;
import static Pages.Miner.Locators.XPath.BUTTON_TAKE_IN_MINER;

public class EnterButtonTakeMiner extends BasePage {
    public EnterButtonTakeMiner(WebDriver driver) {
        super(driver);
    }

    private final By ButtonTake1 = By.xpath("//div[@class='bit-feed__cell bit-feed__cell_bit']/button[2]/span");


    //Нажать кнопку забрать и проверить пуш
    public void clickButtonTake()  {
        WebElement ButtonTake = driver.findElement(By.xpath(BUTTON_TAKE_IN_MINER));
        Actions actions = new Actions(driver);
        if (ButtonTake.isDisplayed()) {
            driver.findElement(By.xpath(BUTTON_TAKE_IN_MINER)).click();
            /*WebElement element = driver.findElement(By.xpath(PUSH));
            boolean displayed = element.isDisplayed();*/
            List<WebElement> displayed = driver.findElements(By.xpath(PUSH));
            if (!displayed.isEmpty()) {
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
                    Allure.addAttachment("Скриншот: Ошибка в уведомлении", new ByteArrayInputStream(Page));
                }
            } else {
                System.out.println("Уведомления нет на странице");
                Allure.step("Уведомление не видимо", Status.PASSED);
                byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Скриншот: Уведомления нет ", new ByteArrayInputStream(Page));
            }
        }else {
            Reporter.log("Проигрыш",true);
            Allure.step("Проигрыш", Status.PASSED);
        }
    }

    private static boolean isClickable(WebElement element, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

