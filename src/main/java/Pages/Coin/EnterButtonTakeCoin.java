package Pages.Coin;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;

import static Constants.Constant.XPath.PUSH;
import static Constants.Constant.XPath.PUSH_TEXT;
import static org.springframework.util.ClassUtils.isVisible;

public class EnterButtonTakeCoin extends BasePage {
    public EnterButtonTakeCoin(WebDriver driver) {
        super(driver);
    }

    private final By ButtonTake1 = By.xpath("//div[@class=\"bit-feed\"]/div[2]/button[2]/span");

    public void clickButtonTake() throws InterruptedException {
        WebElement ButtonTake = driver.findElement(By.xpath("//div[@class=\"bit-feed\"]/div[2]/button[2]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        if (ButtonTake.isDisplayed()) {
            driver.findElement(ButtonTake1).click();
            WebElement element = driver.findElement(By.xpath(PUSH));
            if (element.isDisplayed()) {
                System.out.println("Уведомление видимо");
                Allure.step("Проверка успешна", Status.PASSED);
                WebElement inputElement = driver.findElement(By.xpath(PUSH));
                String value1 = inputElement.getText();
                boolean contains = value1.contains("Выигрыш");
                if (contains){
                    System.out.println("Ставка выиграла");
                    Allure.step("Ставка выиграла", Status.PASSED);
                }else {
                    System.out.println("Ошибка");
                    Allure.step("Ошибка", Status.FAILED);
                }
            } else {
                System.out.println("Элемент не видим на странице");
                Allure.step("Уведомление не видимо", Status.FAILED);
            }
        }else {
            Reporter.log("Проигрыш",true);
            Allure.step("Проигрыш", Status.FAILED);
        }
    }

}
