package Pages.Profile;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;

import java.io.ByteArrayInputStream;

import static Constants.Constant.XPath.*;
import static Constants.Constant.XPath.PUSH_TEXT;

public class WindowProfilePage extends BasePage {
    public WindowProfilePage(WebDriver driver) {
        super(driver);
    }

    //Проверяем количество элементов в таблице
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

    //Проверяем пуш при изменении нинейма
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

    //Проверяем пуш при изменении пароля
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
    public void CheckPush(){
        //Ищем пуш уведомление
        WebElement element = driver.findElement(By.xpath(PUSH));
        //Проверяем , что оно находится на странице
        if (element.isDisplayed()) {
            System.out.println("Уведомление видимо");
            //Ищем текст пуша
            WebElement inputElement = driver.findElement(By.xpath(PUSH_TEXT));
            String value1 = inputElement.getText();
            //Проверяем текст пуша
            if (value1.equals("Введен недействительный промокод!")){
                System.out.println("Введен недействительный промокод!");
                Allure.step("Введен недействительный промокод!", Status.PASSED);
            }else {
                System.out.println("Ошибка");
                Allure.step("Ошибка", Status.FAILED);
                byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Скриншот: Ошибка", new ByteArrayInputStream(Page));
            }
        }else {
            System.out.println("Элемент не видим на странице");
            Allure.step("Уведомление не видимо", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Уведомления нет", new ByteArrayInputStream(Page));
        }
    }

}
