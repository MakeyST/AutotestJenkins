package Pages.Crash;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.Constant.XPath.CHENGER_CRASH;

public class BIDCrashAutoStopPage extends BasePage {
    public BIDCrashAutoStopPage(WebDriver driver) {
        super(driver);
    }
    private final By enterAutostopUp= By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[1]/button[2]");
    private final By enterAutostopDown= By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[1]/button[1]");
    private final By enterAutostopOn= By.xpath("//div[@class='bit-feed__row']/div[3]/div/label/span/span[1]");
    public BIDCrashAutoStopPage enterButtonUpAutostop() {
        driver.findElement(enterAutostopUp).click();
        return this;
    }
    public BIDCrashAutoStopPage enterButtonDownAutostop() {
        driver.findElement(enterAutostopDown).click();
        return this;
    }
    public BIDCrashAutoStopPage enterButtonOnAutostop() {
        driver.findElement(enterAutostopOn).click();
        return this;
    }

}
