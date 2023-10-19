package Pages.Bonuses;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;

import java.io.ByteArrayInputStream;

import static Constants.Constant.XPath.*;
import static Pages.Bonuses.Locators.XPath.*;

public class FunctionsRoullet extends BasePage {
    public FunctionsRoullet(WebDriver driver) {
        super(driver);
    }
    public void checkPush(){
            WebElement element = driver.findElement(By.xpath(PUSH));
            if (element.isDisplayed()) {
                System.out.println("Уведомление видимо");
                WebElement inputElement = driver.findElement(By.xpath(PUSH_TEXT));
                String value1 = inputElement.getText();
                if (value1.equals("Поздравляем!")){
                    System.out.println("Уведомление корректное ");
                    System.out.println(value1);
                    Allure.step("Уведомление корректное ", Status.PASSED);
                }else {
                    System.out.println("Ошибка");
                    System.out.println(value1);
                    Allure.step("Ошибка", Status.FAILED);
                    if (value1.equals("Нужно иметь хотя бы один депозит")) {
                        System.out.println("Нужно иметь хотя бы один депозит");
                        Allure.step("Нужно иметь хотя бы один депозит", Status.PASSED);
                        byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                        Allure.addAttachment("Скриншот: Уведомление Нужно иметь хотя бы один депозит ", new ByteArrayInputStream(Page));
                    }else {
                        System.out.println("Другая ошибка");
                        System.out.println(value1);
                        Allure.step("Другая ошибка", Status.FAILED);
                        byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                        Allure.addAttachment("Скриншот: Ошибка при игре в рулетку", new ByteArrayInputStream(Page));
                    }
                }
            }else {
                System.out.println("Уведомление не видимо на странице");
                Allure.step("Уведомление не видимо", Status.FAILED);
                byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Скриншот: Нет уведомления о выигрыше", new ByteArrayInputStream(Page));
            }
        }
    public void checkBalance() throws InterruptedException {
        String balanceBeforeStr = driver.findElement(By.xpath(BALANCE)).getText();
        double balanceBefore = Double.parseDouble(balanceBeforeStr); // Преобразование строки в Integer
        System.out.println(balanceBefore);
        if (balanceBefore > 501){
            Thread.sleep(1000);
            driver.findElement(By.xpath(BUTTON_PREMIUM)).click();
            String balanceAfterStr = driver.findElement(By.xpath(BALANCE)).getText();
            double balanceAfter = Double.parseDouble(balanceAfterStr); // Преобразование строки в Integer
            System.out.println(balanceAfter);
            double difference = balanceBefore - balanceAfter;
            if (difference == 500){
                System.out.println("Премиум куплен");
                Allure.step("Премиум куплен",Status.PASSED);
            }else{
                System.out.println("Списалась другая сумма: "+ difference);
                Allure.step("Списалась другая сумма: "+ difference,Status.FAILED);
            }

        }else{
            System.out.println("Недостаточно средств");
            Allure.step("Недостаточно средств",Status.FAILED);
        }
    }
    public void takePremiumBonus() throws InterruptedException {
        String balanceBeforeStr = driver.findElement(By.xpath(BALANCE)).getText();
        double balanceBefore = Double.parseDouble(balanceBeforeStr); // Преобразование строки в Integer
        System.out.println(balanceBefore);
        driver.findElement(By.xpath(BUTTON_PREMIUM)).click();
        Thread.sleep(1000);
        String balanceAfterStr = driver.findElement(By.xpath(BALANCE)).getText();
        double balanceAfter = Double.parseDouble(balanceAfterStr); // Преобразование строки в Integer
        System.out.println(balanceAfter);
        double difference = balanceBefore - balanceAfter;
        if (difference == 50){
            System.out.println("Премиум бонус получен");
            Allure.step("Премиум бонус получен",Status.PASSED);
        }else{
            WebElement element = driver.findElement(By.xpath(PUSH));
            if (element.isDisplayed()) {
                System.out.println("Появилось уведомление");
                WebElement inputElement = driver.findElement(By.xpath(PUSH_TEXT));
                String value1 = inputElement.getText();
                if (value1.equals("Ошибка")){
                    System.out.println("Уведомление Бонусный баланс не нулевой.");
                    System.out.println(value1);
                    Allure.step("Уведомление Бонусный баланс не нулевой.", Status.PASSED);
                    byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    Allure.addAttachment("Скриншот: Уведомление Бонусный баланс не нулевой.", new ByteArrayInputStream(Page));
                }else {
                    System.out.println("Ошибка");
                    System.out.println(value1);
                    Allure.step("Ошибка", Status.FAILED);
                    byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    Allure.addAttachment("Скриншот: Ошибка при получении премиум бонуса", new ByteArrayInputStream(Page));
                }
            }else {
                System.out.println("Уведомление не видимо на странице");
                Allure.step("Уведомление не видимо", Status.FAILED);
                byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Скриншот: Уведомления нет", new ByteArrayInputStream(Page));
            }

        }

    }
    public void takeCashback() {
        String cashbackBeforeStr = driver.findElement(By.xpath(AMOUNT_CASHBACK)).getText();
        double cashbackBefore = Double.parseDouble(cashbackBeforeStr); // Преобразование строки в Integer
        System.out.println("кэшбек = "+ cashbackBefore);
        String balanceBeforeStr = driver.findElement(By.xpath(BALANCE)).getText();
        double balanceBefore = Double.parseDouble(balanceBeforeStr); // Преобразование строки в Integer
        System.out.println(balanceBefore);
        driver.findElement(By.xpath(BUTTON_TAKE_CASHBACK)).click();
        driver.findElement(By.xpath(RELOAD_BALANCE)).click();
        String balanceAfterStr = driver.findElement(By.xpath(BALANCE)).getText();
        double balanceAfter = Double.parseDouble(balanceAfterStr); // Преобразование строки в Integer
        System.out.println(balanceAfter);
        double difference = balanceBefore - balanceAfter;
        if (difference == cashbackBefore){
            System.out.println("Кэшбек бонус получен");
            Allure.step("Кэшбек бонус получен",Status.PASSED);
        }else{
            System.out.println("Кэшбек бонус получен получен неверно.Получено"+difference+"а должно быть"+cashbackBefore);
            Allure.step("Кэшбек бонус получен получен неверно.Получено"+difference+"а должно быть"+cashbackBefore,Status.FAILED);
        }

    }

}

