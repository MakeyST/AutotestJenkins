package tests.base.basetests;


import Domains.FunctionsDomains;
import Pages.Bets.FunctionsBet;
import Pages.Bonuses.FunctionsRoullet;
import Pages.Cases.BarCases;
import Pages.Cases.CasesPage;
import Pages.Coin.EnterButtonTakeCoin;
import Pages.Coin.PlayCoinPage;
import Pages.FAQ.Functions;
import Pages.Miner.EnterButtonTakeMiner;
import Pages.Miner.PlayMinerPage;
import Pages.Payment.Buttons;
import Pages.Profile.WindowProfilePage;
import Pages.base.*;
import common.CommonActionToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.time.Duration;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

   /* protected BrowserMobProxy proxy = CommonActions.getProxy();

    protected WebDriver driver = CommonActions.createDriver();*/
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
