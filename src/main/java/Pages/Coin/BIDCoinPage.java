package Pages.Coin;

import Pages.base.BasePage;
import Pages.base.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

import static Constants.Constant.XPath.*;

public class BIDCoinPage extends BasePage {
    private Instant wait;

    public BIDCoinPage(WebDriver driver) {
        super(driver);
    }

    public BIDCoinPage enterButtonBetHalf() {
        driver.findElement(By.xpath(BUTTON_BET_HALF_COIN)).click();
        return this;
    }
    public BIDCoinPage enterButtonBetX2() {
        driver.findElement(By.xpath(BUTTON_BET_X2_COIN)).click();
        return this;
    }
    public BIDCoinPage enterButtonBetMax() {
        driver.findElement(By.xpath(BUTTON_BET_MAX_COIN)).click();
        return this;
    }
    public BIDCoinPage enterButtonBetMin() {
        driver.findElement(By.xpath(BUTTON_BET_MIN_COIN)).click();
        return this;
    }
}
