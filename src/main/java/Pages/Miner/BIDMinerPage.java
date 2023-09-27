package Pages.Miner;

import Pages.Crash.BIDCrashPage;
import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static Constants.Constant.XPath.BUTTON_3_BOMBS;
import static Constants.Constant.XPath.BUTTON_5_BOMBS;

public class BIDMinerPage extends BasePage {
    public BIDMinerPage(WebDriver driver) {
        super(driver);
    }

    public final By Button10Bombs = By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[3]/span");
    public final By Button16Bombs = By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[4]/span");
    public final By Button24Bombs = By.xpath("//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[5]/span");


    public BIDMinerPage enterButton3Bombs(){
        driver.findElement(By.xpath(BUTTON_3_BOMBS)).click();
        return this;
    }
    public BIDMinerPage enterButton5Bombs(){
        driver.findElement(By.xpath(BUTTON_5_BOMBS)).click();
        return this;
    }
    public BIDMinerPage enterButton10Bombs(){
        driver.findElement(Button10Bombs).click();
        return this;
    }
    public BIDMinerPage enterButton16Bombs(){
        driver.findElement(Button16Bombs).click();
        return this;
    }
    public BIDMinerPage enterButton24Bombs(){
        driver.findElement(Button24Bombs).click();
        return this;
    }

}
