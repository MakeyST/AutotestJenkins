package Pages.Cases;

import Pages.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Locators{
    public static class XPath {
        //Кнопка самого дешевого кейса
        public static final String BUTTON_CASE_NEWBIE = "//div[@class='cases']/div[1]/div/div[1]";
        //Кнопка открыть
        public static final String BUTTON_OPEN_CASE= "//div[@class='case-page__game__bottom']/div";
        //Переключатель режима
        public static final String CHENGER_FAST_OPEN= "//div[@class='case-page__game__bottom']/label/span/span/i";
        //Кнопка Супер
        public static final String BUTTON_SUPER= "//div[@class='case-page__game__winner__bottom']/button";
        //Сумма супер выигрыша
        public static final String AMOUNT_SUPER="//div[@class='case-page__game__winner__bottom']/div[2]";
        //Окно супер выигрыша
        public static final String WINDOW_SUPER="//div[@class='case-page__game__winner average']";
        //Первый элемент ленты призов
        public static final String BAR_FIRST_ELEMENT = "//div[@class='winners__container']/div[1]";
        //Сумма на первом призе
        public static final String BAR_AMOUNT_FIRST_ELEMENT = "//div[@class='winners__container']/div[1]/div/div";
        //Никнейм игрока на первом призе
        public static final String BAR_NICKNAME_FIRST_ELEMENT = "//div[@class='winners__container']/div[1]/a/div";

    }
    public static class classes {
        //Класс самого дешевого кейса
        public static final String CLASS_CASE_NEWBIE = "case-winner winners__container small";
        //Класс самого average кейса
        public static final String CLASS_CASE_AVERAGE = "case-winner winners__container average";


    }

}





