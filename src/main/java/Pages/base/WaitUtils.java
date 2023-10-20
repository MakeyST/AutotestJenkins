package Pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils extends BasePage {

    private WebDriverWait wait;

    public WaitUtils(WebDriver driver, Duration timeout) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
    }

    //Ждать пока элемент будет виден
    public WebElement waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //Ждать пока элемент будет кликабельным
    public WebElement waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForFrameToBeAvailableAndSwitchToIt(By frameLocator) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
    }

    public void waitForTextToBePresentInElement(By locator, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    //Ждать пока загрузится страница
    public void waitForPageToLoad() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    //Ждать пока элемент станет невидимым
    public void WaitForElementToBeInvisability(String xpath) {
        WebElement elementToDisappear = driver.findElement(By.xpath(xpath));

        // Создайте объект WebDriverWait с таймаутом в секундах
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        // Используйте метод until класса ExpectedConditions для ожидания пропадания элемента
        wait.until(ExpectedConditions.invisibilityOf(elementToDisappear));
    }

    //Ждать пока элемент будет кликабельным и нажать
    public void WaitButtonToBeClickableAndClick(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        Button.click();
    }
}

