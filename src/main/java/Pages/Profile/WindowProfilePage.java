package Pages.Profile;

import Pages.Autorization.AutorizationPage;
import Pages.Crash.CrashPage;
import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Constants.Constant.Data.EMAIL_PASSWORD;
import static Constants.Constant.XPath.*;
import static Constants.Constant.XPath.PUSH_TEXT;

public class WindowProfilePage extends BasePage {
    public WindowProfilePage(WebDriver driver) {
        super(driver);
    }
    public void Open(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void inputText(String xpath, String text) throws InterruptedException {
        WebElement inputField = driver.findElement(By.xpath(xpath));
        inputField.clear();
        inputField.sendKeys(text);
        Thread.sleep(10);
    }
    public void checkElements(String xpath){
        try {
            int elements = driver.findElements(By.xpath(xpath)).size();
            if ((elements-1) != 0) {
                System.out.println("Таблица содержит " + (elements-1) + " строк");
                Allure.step("Таблица содержит " + (elements-1) + " строк", Status.PASSED);
            } else {
                System.out.println("Таблица пуста");
                Allure.step("Таблица пуста", Status.PASSED);
            }
            }catch(Exception e){
        }
    }
    public void CheckPushChangeNickname(){
        WebElement element = driver.findElement(By.xpath(PUSH));
        if (element.isDisplayed()) {
            System.out.println("Уведомление видимо");
            WebElement inputElement = driver.findElement(By.xpath(PUSH_TEXT));
            String value1 = inputElement.getText();
            if (value1.equals("Успешно!")){
                System.out.println("Никнейм изменен");
                System.out.println(value1);
                Allure.step("Никнейм изменен", Status.PASSED);
            }else {
                System.out.println("Ошибка");
                System.out.println(value1);
                Allure.step("Ошибка", Status.FAILED);
                if (value1.equals("Никнейм не должен совпадать с предыдущим")) {
                    System.out.println("Никнейм не должен совпадать с предыдущим");
                    Allure.step("Ошибка:Никнейм не должен совпадать с предыдущим", Status.PASSED);
                }else {
                    System.out.println("Другая ошибка");
                    System.out.println(value1);
                    Allure.step("Другая ошибка", Status.FAILED);
                }
            }
        }else {
            System.out.println("Элемент не видим на странице");
            Allure.step("Уведомление не видимо", Status.FAILED);
        }
    }
    public void CheckPushChangePassword(){
        WebElement element = driver.findElement(By.xpath(PUSH));
        if (element.isDisplayed()) {
            System.out.println("Уведомление видимо");
            WebElement inputElement = driver.findElement(By.xpath(PUSH_TEXT));
            String value1 = inputElement.getText();
            if (value1.equals("Успешно!")){
                System.out.println("Пароль изменен!");
                System.out.println(value1);
                Allure.step("Пароль изменен!", Status.PASSED);
            }else {
                System.out.println("Ошибка");
                if (value1.equals("Неверно указан текущий пароль")) {
                    System.out.println("Неверно указан текущий пароль");
                    Allure.step("Ошибка:Неверно указан текущий пароль", Status.PASSED);
                }else {
                    System.out.println("Другая ошибка");
                    Allure.step("Другая ошибка", Status.FAILED);
                }
            }
        }else {
            System.out.println("Элемент не видим на странице");
            Allure.step("Уведомление не видимо", Status.FAILED);
        }
    }

}
