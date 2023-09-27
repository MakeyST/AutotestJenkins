package Pages.Asteroid;

import Pages.Crash.CrashPage;
import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsteroidPage extends BasePage {
    public AsteroidPage(WebDriver driver) {
        super(driver);
    }
    private final By card2 = By.xpath("//div[@class='tas-list__tr js-wives-hover js-ven-wives']");

    @Test
    @Description("Сверяем количество пользователей в таблице")
    public AsteroidPage checkCountCardsAsteroid() {
        int countCard2 = driver.findElements(card2).size();
        Assert.assertNotEquals(countCard2, 54);
        return this;
    }
}
