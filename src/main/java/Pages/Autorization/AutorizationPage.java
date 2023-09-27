package Pages.Autorization;

import Pages.base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Constants.Constant.Data.EMAIL_LOGIN;
import static Constants.Constant.Data.EMAIL_PASSWORD;

public class AutorizationPage extends BasePage {
    public AutorizationPage(WebDriver driver) {

        super(driver);
    }
    private final By ButtonLogIn = By.id("btn-login");


    public AutorizationPage enterButtonLogIn() {
        driver.findElement(ButtonLogIn).click();
        return this;

    }

    public AutorizationPage enteremail(){
            WebElement inputField = driver.findElement(By.id("login-field-email"));
            inputField.sendKeys(EMAIL_LOGIN);
            return this;
    }

    public AutorizationPage enterpassword(){
        WebElement inputField = driver.findElement(By.id("login-field-password"));
        inputField.sendKeys(EMAIL_PASSWORD);
        return this;
    }

    public AutorizationPage ButtonLogin() {
        driver.findElement(By.id("login-form-login")).click();
        return this;
    }
}
