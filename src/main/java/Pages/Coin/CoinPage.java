package Pages.Coin;

import Pages.Miner.MinerPage;
import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CoinPage extends BasePage {
    public CoinPage(WebDriver driver) {
        super(driver);
    }
    private final By card = By.xpath("//div[@class='tas-list__players']/div");
    @Test
    @Description("Сверяем количество пользователей в таблице")
    public CoinPage checkCountCardsCoin() {
        int countCard = driver.findElements(card).size();
        Assert.assertNotEquals(countCard, 11);
        return this;
    }
}
