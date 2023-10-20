package Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Constants.Constant.XPath.*;

public class Constant {
    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 4;
        public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
    }

    public static class Urls {
        public static final String GETX_HOME_PAGE="https://gx10pd.boats";
        public static final String CRASH_GAME_PAGE="https://gx10pd.boats/games/crash";

        public static final String ASTEROID_GAME_PAGE="https://gx10pd.boats/games/rocket";

        public static final String MINER_GAME_PAGE="https://gx10pd.boats/games/miner";

        public static final String COIN_GAME_PAGE="https://gx10pd.boats/games/coinflip";


        public static final String CASINO_PAGE="https://gx10pd.boats/games/live-casino";

    }

    public static class Data {

        public static final String EMAIL_LOGIN="alex.miheeftest@gmail.com";
        public static final String PASSWORD_LOGIN="simbol12345";

        public static  String RANDOM_EMAIL=rnd(2)+"@ggg.ggg";
        public static final String NEW_PASSWORD = "simbol123456";
        public static final String OLD_PASSWORD = "simbol12345";
        public static final String NEW_NICKNAME =  "alex";
        public static final  String OLD_NICKNAME = "alexx";
        public static final String PROMOKOD = "123";
    }


    public static void main(String... args)
    {
        final double max = 1000; // Максимальное число для диапазона от 0 до max
        final double rnd = rnd(max);
    }
    public static double rnd(final double max)
    {
        return Math.random() ;
    }

    public static class Id{
        //Боковое меню
        public static final String ID_MENU = "menu-games";
        //Кнопка авторизации
        public static final String ID_BUTTON_LOG_IN = "btn-login";
        //Кнопка регистрации
        public static final String ID_BUTTON_REGISTRATION = "btn-registration";
        //Поле логина
        public static final String ID_INPUT_EMAIL = "login-field-email";
        //Поле пароля
        public static final String ID_INPUT_PASSWORD = "login-field-password";
        //Кнопка войти
        public static final String ID_BUTTON_LOG_IN_WINAUT = "login-form-login";
        //Кнопка FAQ
        public static final String ID_BUTTON_FAQ = "menu-faq";
        //Кнопка Казино
        public static final String ID_BUTTON_CASINO = "menu-casino";
        //Кнопка Слоты
        public static final String ID_BUTTON_BETS = "menu-bets";
        //Кнопка Бонусы
        public static final String ID_BUTTON_BONUSES = "menu-bonuses";
    }

    public static class XPath {

        //Уведомление
        public static final String PUSH = "//div[@class='vue-notification-group']/span/div/div";

        public static final String PUSH_AMOUNT = "//div[@class='vue-notification-group']/span/div/div/span";
        //Текст уведомления
        public static final String PUSH_TEXT = "//div[@class='vue-notification-group']/span/div/div/div/b";
        public static final String BALANCE = "//div[@class='currency-wrapper']/div/button/span/span[2]/span";
        //Кнопка обновления баланса
        public static final String RELOAD_BALANCE= "//div[@class='currency-wrapper']/button/img";

        //Кнопки в боковом меню
        public static final String BUTTON_ASTEROID_PAGE = "//*[@id='menu-games']/div/ul/li/a[@href='/games/rocket']";
        public static final String BUTTON_COIN_PAGE = "//*[@id='menu-games']/div/ul/li/a[@href='/games/coinflip']";
        public static final String BUTTON_CRASH_PAGE = "//*[@id='menu-games']/div/ul/li/a[@href='/games/crash']";
        public static final String BUTTON_MINER_PAGE = "//*[@id='menu-games']/div/ul/li/a[@href='/games/miner']";
        public static final String BUTTON_CASES_PAGE = "//*[@id='menu-games']/div/ul/li/a[@href='/games/cases']";

    }



}
