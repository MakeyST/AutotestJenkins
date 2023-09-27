package Pages.Miner;

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
import java.util.List;

import static Constants.Constant.XPath.PUSH;

public class EnterButtonTakeMiner extends BasePage {
    public EnterButtonTakeMiner(WebDriver driver) {
        super(driver);
    }

    private final By ButtonTake1 = By.xpath("//div[@class='bit-feed__cell bit-feed__cell_bit']/button[2]/span");

    public void clickButtonTake() throws InterruptedException {
        WebElement ButtonTake = driver.findElement(By.xpath("//div[@class='bit-feed__cell bit-feed__cell_bit']/button[2]/span"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        if (ButtonTake.isDisplayed()) {
            driver.findElement(ButtonTake1).click();
            /*WebElement element = driver.findElement(By.xpath(PUSH));
            boolean displayed = element.isDisplayed();*/
            List<WebElement> displayed = driver.findElements(By.xpath(PUSH));
            if (!displayed.isEmpty()) {
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
                Allure.step("Уведомление не видимо", Status.PASSED);
            }
        }else {
            Reporter.log("Проигрыш",true);
            Allure.step("Проигрыш", Status.FAILED);
        }
    }

    private static boolean isClickable(WebElement element, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

