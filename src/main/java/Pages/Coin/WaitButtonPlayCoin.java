package Pages.Coin;

import Pages.Miner.WaitButtonPlayMiner;
import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitButtonPlayCoin extends BasePage {
    public WaitButtonPlayCoin(WebDriver driver) {
        super(driver);
    }
    private final By ButtonPlayCoin1 = By.xpath("//div[@class='bit-feed']/div[2]/button[1]/span");

    @Test
    @Description("Нажимаем одну из ячеек в игре")
    public WaitButtonPlayCoin clickButtonPlayCoin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement ButtonPlayCoin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='bit-feed']/div[2]/button[1]/span")));
        driver.findElement(ButtonPlayCoin1).click();

        return this;
    }
}
