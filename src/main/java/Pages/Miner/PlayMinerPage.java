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

public class PlayMinerPage extends BasePage {
    public PlayMinerPage(WebDriver driver) {
        super(driver);
    }
    private final By SlotMiner1 = By.xpath("//div[@class='miner__cells__row']/div[15]/div");

    @Test
    @Description("Нажимаем одну из ячеек в игре")
    public PlayMinerPage enterSlotMiner() {
        try {
            // Подождать 1 секунды (1000 миллисекунд)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SlotMiner = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='miner__cells__row']/div[15]/div")));
        driver.findElement(SlotMiner1).click();

        return this;
    }
}
