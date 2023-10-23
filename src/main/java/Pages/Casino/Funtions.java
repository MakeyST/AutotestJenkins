//package Pages.Casino;
//
//import Pages.base.BasePage;
//
//
//
//import io.qameta.allure.Allure;
//
//import io.qameta.allure.model.Status;
//
//import net.lightbody.bmp.core.har.Har;
//import net.lightbody.bmp.core.har.HarEntry;
//
//import org.openqa.selenium.*;
//
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//import java.time.Duration;
//
//
//
//
//public class Funtions extends BasePage {
//    public Funtions(WebDriver driver) {
//        super(driver);
//    }
//    public void checkResponses() throws InterruptedException {
//
//        for (int i = 30; i < 31; i++) {
//                while (true) {
//                    try {
//                        By elementLocator = By.xpath("//div[@class='slots-list__footer']/button/span");
//                        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//                        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
//                        Actions actions = new Actions(driver);
//                        actions.moveToElement(element).perform();
//                        element.click(); // Попытка клика по элементу
//                        Thread.sleep(1000);
//                    } catch (TimeoutException e) {
//                        // Элемент больше не найден, завершаем цикл
//                        break;
//                    }
//                }
//                Boolean check = false;
//            WebElement elementToHover = driver.findElement(By.xpath("//div[@class='slots__list']/div["+(i+1)+"]"));
//            Actions actions = new Actions(driver);
//            // Наведите курсор на элемент
//            actions.moveToElement(elementToHover).perform();
//            WebElement elementPlay = driver.findElement(By.xpath("//div[@class='slots__list']/div["+(i+1)+"]/div/button[1]"));
//            actions.moveToElement(elementPlay).perform();
//            String name = driver.findElement(By.xpath("//div[@class='slots__list']/div["+(i+1)+"]/div[2]")).getText();
//            Allure.step("ИГРА: "+name);
//                proxy.newHar("myHar");
//                Thread.sleep(2000);
//                elementPlay.click();
//                Thread.sleep(8000);
//                Har har = proxy.getHar();
//                boolean initRequestFound = false;
//                for (HarEntry entry : har.getLog().getEntries()) {
//                    if (entry.getRequest().getUrl().contains("init")) {
//                        // Найден запрос "init", проверьте его статус код
//                        int statusCode = entry.getResponse().getStatus();
//                        if (statusCode == 200) {
//                            System.out.println("Запрос 'init' имеет статус 200.");
//                            Allure.step("Запрос 'init' имеет статус 200.", Status.PASSED);
//                            initRequestFound = true;
//                        } else {
//                            System.out.println("Запрос 'init' имеет статус " + statusCode + ", ожидался статус 200.");
//                            Allure.step("Запрос 'init' имеет статус " + statusCode + ", ожидался статус 200.", Status.FAILED);
//                        }
//                        break; // Выход из цикла после нахождения запроса "init"
//                    }
//                }
//                boolean mirrorRequestFound = false;
//                for (HarEntry entry : har.getLog().getEntries()) {
//                    if (entry.getRequest().getUrl().contains("mirror")) {
//                        // Найден запрос "init", проверьте его статус код
//                        int statusCode = entry.getResponse().getStatus();
//                        if (statusCode == 200) {
//                            System.out.println("Запрос 'mirror' имеет статус 200.");
//                            Allure.step("Запрос 'mirror' имеет статус 200.", Status.PASSED);
//                            mirrorRequestFound = true;
//                        } else {
//                            System.out.println("Запрос 'mirror' имеет статус " + statusCode + ", ожидался статус 200.");
//                            Allure.step("Запрос 'mirror' имеет статус " + statusCode + ", ожидался статус 200.", Status.FAILED);
//                        }
//                        break; // Выход из цикла после нахождения запроса "init"
//                    }
//
//                }
//                boolean gameLaunchRequestFound = false;
//            for (HarEntry entry : har.getLog().getEntries()) {
//                    if (entry.getRequest().getUrl().contains("gameLaunch")) {
//                        // Найден запрос "init", проверьте его статус код
//                        int statusCode = entry.getResponse().getStatus();
//                        if (statusCode == 200) {
//                            System.out.println("Запрос 'gameLaunch' имеет статус 200.");
//                            Allure.step("Запрос 'gameLaunch' имеет статус 200.", Status.PASSED);
//                            gameLaunchRequestFound = true;
//                        } else {
//                            System.out.println("Запрос 'gameLaunch' имеет статус " + statusCode + ", ожидался статус 200.");
//                            Allure.step("Запрос 'gameLaunch' имеет статус " + statusCode + ", ожидался статус 200.", Status.FAILED);
//                            if (statusCode == 400){
//                                check = true;
//                            }
//                        }
//                    }else{
//                        System.out.println("Запрос 'gameLaunch' нет");
//                        Allure.step("Запрос 'gameLaunch' нет", Status.FAILED);
//                    }
//                    break; // Выход из цикла после нахождения запроса "init"
//                }
//                if (check == true) {
//                    driver.findElement(By.xpath("//div[@class='slots-game-error']/div/button/span")).click();
//                }else{
//                    driver.findElement(By.xpath("//div[@class='slots__heading']/div/button/span")).click();
//                }
//
//        }
//    }
//}
