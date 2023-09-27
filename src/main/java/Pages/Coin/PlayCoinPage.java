package Pages.Coin;

import Pages.Miner.PlayMinerPage;
import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PlayCoinPage extends BasePage {
    public PlayCoinPage(WebDriver driver) {
        super(driver);
    }
    private final By SlotCoin1 = By.xpath("//div[@class='bit-feed']/div[1]/div[1]");

    @Test
    @Description("Нажимаем одну Орел")
    public PlayCoinPage enterSlotCoin() {
        try {
            // Подождать 1 секунды (1000 миллисекунд)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /* WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement SlotCoin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='bit-feed']/div[1]/div[1]")));*/
        driver.findElement(SlotCoin1).click();

        return this;
    }
}
