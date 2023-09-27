package Pages.Coin;

import Pages.Miner.ButtonMinerLoginPage;
import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ButtonCoinLoginPage extends BasePage {
    public ButtonCoinLoginPage(WebDriver driver) {
        super(driver);
    }
    private final By EnterGameCoinLogin = By.xpath("//div[@class='bit-feed']/div[2]/button[1]");

    @Test
    @Description("Нажимаем кнопку войти на странице Miner")
    public ButtonCoinLoginPage entergamecoinlogin() {
        driver.findElement(EnterGameCoinLogin).click();
        return this;
    }
}
