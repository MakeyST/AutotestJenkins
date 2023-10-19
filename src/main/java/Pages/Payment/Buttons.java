package Pages.Payment;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;

import java.io.ByteArrayInputStream;

import static Constants.Constant.XPath.*;
import static Pages.Payment.Locators.XPath.*;

public class Buttons extends BasePage {
    public Buttons(WebDriver driver) {
        super(driver);
    }

    //Проверяем все кнопки в окне платежа
    public void checkButtonsOnWindow() {
        driver.findElement(By.xpath(BUTTON_AMOUNT1)).click();
        WebElement inputElement1 = driver.findElement(By.xpath(INPUT_AMOUNT));
        String value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", inputElement1);
        WebElement element1 = driver.findElement(By.xpath(BUTTON_AMOUNT1));
        String text1 = element1.getText();
        if (text1.equals(value1)) {
            System.out.println("Кнопка №1 работает");
            Allure.step("Кнопка №1 работает", Status.PASSED);
        } else {
            System.out.println("Кнопка №1 не работает");
            Allure.step("Кнопка №1 не работает", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Кнопка №1 не работает", new ByteArrayInputStream(Page));
        }
        driver.findElement(By.xpath(BUTTON_AMOUNT2)).click();
        WebElement inputElement2 = driver.findElement(By.xpath(INPUT_AMOUNT));
        String value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", inputElement2);
        WebElement element2 = driver.findElement(By.xpath(BUTTON_AMOUNT2));
        String text2 = element2.getText();
        if (text2.equals(value2)) {
            System.out.println("Кнопка №2 работает");
            Allure.step("Кнопка №2 работает", Status.PASSED);
        } else {
            System.out.println("Кнопка №2 не работает");
            Allure.step("Кнопка №2 не работает", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Кнопка №2 не работает", new ByteArrayInputStream(Page));

        }
        driver.findElement(By.xpath(BUTTON_AMOUNT3)).click();
        WebElement inputElement3 = driver.findElement(By.xpath(INPUT_AMOUNT));
        String value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", inputElement3);
        WebElement element3 = driver.findElement(By.xpath(BUTTON_AMOUNT3));
        String text3 = element3.getText();
        if (text3.equals(value3)) {
            System.out.println("Кнопка №3 работает");
            Allure.step("Кнопка №3 работает", Status.PASSED);
        } else {
            System.out.println("Кнопка №3 не работает");
            Allure.step("Кнопка №3 не работает", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Кнопка №3 не работает", new ByteArrayInputStream(Page));
        }
        driver.findElement(By.xpath(BUTTON_AMOUNT4)).click();
        WebElement inputElement4 = driver.findElement(By.xpath(INPUT_AMOUNT));
        String value4 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", inputElement4);
        WebElement element4 = driver.findElement(By.xpath(BUTTON_AMOUNT4));
        String text4 = element4.getText();
        if (text4.equals(value4)) {
            System.out.println("Кнопка №4 работает");
            Allure.step("Кнопка №4 работает", Status.PASSED);

        } else {
            System.out.println("Кнопка №4 не работает");
            Allure.step("Кнопка №4 не работает", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Кнопка №4 не работает", new ByteArrayInputStream(Page));
        }
        driver.findElement(By.xpath(BUTTON_AMOUNT5)).click();
        WebElement inputElement5 = driver.findElement(By.xpath(INPUT_AMOUNT));
        String value5 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", inputElement5);
        WebElement element5 = driver.findElement(By.xpath(BUTTON_AMOUNT5));
        String text5 = element5.getText();
        if (text5.equals(value5)) {
            System.out.println("Кнопка №5 работает");
            Allure.step("Кнопка №5 работает", Status.PASSED);
        } else {
            System.out.println("Кнопка №5 не работает");
            Allure.step("Кнопка №5 не работает", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Кнопка №5 не работает", new ByteArrayInputStream(Page));
        }
        driver.findElement(By.xpath(BUTTON_AMOUNT6)).click();
        WebElement inputElement6 = driver.findElement(By.xpath(INPUT_AMOUNT));
        String value6 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", inputElement6);
        WebElement element6 = driver.findElement(By.xpath(BUTTON_AMOUNT6));
        String text6 = element6.getText();
        if (text6.equals(value6)) {
            System.out.println("Кнопка №6 работает");
            Allure.step("Кнопка №6 работает", Status.PASSED);
        } else {
            System.out.println("Кнопка №6 не работает");
            Allure.step("Кнопка №6 не работает", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Кнопка №6 не работает", new ByteArrayInputStream(Page));
        }
    }

    //Если есть окно продолжить в окне платежа нажать
    public void enterButtonNextSBP() {
        try {
            driver.findElement(By.xpath(BUTTON_NEXT_SBP)).click();
        }catch (Exception e){

        }
    }
}
