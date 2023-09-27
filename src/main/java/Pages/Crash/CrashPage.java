package Pages.Crash;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrashPage extends BasePage {

    public CrashPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='tas-list__tr js-wives-hover js-ven-wives']");

    @Test
    @Description("Сверяем количество пользователей в таблице")
    public CrashPage checkCountCardsCrash(){
        int countCard = driver.findElements(card).size();
        Assert.assertNotEquals(countCard,30);
        return this;
    }


}
