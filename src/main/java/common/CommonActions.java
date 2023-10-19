package common;

import Pages.Casino.Funtions;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import static io.restassured.RestAssured.proxy;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static Constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

public class CommonActions {

    private static WebDriver driver;
    private static BrowserMobProxy proxy;
    private ChromeOptions chromeOptions;
    public static BrowserMobProxy getProxy() {
        if (proxy == null) {
            proxy = new BrowserMobProxyServer();

            proxy.start(443);
            proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
            // Получение Selenium Proxy объекта для настройки браузера
            Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
        }
        return proxy;
    }

    public static WebDriver createDriver() {
        if (driver == null) {
            Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            // Настройка ChromeOptions для использования прокси
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setProxy(seleniumProxy);
            chromeOptions.setAcceptInsecureCerts(true);
            chromeOptions.addArguments("--ignore-certificate-errors");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        return driver;



    }


}



