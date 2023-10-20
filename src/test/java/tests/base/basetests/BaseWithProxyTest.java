package tests.base.basetests;

import Domains.FunctionsDomains;
import Pages.Bets.FunctionsBet;
import Pages.Bonuses.FunctionsRoullet;
import Pages.Cases.BarCases;
import Pages.Cases.CasesPage;
import Pages.Casino.Funtions;
import Pages.Coin.EnterButtonTakeCoin;
import Pages.Coin.PlayCoinPage;
import Pages.FAQ.Functions;
import Pages.Miner.EnterButtonTakeMiner;
import Pages.Miner.PlayMinerPage;
import Pages.Payment.Buttons;
import Pages.Profile.WindowProfilePage;
import Pages.base.*;
import common.CommonActionToAll;
import common.CommonActions;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.time.Duration;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseWithProxyTest {
     protected BrowserMobProxy proxy = CommonActions.getProxy();

     protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basepage = new BasePage(driver);

    protected Pages.Miner.PlayMinerPage PlayMinerPage = new PlayMinerPage(driver);

    protected Pages.Miner.EnterButtonTakeMiner EnterButtonTakeMiner = new EnterButtonTakeMiner(driver);

    protected Pages.Coin.PlayCoinPage PlayCoinPage = new PlayCoinPage(driver);

    protected Pages.Coin.EnterButtonTakeCoin EnterButtonTakeCoin = new EnterButtonTakeCoin(driver);

    protected Pages.base.TestHttpResponseCode TestHttpResponseCode = new TestHttpResponseCode(driver);

    protected Pages.base.CheckFindElement CheckFindElement = new CheckFindElement(driver);

    protected Pages.base.WaitUtils WaitUtils = new WaitUtils(driver, Duration.ofSeconds(2));

    protected Pages.base.TakeScreenshot TakeScreenshot = new TakeScreenshot(driver);

    protected Equals Equals = new Equals(driver);

    protected ChengedPosition ChengedPosition = new ChengedPosition(driver);

    protected Pages.Payment.Buttons Buttons = new Buttons(driver);
    protected Pages.Profile.WindowProfilePage WindowProfilePage = new WindowProfilePage(driver);
    protected Pages.FAQ.Functions Functions = new Functions(driver);

    protected Pages.Casino.Funtions Funtions = new Funtions(driver);
    protected Pages.Cases.CasesPage CasesPage = new CasesPage(driver);
    protected Pages.Cases.BarCases BarCases = new BarCases(driver);
    protected Pages.Bets.FunctionsBet FunctionsBet = new FunctionsBet(driver, Duration.ofSeconds(10));
    protected Pages.Bonuses.FunctionsRoullet FunctionsRoullet = new FunctionsRoullet(driver);
    protected Domains.FunctionsDomains FunctionsDomains = new FunctionsDomains(driver);


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

