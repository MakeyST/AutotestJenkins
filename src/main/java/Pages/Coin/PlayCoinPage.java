package Pages.Coin;

import Pages.Miner.PlayMinerPage;
import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.model.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class PlayCoinPage extends BasePage {
    public PlayCoinPage(WebDriver driver) {
        super(driver);
    }

    //Случайным образом выбирается Орел или Решка и нажимается
    public void enterSlotCoin() throws InterruptedException {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='bit-feed']/div[1]/div[1] | //div[@class='bit-feed']/div[1]/div[3]"));

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


