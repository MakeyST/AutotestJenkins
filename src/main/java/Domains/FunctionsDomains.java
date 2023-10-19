package Domains;

import Pages.base.BasePage;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import static Constants.Constant.Id.ID_BUTTON_LOG_IN;

public class FunctionsDomains extends BasePage {
    public FunctionsDomains(WebDriver driver) {
        super(driver);
    }
    public void TestHttp(String posit) {

        // Получить URL текущей страницы
        String currentUrl = driver.getCurrentUrl();

        // Создать клиент HTTP
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // Создать HTTP GET запрос к нужному URL
        HttpGet httpGet = new HttpGet(currentUrl);

        // Выполнить HTTP GET запрос и получить ответ
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Получить статус-код из ответа
        int statusCode = response.getStatusLine().getStatusCode();
        int variableValue;
        // Проверить, что статус-код равен 200 (OK)

        if (statusCode == 200) {
            // Присвоить переменной значение 200
            variableValue = 200;
            System.out.println(posit);
            Allure.step(posit , Status.PASSED);
        } else {
            // Присвоить переменной другое значение, если статус-код не равен 200
            variableValue = 404; // Например, 404 для статуса "Not Found"
            System.out.println("Статус-код не равен 200.");
            Allure.step("Страница не октрывается, статус-код: "+statusCode, Status.FAILED);
        }
    }
    static String FILE_NAME = "E:\\Autotests\\Begins\\src\\main\\resources\\domains.xlsx";
    public static void writeDataToExcel(int rowNumber, String data) {
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0); // Первый лист
            XSSFRow row = sheet.getRow(rowNumber);
            XSSFCell cell = row.createCell(1); // Записываем данные во второй столбец (нумерация с 0)
            cell.setCellValue(data);
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void TestHttpResponseCode(int rowNumber, String datapos,String dataneg,Integer i) {

        // Получить URL текущей страницы
        String currentUrl = driver.getCurrentUrl();

        // Создать клиент HTTP
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // Создать HTTP GET запрос к нужному URL
        HttpGet httpGet = new HttpGet(currentUrl); // Замените на URL вашего ресурса

        // Выполнить HTTP GET запрос и получить ответ
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Получить статус-код из ответа
        int statusCode = response.getStatusLine().getStatusCode();
        int variableValue;
        // Проверить, что статус-код равен 200 (OK)

        if (statusCode == 200) {
            // Присвоить переменной значение 200
            variableValue = 200;
            System.out.println("Статус-код 200.");
            Allure.step("Проверка кода 200 страницы", Status.PASSED);
            try {
                FileInputStream fis = new FileInputStream(FILE_NAME);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(i); // Первый лист
                XSSFRow row = sheet.getRow(rowNumber);
                XSSFCell cell = row.createCell(1); // Записываем данные во второй столбец (нумерация с 0)
                cell.setCellValue(datapos);
                FileOutputStream fos = new FileOutputStream(FILE_NAME);
                workbook.write(fos);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Присвоить переменной другое значение, если статус-код не равен 200
            variableValue = 404; // Например, 404 для статуса "Not Found"
            System.out.println("Статус-код не равен 200.");
            Allure.step("Страница не открывается, статус-код: "+statusCode, Status.FAILED);
            try {
                FileInputStream fis = new FileInputStream(FILE_NAME);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(i); // Первый лист
                XSSFRow row = sheet.getRow(rowNumber);
                XSSFCell cell = row.createCell(1); // Записываем данные во второй столбец (нумерация с 0)
                cell.setCellValue(dataneg);
                FileOutputStream fos = new FileOutputStream(FILE_NAME);
                workbook.write(fos);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
