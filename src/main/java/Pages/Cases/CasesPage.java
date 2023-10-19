package Pages.Cases;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static Constants.Constant.XPath.*;

public class CasesPage extends BasePage {
    private WebDriverWait wait;
    public void WaitUtils(WebDriver driver, Duration timeout) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
    }
    public CasesPage(WebDriver driver) {
        super(driver);
    }
    public double balance(String com){
        String balanceBeforeStr = driver.findElement(By.xpath(BALANCE)).getText();
        double balanceBefore = Double.parseDouble(balanceBeforeStr); // Преобразование строки в Integer
        System.out.println(com + balanceBefore);
        return balanceBefore;
    }
    public String difference(Integer differenceBalaneces){
        long roundedDifference = Math.round(differenceBalaneces);
        int differenceBalanece = (int) roundedDifference;
        String myString = Double.toString(differenceBalanece);
        myString = myString.replaceAll("\\.0$", "");
        return myString;
    }

    public void CheckPush() {
        //Ищем пуш уведомление
        WebElement element = driver.findElement(By.xpath(PUSH));
        String value = element.getText();
        //Проверяем , что оно находится на странице
        if (element.isDisplayed()) {
            System.out.println("Появилось уведомление");
            //Ищем текст пуша
            WebElement inputElement = driver.findElement(By.xpath(PUSH));
            String value1 = inputElement.getText();
            //Проверяем текст пуша
            if (value1.contains("Выигрыш")){
                System.out.println(value);
                System.out.println("Выигрыш");
                Allure.step("Открытие кейса работает", Status.PASSED);
            }else {
                System.out.println("Ошибка");
                Allure.step("Ошибка", Status.FAILED);
                byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Скриншот: Ошибка в открытии кейса", new ByteArrayInputStream(Page));
                System.out.println(value);
            }
        }else {
            System.out.println("Элемент не видим на странице");
            Allure.step("Уведомление не видимо", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Уведомления нет", new ByteArrayInputStream(Page));
        }
    }

    public String Value(){
        WebElement element = driver.findElement(By.xpath(PUSH));
        String value = element.getText();
        return value;
    }

    public void Amount(String myString,String value){
        if (value.contains(myString)){
            System.out.println("Сумма в пуш верная");
            System.out.println(myString);
            Allure.step("Сумма в пуш верная", Status.PASSED);

        }else {
            System.out.println("Сумма в пуш не верная");
            System.out.println(myString);
            Allure.step("Сумма в пуш не верная", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Сумма в пуш не верная", new ByteArrayInputStream(Page));
        }
    }
}
