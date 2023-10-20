package Pages.Crash;

public class Locators {
    public static class XPath {

        //Кнопки управления в Краше

        //Поле ставка
        public static final String BET_CRASH = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/span/input";
        //Поле автостоп
        public static final String AUTOSTOP = "//div[@class='bit-feed__row']/div[3]/div/div/span/input";
        //Переключатель автостопа
        public static final String CHENGER_CRASH = "//div[@class='bit-feed__row']/div[3]/div/label/span/span[1]/i";
        //Ставка +1
        public static final String BUTTON_PLUS_ONE = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[2]";
        //Ставка -1
        public static final String BUTTON_BET_MINUS="//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[1]";
        //Ставка х10
        public static final String BUTTON_BET_X10= "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[1]/span";
        //Ставка х50
        public static final String BUTTON_BET_X50= "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[2]/span";
        //Ставка х100
        public static final String BUTTON_BET_X100= "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[3]/span";
        //Ставка х200
        public static final String BUTTON_BET_X200= "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[4]/span";
        //Максимальная ставка
        public static final String BUTTON_BET_MAX= "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/button[5]/span";
        //Кнопка автостоп +
        public static final String AUTOSTOP_UP= "//div[@class='bit-feed__row']/div[3]/div/div[1]/button[2]";
        //Кнопка автостоп -
        public static final String AUTOSTOP_DOWN= "//div[@class='bit-feed__row']/div[3]/div/div[1]/button[1]";
        //Кнопка включить автостоп
        public static final String AUTOSTOP_ON= "//div[@class='bit-feed__row']/div[3]/div/label/span/span[1]";
        //Кнопка Играть
        public static final String BUTTON_PLAY_CRASH = "//div[@class='bit-feed__cell bit-feed__cell_bit']/button[1]/span";
    }
}
