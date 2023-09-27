package Pages.GetX_Home;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GetXHomePageCoin extends BasePage {
    public GetXHomePageCoin(WebDriver driver) {
        super(driver);
    }
    private final By countGames = By.id("menu-games");
    private final By Cointopage = By.xpath("//*[@id='menu-games']/div/ul/li/a[@href='/games/coinflip']");

    @Test
    @Description("В боковом меню ищем краш и нажимаем")
    public GetXHomePageCoin entercountGameCoin(){
        driver.findElement(countGames).click();
        driver.findElement(Cointopage).click();

        return this;
    }

}

