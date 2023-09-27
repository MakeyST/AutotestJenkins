package Pages.Crash;

import Pages.Autorization.AutorizationPage;
import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.Constant.Data.EMAIL_LOGIN;
import static Constants.Constant.XPath.BUTTON_PLUS_ONE_CRASH;

public class BIDCrashPage extends BasePage {
    public BIDCrashPage(WebDriver driver) {
        super(driver);
    }
    private final By ButtonBetMinus= By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[1]");
    private final By ButtonBetX10= By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[1]/span");
    private final By ButtonBetX50= By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[2]/span");
    private final By ButtonBetX100= By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[3]/span");
    private final By ButtonBetX200= By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[4]/span");
    private final By ButtonBetMax= By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[5]/span");

    private final By enterBet= By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/span/input");

    public BIDCrashPage enterButtonBetPlus() {
        driver.findElement(By.xpath(BUTTON_PLUS_ONE_CRASH)).click();
        return this;
    }
    public BIDCrashPage enterButtonBetMinus() {
        driver.findElement(ButtonBetMinus).click();
        return this;
    }
    public BIDCrashPage enterButtonBetX10() {
        driver.findElement(ButtonBetX10).click();
        return this;
    }
    public BIDCrashPage enterButtonBetX50() {
        driver.findElement(ButtonBetX50).click();
        return this;
    }
    public BIDCrashPage enterButtonBetX100() {
        driver.findElement(ButtonBetX100).click();
        return this;
    }
    public BIDCrashPage enterButtonBetX200() {
        driver.findElement(ButtonBetX200).click();
        return this;
    }
    public BIDCrashPage enterButtonBetMax() {
        driver.findElement(ButtonBetMax).click();
        return this;
    }
    public BIDCrashPage enterBet(){
        WebElement inputField = driver.findElement(By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/span/input"));
        inputField.clear();
        return this;
    }
}
