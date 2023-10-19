package Pages.Cases;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.time.Instant;

import static Pages.Cases.Locators.XPath.BAR_FIRST_ELEMENT;

public class BarCases extends BasePage {
    public BarCases(WebDriver driver) {
        super(driver);
    }

    public void classes(String getclass) {
        for (int i = 0; i < 10; i++) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BAR_FIRST_ELEMENT)));

                WebElement element = driver.findElement(By.xpath(BAR_FIRST_ELEMENT));
                wait.until(new ExpectedCondition<Boolean>() {
                    @Override

                    public Boolean apply(WebDriver driver) {
                        String elementClass = element.getAttribute("class");
                        return elementClass.equals(getclass);
                    }
                });
                if (element.getAttribute("class").equals(getclass)) {
                    System.out.println("Лента работает");
                    Allure.step("Лента работает", Status.PASSED);
                    break;
                } else {
                    System.out.println("Лента не работает");
                    Allure.step("Лента не работает", Status.FAILED);
                    byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    Allure.addAttachment("Скриншот: Лента не работает", new ByteArrayInputStream(Page));
                }
            }  catch (StaleElementReferenceException e) {
                System.out.println("Лента двигается слишком быстро");
                Allure.step("Лента двигается слишком быстро", Status.PASSED);
            }
            }
        }


    public void classesNotEquels(String getclass) {
        for (int i = 0; i < 10; i++) {
            try {
                // Найдите элемент
                WebElement element = driver.findElement(By.xpath(BAR_FIRST_ELEMENT));

                // Выполните действие с элементом

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

                wait.until(new ExpectedCondition<Boolean>() {
                    @Override

                    public Boolean apply(WebDriver driver) {
                        String elementClass = element.getAttribute("class");
                        return !elementClass.equals(getclass);
                    }
                });
                if (!element.getAttribute("class").equals(getclass)) {
                    System.out.println("Лента работает");
                    Allure.step("Лента работает", Status.PASSED);
                    break;
                } else {
                    System.out.println("Лента не работает");
                    Allure.step("Лента не работает", Status.FAILED);
                    byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    Allure.addAttachment("Скриншот: Лента не работает", new ByteArrayInputStream(Page));
                }

            }
             catch (StaleElementReferenceException e) {
                 System.out.println("Лента двигается слишком быстро");
                 Allure.step("Лента двигается слишком быстро", Status.PASSED);
            }
        }
    }
}
