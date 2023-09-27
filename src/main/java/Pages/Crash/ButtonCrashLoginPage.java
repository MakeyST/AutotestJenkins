package Pages.Crash;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ButtonCrashLoginPage extends BasePage {
    public ButtonCrashLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By EnterGameCrashLogin = By.xpath("//div[@class='bit-feed__row']/div[2]/button[1]");

    @Test
    @Description("Нажимаем кнопку войти на странице Краш")
    public ButtonCrashLoginPage entergamecrashlogin() {
        driver.findElement(EnterGameCrashLogin).click();
    return this;
    }
}

