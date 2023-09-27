package Pages.Miner;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BIDBetMinerPage extends BasePage {
    public BIDBetMinerPage(WebDriver driver) {
        super(driver);
    }
    public final By ButtonBetPlus = By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[2]");
    public final By ButtonBetMinus = By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[1]/div/button[1]");
    public final By ButtonBetMin = By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[2]/button[1]");
    public final By ButtonBetPlus10 = By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[2]/button[2]");
    public final By ButtonBetPlus50 = By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[2]/button[3]");
    public final By ButtonBetPlus100 = By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[2]/button[4]");
    public final By ButtonBetPlus200 = By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[2]/button[5]");
    public final By ButtonBetPlusMax = By.xpath("//div[@class='bit-feed__row']/div[3]/div/div[2]/button[6]");

    public BIDBetMinerPage enterButtonBetPlus(){
        driver.findElement(ButtonBetPlus).click();
        return this;
    }
    public BIDBetMinerPage enterButtonBetMinus(){
        driver.findElement(ButtonBetMinus).click();
        return this;
    }
    public BIDBetMinerPage enterButtonBetMin(){
        driver.findElement(ButtonBetMin).click();
        return this;
    }
    public BIDBetMinerPage enterButtonBetPlus10 (){
        driver.findElement(ButtonBetPlus10 ).click();
        return this;
    }
    public BIDBetMinerPage enterButtonBetPlus50 (){
        driver.findElement(ButtonBetPlus50 ).click();
        return this;
    }
    public BIDBetMinerPage enterButtonBetPlus100 (){
        driver.findElement(ButtonBetPlus100).click();
        return this;
    }
    public BIDBetMinerPage enterButtonBetPlus200  (){
        driver.findElement(ButtonBetPlus200 ).click();
        return this;
    }
    public BIDBetMinerPage enterButtonBetPlusMax  (){
        driver.findElement(ButtonBetPlusMax ).click();
        return this;
    }
}
