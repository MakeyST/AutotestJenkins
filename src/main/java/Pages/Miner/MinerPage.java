package Pages.Miner;

import Pages.Crash.CrashPage;
import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinerPage extends BasePage {
    public MinerPage(WebDriver driver) {
        super(driver);
    }
    private final By card2 = By.xpath("//div[@class='tas-list__tr js-wives-hover js-ven-wives']");
    @Test
    @Description("Сверяем количество пользователей в таблице")
    public MinerPage checkCountCardsMiner() {
        int countCard = driver.findElements(card2).size();
        Assert.assertNotEquals(countCard, 30);
        return this;
    }
}
