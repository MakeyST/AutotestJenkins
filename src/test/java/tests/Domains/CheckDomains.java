package tests.Domains;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.model.Status;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static Constants.Constant.Data.*;
import static Constants.Constant.Id.*;
import static Constants.Constant.XPath.*;
import static Constants.Constant.XPath.BUTTON_COIN_PAGE;
import static Pages.Autorization.Locators.XPath.WINDOW_AUTORISATION;

import static io.qameta.allure.Allure.step;


public class CheckDomains extends BaseTest {


    public CheckDomains() throws MalformedURLException {
    }

    @Test(description = "Проверка доменов",priority = 4,groups = "domains")
    @Severity(value= SeverityLevel.CRITICAL)
    @Description("Проверка доменов")
    public void main(){
        for (int i = 0; i < 6; i++){
            Allure.step("Проверка "+(i+1)+" страницы", Status.PASSED);
            //Считываем данные для теста с нашего Excel файла
             List<String> firstColumnData = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream("E:\\Autotests\\Begins\\src\\main\\resources\\domains.xlsx");
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(i);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // Получите только первую ячейку (первую колонку) из каждой строки
                Cell firstCell = row.getCell(0);
                if (firstCell != null) {
                    String cellValue = "";
                    switch (firstCell.getCellType()) {
                        case STRING:
                            cellValue = firstCell.getStringCellValue();
                            break;
                        case NUMERIC:
                            cellValue = String.valueOf(firstCell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            cellValue = String.valueOf(firstCell.getBooleanCellValue());
                            break;
                    }
                    firstColumnData.add(cellValue);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        String FILE_NAME = "E:\\Autotests\\Begins\\src\\main\\resources\\domains.xlsx";
        for (String cellValue : firstColumnData) {
                 int ii = i;
                System.out.print(cellValue );
                try{
                    step(cellValue , () -> {
                        //Устанавливаем максимальное время ожидания загрузки страницы 6 секунд
                        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));

                        try {
                            if (cellValue.contains("https"))
                            // Пытаемся загрузить страницу
                            driver.get(cellValue);
                            else{
                                driver.get("https://"+cellValue);
                            }
                        } catch (TimeoutException e) {
                            // Обрабатываем исключение, которое произойдет, если страница не загрузится в течение 5 секунд
                            System.out.println("Страница не загрузилась ");
                            Allure.step("Страница не загрузилась ",Status.FAILED);
                            TakeScreenshot.TakeScreenShot("Скриншот: Страница не загрузилась");
                            //Записываем в наш файл Excel отрицательный результат загрузки страницы
                            try {
                                FileInputStream fis = new FileInputStream(FILE_NAME);
                                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                                XSSFSheet sheet = workbook.getSheetAt(ii); // Первый лист
                                XSSFRow row = sheet.getRow(firstColumnData.indexOf(cellValue));
                                XSSFCell cell = row.createCell(1); // Записываем данные во второй столбец (нумерация с 0)
                                cell.setCellValue("Ошибка: Сайт заблокирован РКН");
                                FileOutputStream fos = new FileOutputStream(FILE_NAME);
                                workbook.write(fos);
                            } catch (Exception e1) {
                                e.printStackTrace();
                            }
                            return;
                        }

                                FunctionsDomains.TestHttpResponseCode(firstColumnData.indexOf(cellValue), "+", "Сайт не загружается",ii);
                       /* basepage.ClickById(ID_BUTTON_REGISTRATION);
                        basepage.ClickByXpath(BUTTON_EMAIL_REGISTRATION);
                        basepage.InputTextByXpath(INPUT_EMAIL_REGISTRATION,RANDOM_EMAIL);
                        basepage.InputTextByXpath(INPUT_PASSWORD_REGISTRATION,PASSWORD_LOGIN);
                        basepage.ClickByXpath(BUTTON_18_YEARS);
                        basepage.ClickByXpath(BUTTON_LOGIN_REGISTRATION);
                        basepage.ClickByXpath(BUTTON_FINISH_REGISTRATION);
                        WaitUtils.waitForPageToLoad();
                        WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_PROFILE));
                        basepage.ClickByXpath(BUTTON_PROFILE);
                        WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_LOG_OUT));
                        basepage.ClickByXpath(BUTTON_LOG_OUT);
                        basepage.ClickByXpath("//div[@class='center-info__buttons']/button[1]/span");*/
                                //Ожидаем загрузки страницы
                                WaitUtils.waitForPageToLoad();
                                //Ждем пока кнопка Авторизации будет доступна
                                WaitUtils.waitForElementToBeClickable(By.id(ID_BUTTON_LOG_IN));
                                //Нажимаем на кнопку Авторизация
                                basepage.ClickById(ID_BUTTON_LOG_IN);
                                //ВВодим логин
                                basepage.InputTextById(ID_INPUT_EMAIL, EMAIL_LOGIN);
                                //Вводим пароль
                                basepage.InputTextById(ID_INPUT_PASSWORD, PASSWORD_LOGIN);
                                //Нажимаем Войти
                                basepage.ClickById(ID_BUTTON_LOG_IN_WINAUT);
                                //Ждем пока пропадет окно авторизации
                                WaitUtils.WaitForElementToBeInvisability(WINDOW_AUTORISATION);
                                //Ждем загрузки страницы
                                WaitUtils.waitForPageToLoad();
                                //Ждем пока боковое меню будет видимым
                                WaitUtils.waitForElementToBeVisible(By.id(ID_MENU));
                                //Нажимаем на игры
                                basepage.ClickById(ID_MENU);
                                //Ждем пока кнопка Астероид будет доступна
                                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_ASTEROID_PAGE));
                                //Нажимаем на кнопку Астероид
                                basepage.ClickByXpath(BUTTON_ASTEROID_PAGE);
                                //Проверяем статус-код
                                FunctionsDomains.TestHttp("Статус код 200 игры Астероид");
                                //Ждем когда боковое меню будет кликабельным
                                WaitUtils.waitForElementToBeVisible(By.id(ID_MENU));
                                //Нажимаем на кнопку Игры
                                basepage.ClickById(ID_MENU);
                                //Ждем пока кнопка Кейсы станет кликабельной
                                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CASES_PAGE));
                                //Нажимаем на кнопку Кейсы
                                basepage.ClickByXpath(BUTTON_CASES_PAGE);
                                //Проверяем статус-код
                                FunctionsDomains.TestHttp("Статус код 200 игры Кейсы");
                                //Ждем пока боковое меню будет видимым
                                WaitUtils.waitForElementToBeVisible(By.id(ID_MENU));
                                //Нажимаем на игры
                                basepage.ClickById(ID_MENU);
                                //Ждем пока кнопка Монетка будет доступна
                                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_COIN_PAGE));
                                //Нажимаем на кнопку Игры
                                basepage.ClickByXpath(BUTTON_COIN_PAGE);
                                //Проверяем статус-код
                                FunctionsDomains.TestHttp("Статус код 200 игры Монетки");
                                //Ждем пока боковое меню будет видимым
                                WaitUtils.waitForElementToBeVisible(By.id(ID_MENU));
                                //Нажимаем на игры
                                basepage.ClickById(ID_MENU);
                                //Ждем пока кнопка Краш будет доступна
                                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CRASH_PAGE));
                                //Нажимаем на кнопку Игры
                                basepage.ClickByXpath(BUTTON_CRASH_PAGE);
                                //Проверяем статус-код
                                FunctionsDomains.TestHttp("Статус код 200 игры Краш");
                                //Ждем пока боковое меню будет видимым
                                WaitUtils.waitForElementToBeVisible(By.id(ID_MENU));
                                //Нажимаем на игры
                                basepage.ClickById(ID_MENU);
                                //Ждем пока кнопка Минер будет доступна
                                WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_MINER_PAGE));
                                //Нажимаем на кнопку Игры
                                basepage.ClickByXpath(BUTTON_MINER_PAGE);
                                //Проверяем статус-код
                                FunctionsDomains.TestHttp("Статус код 200 игры Минер");
                        //Очистка куки
                        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
                        driver.manage().deleteAllCookies();//очистка куки
                        javascriptExecutor.executeScript("window.sessionStorage.clear()");//очистка истории сессий
                    });
                }catch (Exception e){
                }
            System.out.println(); // Переход на следующую строку
            }
            }
    }
}

