package Pages.Autorization;

import Pages.Crash.CrashPage;
import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AutorisedPage extends BasePage {
    public AutorisedPage(WebDriver driver) {
        super(driver);
    }

    private final By img = By.xpath("//*[@role='img']");

    public AutorisedPage checkImg() {
        int countImg = driver.findElements(img).size();
        Assert.assertEquals(countImg, 51);
        return this;
    }
}
