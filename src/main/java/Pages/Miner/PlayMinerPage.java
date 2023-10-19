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
import java.time.Instant;
import java.util.List;
import java.util.Random;

import static Pages.Miner.Locators.XPath.BUTTON_SLOT_MINER;

public class PlayMinerPage extends BasePage {
    public PlayMinerPage(WebDriver driver) {
        super(driver);
    }
    private final By SlotMiner1 = By.xpath("//div[@class='miner__cells__row']/div[15]/div");

    //Нажимаем раундомную ячейку в игре
    public void enterSlotMiner() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> elements = driver.findElements(By.xpath(BUTTON_SLOT_MINER));

        // Генерация случайного индекса элемента
        Random rand = new Random();
        int randomIndex = rand.nextInt(elements.size());

        // Выбор случайного элемента для нажатия
        WebElement randomElement = elements.get(randomIndex);
        // Нажатие на случайный элемент
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(randomElement));
        randomElement.click();

    }
}

