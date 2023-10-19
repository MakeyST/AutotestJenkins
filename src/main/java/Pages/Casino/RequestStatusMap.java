package Pages.Casino;

import Pages.base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class RequestStatusMap extends BasePage {

    public RequestStatusMap(WebDriver driver) {
        super(driver);
    }
    private Map<String, Integer> requestStatusMap = new HashMap<>();

    public void addStatus(String requestName, int statusCode) {
        requestStatusMap.put(requestName, statusCode);
    }

    public int getStatus(String requestName) {
        return requestStatusMap.getOrDefault(requestName, -1); // Вернуть -1, если статус не найден
    }
}
