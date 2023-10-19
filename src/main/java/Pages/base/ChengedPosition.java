package Pages.base;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;

import java.io.ByteArrayInputStream;

public class ChengedPosition extends BasePage{
    public ChengedPosition(WebDriver driver) {
        super(driver);
    }

    //Проверяем изменилось ли положение обьекта на странице
    public void CheckChenger(String initialPosition,String newPosition) {
        if (initialPosition.equals(newPosition)) {
            System.out.println("Переключатель работает");
            Allure.step("Переключатель работает", Status.PASSED);
        } else {
            System.out.println("Переключатель не работает");
            Allure.step("Переключатель не работает", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Переключатель не работает", new ByteArrayInputStream(Page));
        }
    }
}
