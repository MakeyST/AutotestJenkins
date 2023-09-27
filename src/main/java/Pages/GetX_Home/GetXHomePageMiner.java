package Pages.GetX_Home;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GetXHomePageMiner extends BasePage {
    public GetXHomePageMiner(WebDriver driver) {
        super(driver);
    }
    private final By countGames = By.id("menu-games");
    private final By Minertopage = By.xpath("//*[@id='menu-games']/div/ul/li/a[@href='/games/miner']");

    @Test
    @Description("В боковом меню ищем Минер и нажимаем")
    public GetXHomePageMiner entercountGameMiner() {
        driver.findElement(countGames).click();
        driver.findElement(Minertopage).click();

        return this;
    }
}
