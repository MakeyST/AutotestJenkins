package Pages.Asteroid;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitButtonPlayAsteroid extends BasePage {
    public WaitButtonPlayAsteroid(WebDriver driver) {
        super(driver);
    }
    @Test
    @Description("Ждем кнопку поставить и нажимаем")
    public void clickButtonPlayAsteroid(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
        WebElement ButtonPlayCrash = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='rocket-control rocket-control']/div[2]/button[1]")));
        ButtonPlayCrash.click();
    }
}
