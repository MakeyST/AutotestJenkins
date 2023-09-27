package Pages.GetX_Home;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static Constants.Constant.Id.ID_MENU;

public class GetXHomePageAsteroid extends BasePage {
    public GetXHomePageAsteroid(WebDriver driver) {
        super(driver);
    }
    private final By countGames1 = By.id("menu-games");
    private final By Asteroidtopage = By.xpath("//*[@id='menu-games']/div/ul/li/a[@href='/games/rocket']");

    @Test
    @Description("В боковом меню ищем Астероид и нажимаем")
    public GetXHomePageAsteroid entercountGameAsteroid() throws InterruptedException {
        driver.findElement(By.xpath(ID_MENU)).click();
        Thread.sleep(1000);
        driver.findElement(Asteroidtopage).click();
        return this;
    }
}
