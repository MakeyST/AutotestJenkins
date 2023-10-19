package Pages.Asteroid;

public class Locators {
    public static class XPath {
        //Кнопки управления в Астероиде

        //Кнопка Играть
        public static final String BUTTON_PLAY_ASTEROID = "//div[@class='rocket-control rocket-control']/div[2]/button[1]";
        //Поле Ставка
        public static final String BET_ASTEROID = "//span[@class='rocket-control__bid-field__bid']/label/input";
        //Кнопка 1/2 ставка
        public static final String BUTTON_BET_HALF_ASTEROID = "//div[@class='rocket-control__bid-field__control']/button[1]";
        //Кнопка х2 ставка
        public static final String BUTTON_BET_X2_ASTEROID= "//div[@class='rocket-control__bid-field__control']/button[2]";
        //Кнопка минимальная ставка
        public static final String BUTTON_BET_MIN_ASTEROID= "//div[@class='rocket-control__bid-field__control']/button[3]";
        //Кнопка Максимальная ставка
        public static final String BUTTON_BET_MAX_ASTEROID= "//div[@class='rocket-control__bid-field__control']/button[4]";
    }
}
