package Pages.base;


import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TestHttpResponseCode extends BasePage {

    public TestHttpResponseCode(WebDriver driver) {
        super(driver);
    }

    public void TestHttpResponseCode() {

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
        } else {
            // Присвоить переменной другое значение, если статус-код не равен 200
            variableValue = 404; // Например, 404 для статуса "Not Found"
            System.out.println("Статус-код не равен 200.");
            Allure.step("Страница не октрывается, статус-код: "+statusCode, Status.FAILED);
            byte[] Page = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Скриншот : Статус код страницы не 200", new ByteArrayInputStream(Page));
        }
    }

}

