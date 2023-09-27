package Pages.base;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.ByteArrayInputStream;

public class TakeScreenshot extends BasePage{
    public TakeScreenshot(WebDriver driver) {
        super(driver);
    }
    public void TakeScreenShot (String name){
        byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(name, new ByteArrayInputStream(Page));
    }
}
