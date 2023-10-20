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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;
import tests.base.basetests.BaseTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static Constants.Constant.Data.EMAIL_LOGIN;
import static Constants.Constant.Data.PASSWORD_LOGIN;
import static Constants.Constant.Id.*;
import static Constants.Constant.Id.ID_MENU;
import static Constants.Constant.XPath.*;
import static Constants.Constant.XPath.BUTTON_MINER_PAGE;
import static Pages.Autorization.Locators.XPath.WINDOW_AUTORISATION;
import static io.qameta.allure.Allure.step;

public class FastCheckDomains extends BaseTest {


    public FastCheckDomains() throws MalformedURLException {
    }

    @Test(description = "Быстрая проверка доменов",priority = 4,groups = "domains")
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
                        //Ждем пока кнопка Краш будет доступна
                        WaitUtils.waitForElementToBeClickable(By.xpath(BUTTON_CRASH_PAGE));
                        //Нажимаем на кнопку Игры
                        basepage.ClickByXpath(BUTTON_CRASH_PAGE);
                        //Проверяем статус-код
                        FunctionsDomains.TestHttp("Статус код 200 игры Краш");
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

