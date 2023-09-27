package Pages.GetX_Home;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GetXHomePageCrash extends BasePage{

    public GetXHomePageCrash(WebDriver driver) {
        super(driver);
    }
    private final By countGames = By.id("menu-games");
    private final By Crashtopage = By.xpath("//*[@id='menu-games']/div/ul/li/a[@href='/games/crash']");

    @Test
    @Description("В боковом меню ищем краш и нажимаем")
    public GetXHomePageCrash entercountGameCrash(){
        driver.findElement(countGames).click();
        driver.findElement(Crashtopage).click();

        return this;
    }

}
