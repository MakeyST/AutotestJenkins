package Pages.base;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static Constants.Constant.XPath.*;
import static Pages.Payment.Locators.XPath.*;


public class CheckFindElement extends BasePage{
    public CheckFindElement(WebDriver driver) {
        super(driver);
    }

    //Проверка существования окна
    public void checkWindow(String XPath,String name){
        try {
            Thread.sleep(1000);
            //Ищем окно по Xpath
            WebElement Window = driver.findElement(By.xpath(XPath));
            System.out.println(name+"открыто");
            Allure.step("Проверка появления "+name, Status.PASSED);

            // Далее можно выполнить действия с найденным элементом
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка");
            Allure.step("Нет "+name, Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(name+ " не появилось", new ByteArrayInputStream(Page));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //Проверка Пуш уведомления
    public void CheckPush(){
        //Ищем пуш уведомление
        WebElement element = driver.findElement(By.xpath(PUSH));
        //Проверяем , что оно находится на странице
        if (element.isDisplayed()) {
            System.out.println("Уведомление видимо");
            //Ищем текст пуша
            WebElement inputElement = driver.findElement(By.xpath(PUSH_TEXT));
            String value1 = inputElement.getText();
            //Проверяем текст пуша
            if (value1.equals("Ваша ставка принята!")){
                System.out.println("Ставка принята");
                Allure.step("Ставка принята", Status.PASSED);
            }else {
                System.out.println("Ошибка");
                Allure.step("Ошибка", Status.FAILED);
                //Проверяем текст пуша если прошлая проверка была неуспешной
                if (value1.equals("Ставка на завершенный раунд")) {
                    System.out.println("Ставка на завершенный раунд");
                    Allure.step("Ставка на завершенный раунд", Status.PASSED);

                }else {
                    System.out.println("Другая ошибка");
                    Allure.step("Другая ошибка", Status.FAILED);
                    byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    Allure.addAttachment("Скриншот: Ошибка в пуш уведомлении", new ByteArrayInputStream(Page));
                }
            }
        }else {
            System.out.println("Элемент не видим на странице");
            Allure.step("Уведомление не видимо", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Уведомления нет", new ByteArrayInputStream(Page));
        }
    }
    //Проверяем что окна нет
    public void checkWindowIsGone(String XPath,String name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        boolean elementNotVisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(XPath)));
        if (elementNotVisible) {
            System.out.println(name +" исчезло");
            Allure.step(name + " исчезло", Status.PASSED);
        } else {
            System.out.println("Элемент найден на странице.");
            Allure.step(name +" не исчезло", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: "+name+" не исчезло", new ByteArrayInputStream(Page));

        }
    }
    //Проверяем что поле ввода промокода появилось после нажатия кнопки
    public void checkInputPromokod(){
        driver.findElement(By.xpath(BUTTOM_I_HAVE_A_PROMOKOD)).click();
        WebElement Promokod =  driver.findElement(By.xpath(INPUT_PROMOKOD));
        if (Promokod.isDisplayed()){
            System.out.println("Поле для ввода промокода появилось");
            Allure.step("Поле для ввода промокода появилось", Status.PASSED);
        }else {
            System.out.println("Поле для ввода промокода не появилось");
            Allure.step("Поле для ввода промокода не появилось", Status.PASSED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот: Поле для ввода промокода не появилось", new ByteArrayInputStream(Page));
        }
    }

    //Проверяем что полученные данные не пустые
    public void checkPaymentWaitingWindow(){
        boolean timer = false;
        boolean Card = false;
        boolean AmountOfMoney = false;
        boolean equals = false;
        //Проверяем есть ли таймер
        WebElement TimerPayment = driver.findElement(By.xpath(TIMER_PAYMENT));
        if (TimerPayment.isDisplayed()) {
            WebElement TimerPaymentHours = driver.findElement(By.xpath(TIMER_PAYMENT_HOURS));
            String hours = TimerPaymentHours.getText();
            WebElement TimerPaymentMinuts = driver.findElement(By.xpath(TIMER_PAYMENT_MINUTS));
            String minuts = TimerPaymentMinuts.getText();
            if (hours != null && !hours.isEmpty() && minuts != null && !minuts.isEmpty()) {
                timer = true;
                Allure.step("Таймер работает", Status.PASSED);
            }
            else {
                timer = false;
                Allure.step("Таймер не работает", Status.FAILED);
                byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Скриншот: Таймер не работает", new ByteArrayInputStream(Page));
            }
        }
        //Проверяем есть ли карта и данные
        WebElement WindowNumberCard  = driver.findElement(By.xpath(WINDOW_CARD));
        if (WindowNumberCard.isDisplayed()){
            WebElement NumberCrad = driver.findElement(By.xpath(WINDOW_NUMBER_CARD));
            String Number = NumberCrad.getText();
            WebElement AmountOnCard = driver.findElement(By.xpath(WINDOW_AMOUNT_CARD));
            String Amount = AmountOnCard.getText();
            if (Number != null && !Number.isEmpty() && Amount != null && !Amount.isEmpty()) {
                Card = true;
                Allure.step("Карта отображается", Status.PASSED);
            }
            else {
                WebElement AmountOnCard2 = driver.findElement(By.xpath(WINDOW_AMOUNT_CARD_SBP));
                String Amount2 = AmountOnCard2.getText();
                if (Number != null && !Number.isEmpty() && Amount2 != null && !Amount2.isEmpty()) {
                    Card = true;
                    Allure.step("Карта отображается", Status.PASSED);
                } else {
                    Card = false;
                    Allure.step("Карта не отображается", Status.FAILED);
                }
            }
        }
        //Проверяем есть ли подвал
        WebElement WindowFooter  = driver.findElement(By.xpath(FOOTER_PAYMENT));
        if (WindowFooter.isDisplayed()){
                WebElement AmountToPay = driver.findElement(By.xpath(FOOTER_PAYMENT_AMOUNT_TO_PAY));
                String Amount1 = AmountToPay.getText();
                WebElement AmountWillbeAdded = driver.findElement(By.xpath(FOOTER_PAYMENT_AMOUNT_WILL_BE_ADDED));
                String Amount2 = AmountWillbeAdded.getText();
                if (Amount1 != null && !Amount1.isEmpty() && Amount2!= null && !Amount2.isEmpty()) {
                    AmountOfMoney= true;
                    Allure.step("Сумма отображается в подвале", Status.PASSED);
                }
                else {
                    AmountOfMoney= false;
                    Allure.step("Сумма не отображается в подвале", Status.FAILED);}
            }
        //Проверяем сумму из подвала с суммой на карте
        try {
            WebElement AmountOnCard = driver.findElement(By.xpath(WINDOW_AMOUNT_CARD));
            String Amount = AmountOnCard.getText();
            WebElement AmountToPay = driver.findElement(By.xpath(FOOTER_PAYMENT_AMOUNT_TO_PAY));
            String Amount1 = AmountToPay.getText();
            WebElement AmountWillbeAdded = driver.findElement(By.xpath(WINDOW_AMOUNT_CARD_SBP));
            String Amount2 = AmountWillbeAdded.getText();
            if ((Amount1.contains(Amount)) || (Amount1.contains(Amount2))) {
                equals = true;
                Allure.step("Сумма к оплате совпадает с суммой на карте ", Status.PASSED);
            } else {
                equals = false;
                Allure.step("Сумма к оплате не совпадает с суммой на карте ", Status.FAILED);
            }
            if (timer == true && Card == true && AmountOfMoney == true && equals == true) {
                Allure.step("Данные отображаются корректно", Status.PASSED);
            } else {
                Allure.step("Ошибка в данных", Status.FAILED);
            }
        }catch (Exception e){}
        }

        //Сравниваем суммы из подвала и сумму на карте
    public void checkAmountPayout() {
        Boolean Am = false;
        Boolean Am1 = false;
        Boolean Fee = false;
        WebElement AmountOnCard = driver.findElement(By.xpath(INPUT_AMOUNT));
        String Amount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", AmountOnCard);
        WebElement AmountToPay = driver.findElement(By.xpath(FOOTER_PAYMENT_AMOUNT_WILL_BE_ADDED));
        String Amount1 = AmountToPay.getText();
        if (Amount1.contains(Amount)) {
            Am = true;

            System.out.println("Сумма в подвале и в поле совпадают");
            Allure.step("Сумма в подвале и в поле совпадают", Status.PASSED);
        } else {
            Am = false;
            System.out.println("Сумма в подвале и в поле не совпадают");
            Allure.step("Сумма в подвале и в поле не совпадают", Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот:Сумма в подвале и в поле не совпадают", new ByteArrayInputStream(Page));
        }
        /*WebElement PayoutFee = driver.findElement(By.xpath(PAYOUT_FEE));
        String PayoutFee1 = PayoutFee.getText();
        WebElement AmountToPayFee = driver.findElement(By.xpath(FOOTER_PAYMENT_FEE));
        String PayoutFee2 = AmountToPayFee.getText();
        if (PayoutFee2.contains(PayoutFee1)) {
            Fee = true;
            System.out.println(PayoutFee1);
            System.out.println(PayoutFee2);
        } else {
            Fee = false;
            System.out.println(PayoutFee1);
            System.out.println(PayoutFee2);
        }*/
       /* WebElement PayoutAmount = driver.findElement(By.xpath(PAYOUT_AMOUNT));
        String PayoutAmount1= PayoutAmount .getText();
        WebElement FooterAmount = driver.findElement(By.xpath(FOOTER_PAYMENT_AMOUNT_TO_PAY));
        String PayoutAmount2 = FooterAmount.getText();
        if (PayoutAmount2.equals(PayoutAmount1)) {
            Am1 = true;
            System.out.println(PayoutAmount1);
            System.out.println(PayoutAmount2);
        } else {
            Am1 = false;
            System.out.println(PayoutAmount1);
            System.out.println(PayoutAmount2);
        }
        if (*//*Fee == true &&*//* Am == true && Am1 == true){
            System.out.println("Сумма в подвале и в поле совпадают");
            Allure.step("Сумма в подвале и в поле совпадают", Status.PASSED);
        }else {
            System.out.println("Сумма в подвале и в поле не совпадают");
            System.out.println(Am);
            System.out.println(Am1);
            Allure.step("Сумма в подвале и в поле не совпадают", Status.FAILED);
        }*/
        }
}




