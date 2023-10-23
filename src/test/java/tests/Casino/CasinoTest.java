//package tests.Casino;
//
//import io.qameta.allure.Description;
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import tests.base.basetests.BaseTest;
//
//import java.net.MalformedURLException;
//
//import static Constants.Constant.Id.ID_BUTTON_CASINO;
//import static Pages.Casino.Locators.XPath.BUTTON_PLAY_STACK;
//import static Pages.Casino.Locators.XPath.ICON_STACK;
//import static io.qameta.allure.Allure.step;
//import static java.lang.Thread.sleep;
//
//public class CasinoTest extends BaseTest {
//
//    public CasinoTest() throws MalformedURLException {
//        step("Переход в раздел Казино", () -> {
//            basepage.ClickById(ID_BUTTON_CASINO);
//            WaitUtils.waitForPageToLoad();
//            Thread.sleep(2000);
//        });
//        step("Переход в игру Казино", () -> {
//            WaitUtils.waitForPageToLoad();
//            WaitUtils.waitForElementToBeClickable(By.xpath(ICON_STACK));
//            basepage.MoveToElement(ICON_STACK);
//            basepage.MoveToElement(BUTTON_PLAY_STACK);
//            basepage.ClickByXpath(BUTTON_PLAY_STACK);
//            Thread.sleep(2000);
//            Funtions.checkResponses();
//
//        });
//    }
//
//    @Test(description = "Казино", priority = 3, groups = "casino")
//    @Description("Смотрим тест в целом")
//    public void CasinoPlay() {
//        try {
//            step("Переход в раздел Казино", () -> {
//                basepage.ClickById(ID_BUTTON_CASINO);
//                WaitUtils.waitForPageToLoad();
//                Thread.sleep(2000);
//            });
//            step("Переход в игру Казино", () -> {
//                WaitUtils.waitForPageToLoad();
//                WaitUtils.waitForElementToBeClickable(By.xpath(ICON_STACK));
//                basepage.MoveToElement(ICON_STACK);
//                basepage.MoveToElement(BUTTON_PLAY_STACK);
//                basepage.ClickByXpath(BUTTON_PLAY_STACK);
//                Thread.sleep(2000);
//                Funtions.checkResponses();
//
//            });
//        } catch (Exception e) {
//        }
//    }
//}
//
