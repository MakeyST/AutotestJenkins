package tests.Pages.pageCases;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.time.Instant;

import static Constants.Constant.XPath.PUSH;
import static Pages.Cases.Locators.XPath.*;
import static Pages.Cases.Locators.classes.CLASS_CASE_AVERAGE;
import static Pages.Cases.Locators.classes.CLASS_CASE_NEWBIE;
import static io.qameta.allure.Allure.step;

public class BarCasesTest extends BaseTest {
    @Test(description = "Проверка ленты  в игре кейсы",priority = 2,groups = "cases")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Смотрим тест в целом")
    public void checkPlayCases() {
        try {
           /* step("Переход к дешевому кейсу",() ->{

                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CASE_NEWBIE));
                basepage.ClickByXpath(BUTTON_CASE_NEWBIE);
            });*/
            step("Ждем в ленте появление дешевого кейса",() ->{
                //Ждем появление элемента дешевого кейса в ленте
                BarCases.classes(CLASS_CASE_NEWBIE);
                //Ожидание загрузки страницы
                WaitUtils.waitForPageToLoad();
            });
            step("Ждем обновления ленты",() ->{
                //Ждем появление элемента average кейса в ленте
                BarCases.classesNotEquels(CLASS_CASE_NEWBIE);
            });
        }catch (Exception e) {
        }
    }
}
