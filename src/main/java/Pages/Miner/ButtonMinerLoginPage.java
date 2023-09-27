package Pages.Miner;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ButtonMinerLoginPage extends BasePage {



    public ButtonMinerLoginPage(WebDriver driver) {
        super(driver);
    }
    private final By EnterGameMinerLogin = By.xpath("//div[@class='bit-feed__row']/div[2]/button[1]");

    @Test
    @Description("Нажимаем кнопку войти на странице Miner")
    public ButtonMinerLoginPage entergameminerlogin() {
        driver.findElement(EnterGameMinerLogin).click();
        return this;
    }
}