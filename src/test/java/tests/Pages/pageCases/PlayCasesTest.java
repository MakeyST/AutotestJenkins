package tests.Pages.pageCases;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.net.MalformedURLException;

import static Constants.Constant.XPath.PUSH;
import static Pages.Cases.Locators.XPath.*;
import static io.qameta.allure.Allure.step;

public class PlayCasesTest extends BaseTest {
    public PlayCasesTest() throws MalformedURLException {
    }

    @Test(description = "Проверка авторизации и игры в кейсы",priority = 2,groups = "cases")
    @Attachment(value = "Screenshot", type = "image/png")
    @Description("Смотрим тест в целом")
    public void checkPlayCases(){
        try {
            step("Переход к дешевому кейсу",() ->{
                //Ждем появление элемента Дешевый кейс
                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CASE_NEWBIE));
                //Нажимаем на дешевый кейс
                basepage.ClickByXpath(BUTTON_CASE_NEWBIE);
            });
            step("Проверка включения быстрого режима ",() ->{
                //Ждем пока переключатель будет кликабельным
                WaitUtils.waitForElementToBeClickable(By.xpath(CHENGER_FAST_OPEN));
                //Находим переключатель
                WebElement FastOpen = driver.findElement(By.xpath(CHENGER_FAST_OPEN));
                //Сохраняем положение переключателя
                String initialPosition = FastOpen.getAttribute("class");
                //Нажимаем на переключатель
                basepage.ClickByXpath(CHENGER_FAST_OPEN);
                //Еще раз сохраняем положение
                String newPosition = FastOpen.getAttribute("class");
                //Сравниваем два положения
                ChengedPosition.CheckChenger(initialPosition,newPosition);

            });
            step("Проверка выключения быстрого режима",() ->{
                //Находим переключатель
                WebElement FastOpen = driver.findElement(By.xpath(CHENGER_FAST_OPEN));
                //Сохраняем положение переключателя
                String initialPosition = FastOpen.getAttribute("class");
                //Нажимаем на переключатель
                basepage.ClickByXpath(CHENGER_FAST_OPEN);
                //Еще раз сохраняем положение
                String newPosition = FastOpen.getAttribute("class");
                //Сравниваем два положения
                ChengedPosition.CheckChenger(initialPosition,newPosition);
            });
            step("Проверка кнопки Открыть кейс",() ->{
                //Нажимаем кнопку Открыть кейс
                basepage.ClickByXpath(BUTTON_OPEN_CASE);
                //Ждем одну секунду чтобы обновился баланс
                Thread.sleep(1000);
            });
            step("Проверка корректности пуш",() ->{
                //Запоминаем значение баланса
                double balanceBefore = CasesPage.balance("Баланс до ");
                //Ждем пока пуш уведомление появится
                WaitUtils.waitForElementToBeVisible(By.xpath(PUSH));
                //Проверяем данные пуша
                CasesPage.CheckPush();
                //Ждем секунду чтобы обновился баланс
                Thread.sleep(1000);
                //Запоминаем еще раз баланс
                double balanceAfter = CasesPage.balance("Баланс после ");
                //Вычисляем разницу балансов
                double differenceBalaneces = balanceAfter -  balanceBefore;
                //Переводим разницу балансов в строковую форму
                String myString = CasesPage.difference((int) differenceBalaneces);
                //Переводим в строковую форму текст пуша
                String value = CasesPage.Value();
                //Проверяем что сумма изменения баланса есть в уведомлении пуша
                CasesPage.Amount(myString,value);
            });
        }catch (Exception e) {
        }
    }


}

