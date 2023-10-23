package tests.Profile;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import static Pages.Profile.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class HistoryTest extends BaseTest {
    @Test(description = "Проверка истории",priority = 2,groups = "profile")
    @Description("Смотрим тест в целом")
    public void Profile (){
        try {
            step("Переход на страницу сайта", () -> {
                basepage.ClickByXpath(BUTTON_HISTORY_IN_PROFILE);
            });
            step("Проверка таблицы ставки",() ->{
                WindowProfilePage.checkElements(TABLET_BETS_ELEMENTS);
            });
            step("Проверка таблицы платежи",() ->{
                basepage.ClickByXpath(TABLET_PAYMENT);
                WindowProfilePage.checkElements(TABLET_PAYMENTS_ELEMENTS);
            });
            step("Проверка таблицы выплаты",() ->{
                basepage.ClickByXpath(TABLET_PAYOUT);
                WindowProfilePage.checkElements(TABLET_PAYOUT_ELEMENTS);
            });
            step("Проверка таблицы бонусы",() ->{
                basepage.ClickByXpath(TABLET_BONUSES);
                WindowProfilePage.checkElements(TABLET_BONUSES_ELEMENTS);
            });
        }catch(Exception e){

        }
    }
}
