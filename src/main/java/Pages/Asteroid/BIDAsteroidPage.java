package Pages.Asteroid;

import Pages.Crash.BIDCrashPage;
import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Constants.Constant.XPath.BUTTON_BET_HALF_ASTEROID;

public class BIDAsteroidPage extends BasePage {
    public BIDAsteroidPage(WebDriver driver) {
        super(driver);
    }
    private final By ButtonBetX2= By.xpath("//div[@class='rocket-control__bid-field__control']/button[2]");
    private final By ButtonBetMin= By.xpath("//div[@class='rocket-control__bid-field__control']/button[3]");
    private final By ButtonBetMax= By.xpath("//div[@class='rocket-control__bid-field__control']/button[4]");


    public BIDAsteroidPage enterButtonBetHalf() {
        driver.findElement(By.xpath(BUTTON_BET_HALF_ASTEROID)).click();
        return this;
    }
    public BIDAsteroidPage enterButtonBetX2() {
        driver.findElement(ButtonBetX2).click();
        return this;
    }
    public BIDAsteroidPage enterButtonBetMax() {
        driver.findElement(ButtonBetMax).click();
        return this;
    }
    public BIDAsteroidPage enterButtonBetMin() {
        driver.findElement(ButtonBetMin).click();
        return this;
    }
}
