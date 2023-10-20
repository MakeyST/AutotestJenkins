package Pages.base;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.HttpClient;
import java.time.Duration;

import static Constants.Constant.TimeoutVariable.EXPLICIT_WAIT;
import static Constants.Constant.Urls.GETX_HOME_PAGE;
import static Pages.FAQ.Locators.XPath.BUTTON_WALLET_QUESTIONS;

public class BasePage {
    protected WebDriver driver;//создаем экземпляр драйвера

    public BasePage(WebDriver driver){ //создаем конструктор

        this.driver = driver;//закладываем туда драйвер
    }

    public void open(String url){
        driver.get(url);
    }

    //Найти и нажать по Xpath
    public void ClickByXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    //Найти и нажать по ID
    public void ClickById(String id){
        driver.findElement(By.id(id)).click();
    }
    //Найти по XPATH и ввести в поле ... текст ...
    public void InputTextByXpath(String xpath, String text) throws InterruptedException {
        WebElement inputField = driver.findElement(By.xpath(xpath));
        inputField.clear();
        inputField.sendKeys(text);
    }
    //Найти по ID и ввести в поле ... текст ...
    public void InputTextById (String id, String text) throws InterruptedException {
        WebElement inputField = driver.findElement(By.id(id));
        inputField.clear();
        inputField.sendKeys(text);
    }
    //Навести курсор на элемент
    public void MoveToElement (String xpath){
        WebElement elementToHover = driver.findElement(By.xpath(xpath));
        Actions actions = new Actions(driver);
        // Наведите курсор на элемент
        actions.moveToElement(elementToHover).perform();
    }
}
