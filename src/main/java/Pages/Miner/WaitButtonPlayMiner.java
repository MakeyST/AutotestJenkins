package Pages.Miner;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WaitButtonPlayMiner extends BasePage {


    public WaitButtonPlayMiner(WebDriver driver) {
        super(driver);
    }

        private final By ButtonPlayMiner1 = By.xpath("//div[@class='bit-feed__cell bit-feed__cell_bit']/button[1]/span");

    @Test
    @Description("Нажимаем одну из ячеек в игре")
    public WaitButtonPlayMiner clickButtonPlayMiner() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement ButtonPlayMiner = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='bit-feed__cell bit-feed__cell_bit']/button[1]/span")));
        driver.findElement(ButtonPlayMiner1).click();

        return this;
    }
}