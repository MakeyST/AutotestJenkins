package Pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils extends BasePage{

    private WebDriverWait wait;

    public WaitUtils(WebDriver driver,Duration timeout) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForFrameToBeAvailableAndSwitchToIt(By frameLocator) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
    }

    public void waitForTextToBePresentInElement(By locator, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public void waitForPageToLoad() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
    public void WaitForElementToBeInvisability (String xpath){
        WebElement elementToDisappear = driver.findElement(By.xpath(xpath));

        // Создайте объект WebDriverWait с таймаутом в секундах
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Используйте метод until класса ExpectedConditions для ожидания пропадания элемента
        wait.until(ExpectedConditions.invisibilityOf(elementToDisappear));
    }
}

