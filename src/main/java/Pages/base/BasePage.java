package Pages.base;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.HttpClient;
import java.time.Duration;

import static Constants.Constant.TimeoutVariable.EXPLICIT_WAIT;
import static Constants.Constant.Urls.GETX_HOME_PAGE;

public class BasePage {
    protected WebDriver driver;//создаем экземпляр драйвера

    public BasePage(WebDriver driver){ //создаем конструктор

        this.driver = driver;//закладываем туда драйвер
    }

    public void open(String url){
        driver.get(url);
    }


}
