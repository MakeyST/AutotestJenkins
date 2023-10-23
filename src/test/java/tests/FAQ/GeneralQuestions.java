package tests.FAQ;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import static Constants.Constant.Id.ID_BUTTON_FAQ;
import static Constants.Constant.Id.ID_MENU;
import static Constants.Constant.XPath.BUTTON_COIN_PAGE;
import static Pages.FAQ.Locators.XPath.BUTTON_WALLET_QUESTIONS;
import static io.qameta.allure.Allure.step;

public class GeneralQuestions extends BaseTest {

    @Test(description = "Проверка FAQ",priority = 3,groups = "FAQ")
    @Description("Смотрим тест в целом")
    public void GeneralQuestions (){
        try {
            step("Переход на страницу игры через боковую панель", () -> {
                WaitUtils.waitForPageToLoad();
                basepage.ClickById(ID_BUTTON_FAQ);
                TestHttpResponseCode.TestHttpResponseCode();
            });
            step("Проверка появления ответов на все вопросы", () -> {
                Functions.clickOnTheAnswers();
            });
            step("Проверка появления ответов на все вопросы", () -> {
                basepage.MoveToElement(BUTTON_WALLET_QUESTIONS);
                basepage.ClickByXpath(BUTTON_WALLET_QUESTIONS);
                WaitUtils.waitForPageToLoad();
                Functions.clickOnTheAnswers();
            });
        }catch (Exception e){
        }
    }
}
