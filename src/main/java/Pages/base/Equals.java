package Pages.base;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.Constant.XPath.BALANCE;

public class Equals extends BasePage {
    public Equals(WebDriver driver) {
        super(driver);
    }
    public String balance (){
        String ExpectedBet = driver.findElement(By.xpath(BALANCE)).getText();
        return ExpectedBet;
    }
    public void equals (String bet,String ExpectedBet,String positivecom,String negativecom){
        WebElement inputElement = driver.findElement(By.xpath(bet));
        String value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", inputElement);

        if (ExpectedBet.equals(value)){
            System.out.println(positivecom);
            Allure.step(positivecom, Status.PASSED);
        }else {
            System.out.println(negativecom);
            Allure.step(negativecom, Status.FAILED);
        }
    }
}
