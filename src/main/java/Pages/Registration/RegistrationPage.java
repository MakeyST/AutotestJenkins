package Pages.Registration;

import Pages.Autorization.AutorizationPage;
import Pages.base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constants.Constant.Data.*;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

        private final By ButtonReg = By.id("btn-registration");
        private final By ButtonEmail = By.xpath("//div[@class='button-group']/button[2]");

        private final By PutEmail = By.xpath("//div[@class='js-tab active']/form/div[1]/div/div/input");

        private final By Button18Ears = By.xpath("//div[@class='js-tab active']/form/div[3]/label/span/i");

        public RegistrationPage enterButtonLogIn () {
            driver.findElement(ButtonReg).click();
            return this;

        }
        public RegistrationPage enterButtonEmail () {
        driver.findElement(ButtonEmail).click();
        return this;
        }

        public RegistrationPage enteremail () {
            WebElement inputField = driver.findElement(By.xpath("//div[@class='js-tab active']/form/div[1]/div/div/input"));
            inputField.sendKeys(RANDOM_EMAIL);
            return this;
        }

        public RegistrationPage enterpassword () {
            WebElement inputField = driver.findElement(By.xpath("//div[@class='js-tab active']/form/div[2]/div/div/div/div/input"));
            inputField.sendKeys(EMAIL_PASSWORD);
            return this;
        }
        public RegistrationPage enterButton18Ears () {
            driver.findElement(Button18Ears ).click();
            return this;
        }

        public RegistrationPage ButtonLogin () {
            driver.findElement(By.xpath("//div[@class='js-tab active']/form/div[5]/div/button[1]/span")).click();
            return this;
        }


        public RegistrationPage ButtonFinish () {
        driver.findElement(By.xpath("//div[@class='currency__right']/button")).click();
        return this;
        }

}