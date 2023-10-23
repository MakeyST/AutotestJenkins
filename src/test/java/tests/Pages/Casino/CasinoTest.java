//package tests.Pages.Casino;
//
//import com.blibli.oss.qa.util.services.NetworkListener;
//import common.CommonActions;
//import io.qameta.allure.Description;
//import io.restassured.RestAssured;
//import net.lightbody.bmp.BrowserMobProxy;
//import net.lightbody.bmp.core.har.Har;
//import net.lightbody.bmp.core.har.HarEntry;
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import tests.base.basetests.BaseTest;
//
//import java.net.MalformedURLException;
//
//import static API.Costant.BASE_URL;
//import static Constants.Constant.Id.ID_BUTTON_CASINO;
//import static Pages.Casino.Locators.XPath.BUTTON_PLAY_STACK;
//import static Pages.Casino.Locators.XPath.ICON_STACK;
//import static io.qameta.allure.Allure.step;
//
//import static io.restassured.RestAssured.proxy;
//import static java.lang.Thread.sleep;
//
//public class CasinoTest extends BaseTest {
//
//
//    public CasinoTest() throws MalformedURLException {
//    }
//
//    @Test(description = "Казино", priority = 3, groups = "casino")
//    @Description("Смотрим тест в целом")
//    public void CasinoPlay() {
//        try {
//            step("Переход в раздел Казино", () -> {
//                WaitUtils.waitForElementToBeClickable(By.id(ID_BUTTON_CASINO));
//                basepage.ClickById(ID_BUTTON_CASINO);
//                WaitUtils.waitForPageToLoad();
//                Thread.sleep(2000);
//            });
//            step("Переход в игру Казино", () -> {
//
//                WaitUtils.waitForPageToLoad();
//              /*  Funtions.checkResponses(proxy);*/
//            });
//        } catch (Exception e) {
//        }
//    }
//}
//
