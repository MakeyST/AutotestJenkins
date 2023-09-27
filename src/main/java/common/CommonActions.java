package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

public class CommonActions {
    /*public static WebDriver createDriver() {


        WebDriver driver = null;


            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default:
                    Assert.fail("Некорректная платформа или браузер" + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize(); //окно будет максимальным
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);//установка неявных ожиданий
            return driver;
        }
    }*/
    private static WebDriver driver;

    private CommonActions() {
        // Приватный конструктор для Singleton
    }

    public static WebDriver createDriver() {
        if (driver == null) {
            // Инициализация WebDriver (в данном случае, ChromeDriver)
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        return driver;
    }

   /* public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }*/
}



