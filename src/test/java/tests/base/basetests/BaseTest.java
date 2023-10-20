package tests.base.basetests;


import Domains.FunctionsDomains;
import Pages.Bets.FunctionsBet;
import Pages.Bonuses.FunctionsRoullet;
import Pages.Cases.BarCases;
import Pages.Cases.CasesPage;
import Pages.Casino.Funtions;
import Pages.Coin.*;
import Pages.FAQ.Functions;
import Pages.Miner.*;
import Pages.Payment.Buttons;
import Pages.Profile.WindowProfilePage;
import Pages.base.*;
import common.CommonActionToAll;
import common.CommonActions;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.time.Duration;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;
import static io.restassured.RestAssured.proxy;

public class BaseTest {

    protected WebDriver driver = CommonActionToAll.createDriver();

    protected BasePage basepage = new BasePage(driver);

    protected PlayMinerPage PlayMinerPage = new PlayMinerPage(driver);

    protected EnterButtonTakeMiner EnterButtonTakeMiner = new EnterButtonTakeMiner(driver);

    protected PlayCoinPage PlayCoinPage = new PlayCoinPage(driver);

    protected EnterButtonTakeCoin EnterButtonTakeCoin = new EnterButtonTakeCoin(driver);

    protected TestHttpResponseCode TestHttpResponseCode = new TestHttpResponseCode(driver);

    protected CheckFindElement CheckFindElement = new CheckFindElement(driver);

    protected WaitUtils WaitUtils = new WaitUtils(driver, Duration.ofSeconds(2));

    protected TakeScreenshot TakeScreenshot = new TakeScreenshot(driver);

    protected Equals Equals = new Equals(driver);

    protected ChengedPosition ChengedPosition = new ChengedPosition(driver);

    protected Buttons Buttons = new Buttons(driver);
    protected WindowProfilePage WindowProfilePage = new WindowProfilePage(driver);
    protected Functions Functions = new Functions(driver);

    protected Funtions Funtions = new Funtions(driver);
    protected CasesPage CasesPage = new CasesPage(driver);
    protected BarCases BarCases = new BarCases(driver);
    protected FunctionsBet FunctionsBet = new FunctionsBet(driver, Duration.ofSeconds(10));
    protected FunctionsRoullet FunctionsRoullet = new FunctionsRoullet(driver);
    protected FunctionsDomains FunctionsDomains = new FunctionsDomains(driver);

    public BaseTest() throws MalformedURLException {
    }


    @BeforeTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();//очистка куки
            javascriptExecutor.executeScript("window.sessionStorage.clear()");//очистка истории сессий
        }

    }
    @AfterSuite(alwaysRun = true) //alwaysRun чтобы он в любом случае драйвер освобождал ресурс
    public void close() {

        if (HOLD_BROWSER_OPEN) {
            driver.quit();//освобождаем ресурс
        }
    }





}
