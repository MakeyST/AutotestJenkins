package Pages.Asteroid;

import Pages.base.BasePage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ButtonAsteroidLoginPage extends BasePage {
    public ButtonAsteroidLoginPage(WebDriver driver) {
        super(driver);
    }
    private final By EnterGameAsteroidLogin = By.xpath("//div[@class='rocket-control rocket-control']/div[2]/button[1]");

    @Test
    @Description("Нажимаем кнопку войти на странице Астероид")
    public ButtonAsteroidLoginPage entergameasteroidlogin(){

        driver.findElement(EnterGameAsteroidLogin).click();
        return this;
    }

}
