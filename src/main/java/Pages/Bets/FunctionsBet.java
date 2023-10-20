package Pages.Bets;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Functions extends BasePage {
    public Functions(WebDriver driver) {
        super(driver);
    }
    public void findElementAnsClickInShadowDOM(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-root"));

        // Выполните скрипт JavaScript для входа в shadow DOM
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);

        // Теперь вы можете найти элемент внутри shadow DOM
        WebElement elementInShadowDOM = shadowRoot.findElement(By.cssSelector("css_селектор_к_элементу"));
    }
}
