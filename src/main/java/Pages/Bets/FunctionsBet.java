package Pages.Bets;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static Pages.Bets.Locators.XPath.*;

public class FunctionsBet extends BasePage { private WebDriverWait wait;
    public FunctionsBet(WebDriver driver, Duration timeout) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
    }

    public WebElement getShadowDOM(){
        WebElement element = driver.findElement(By.id("bt-inner-page"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowDom = (WebElement) js.executeScript("return arguments[0].shadowRoot", element);
        return shadowDom;
    }
    public void findElementAnsClickInShadowDOM(By locator) {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            System.out.println("4");
            // Теперь вы можете найти элемент внутри shadow DOM
            WebElement elementInShadowDOM = driver.findElement(locator);
            System.out.println("5");
            elementInShadowDOM.click();
            System.out.println("6");
        }
    public void checkInvisabilityLogin(){
        WebElement shadowHost = driver.findElement(By.xpath("//div[@id='bt-inner-page']"));

        // Выполните скрипт JavaScript для входа в shadow DOM
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        // Теперь вы можете найти элемент внутри shadow DOM
        WebElement elementInShadowDOM = shadowRoot.findElement(By.xpath(BUTTON_LOGIN_IN_WINDOW_COUPON));
        if (!elementInShadowDOM.isDisplayed()) {
            System.out.println("Пользователь авторизован");
            Allure.step("Пользователь авторизован", Status.PASSED);
        } else {
            System.out.println("Ошибка авторизации");
            Allure.step("Пользователь не авторизован", Status.FAILED);
        }
    }
    public void enterTheAmountInInput(){
        WebElement shadowHost = driver.findElement(By.xpath("//div[@id='bt-inner-page']"));

        // Выполните скрипт JavaScript для входа в shadow DOM
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(INPUT_AMOUNT_BET)));
        // Теперь вы можете найти элемент внутри shadow DOM
        WebElement elementInShadowDOM = shadowRoot.findElement(By.xpath(INPUT_AMOUNT_BET));
        elementInShadowDOM.clear();
        elementInShadowDOM.sendKeys("10");
    }
    public void comparison(){
        WebElement shadowHost = driver.findElement(By.xpath("//div[@id='bt-inner-page']"));

        // Выполните скрипт JavaScript для входа в shadow DOM
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TEXT_NOTIFICATION_MAKED_BET)));
        // Теперь вы можете найти элемент внутри shadow DOM
        WebElement elementInShadowDOM = shadowRoot.findElement(By.xpath(TEXT_NOTIFICATION_MAKED_BET));
        String text = elementInShadowDOM.getText();
        if (text.equals("Ваша ставка успешно поставлена!")){
            System.out.println("Ваша ставка успешно поставлена!");
            Allure.step("Ваша ставка успешно поставлена!", Status.PASSED);
        }else {
            System.out.println("Ошибка: "+text);
            Allure.step("Ошибка: "+text, Status.PASSED);
        }
    }
}
