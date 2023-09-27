package Pages.base;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChengedPosition extends BasePage{
    public ChengedPosition(WebDriver driver) {
        super(driver);
    }
    public void CheckChenger(String initialPosition,String newPosition) {
        if (initialPosition.equals(newPosition)) {
            System.out.println("Проверка успешна");
            Allure.step("Проверка успешна", Status.PASSED);
        } else {
            System.out.println("Проверка неуспешна");
            Allure.step("Проверка неуспешна", Status.FAILED);
        }
    }
}
