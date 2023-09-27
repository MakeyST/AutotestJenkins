package Pages.Crash;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static Constants.Constant.TimeoutVariable.EXPLICIT_WAIT;


public class WaitButtomPlayCrash extends BasePage {

    public WaitButtomPlayCrash(WebDriver driver) {
        super(driver);

    }
    private final By ButtonPlay = By.xpath("//div[@class='bit-feed__cell bit-feed__cell_bit']/button[1]/span");

    public void clickButtonPlayCrash() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement ButtonPlayCrash = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='bit-feed__cell bit-feed__cell_bit']/button[1]")));
        driver.findElement(ButtonPlay).click();
    }

}