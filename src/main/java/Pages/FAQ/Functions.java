package Pages.FAQ;

import Pages.base.BasePage;
import Pages.base.TakeScreenshot;
import Pages.base.WaitUtils;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static Pages.FAQ.Locators.XPath.BUTTON_ANSWER;

public class Functions extends BasePage {
    public Functions(WebDriver driver) {
        super(driver);
    }
    public void clickOnTheAnswers(){
        List<WebElement> elementsToClick = driver.findElements(By.xpath(BUTTON_ANSWER));

        // Пройти по всем элементам и нажать на них
        for (int i = 0; i < elementsToClick.size(); i++) {
            WebElement element = elementsToClick.get(i);
            element.click();
            System.out.print("1");
            String Xpath = "//div[@class='nav-tabs__boxes']/div["+(i+1)+"]/div/div";
            System.out.print("2");
            WebElement Answer = driver.findElement(By.xpath(Xpath));
            System.out.print("3");
            Screenshot screenshot = new AShot().takeScreenshot(driver, Answer);
            System.out.print("4");
            try {
                ImageIO.write(screenshot.getImage(), "PNG", new File("E:\\Autotests\\Begins\\src\\main\\resources\\screenshots\\"+(i+1)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            WebElement elememtText = driver.findElement(By.xpath("//div[@class='nav-tabs__boxes']/div["+(i+1)+"]/div/div"));
            Actions actions = new Actions(driver);
            actions.moveToElement(elememtText).perform();
                if (Answer.isDisplayed()){
                    Allure.step("Окно ответа присутствует на странице", Status.PASSED);
                    String Text = driver.findElement(By.xpath("//div[@class='nav-tabs__boxes']/div["+(i+1)+"]/div/div")).getText();

                    if (Text != null){
                        Allure.step("В окне "+(i+1)+"вопроса присутствует текст", Status.PASSED);
                        byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                        Allure.addAttachment("Скриншот ответа на "+(i+1)+" вопрос", new ByteArrayInputStream(Page));

                    }else {
                        Allure.step("В окне "+(i+1)+"вопроса не присутствует текст", Status.FAILED);
                        byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                        Allure.addAttachment("Скриншот ответа на "+(i+1)+" вопрос", new ByteArrayInputStream(Page));
                    }
                }else {
                    Allure.step("В окне "+(i+1)+" ответ отсутствует на странице", Status.FAILED);
                    byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    Allure.addAttachment("Скриншот ответа на "+(i+1)+" вопрос", new ByteArrayInputStream(Page));
                }
        }
        }
}

