package Pages.Bets;

public class Locators {
    public static class XPath {

        //Кнопка открытия окна Купона
        public static final String BUTTON_WINDOW_COUPON = "//*[@id=\"bt-inner-page\"]//div/div[1]/div[2]/div[3]/div";
        //Кнопка Логин
        public static final String BUTTON_LOGIN_IN_WINDOW_COUPON = "//*[@id=\"bt-inner-page\"]//div/div[1]/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/button";
        //Случайная ставка
        public static final String BUTTON_RANDOM_BET = "//*[@id=\"outcome-2318966558535327784-10--10\"]";
        //Поле суммы ставки
        public static final String INPUT_AMOUNT_BET = "//*[@id=\"bt-inner-page\"]//div/div[1]/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div/div/div/div/div/a/div[2]/div[2]/div/form/label/div/div/input";
        //Кнопка Поставить
        public static final String BUTTON_TO_MAKE_A_BET = "//*[@id=\"bt-inner-page\"]//div/div[1]/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div/div[2]/div[1]/div/div[2]/button";
        //Уведомление о ставке
        public static final String TEXT_NOTIFICATION_MAKED_BET = "//*[@id=\"bt-inner-page\"]//div/div[1]/div[2]/div[3]/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div/div[1]";

    }
    public static class CSS {

        //Поле количество бомб
        public static final String NUMBERS_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/span/input";
    }
}
