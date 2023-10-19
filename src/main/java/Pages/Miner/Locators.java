package Pages.Miner;

public class Locators {
    public static class XPath {
        //Кнопки управления минер

        //Поле количество бомб
        public static final String NUMBERS_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/span/input";
        //Поле ставки
        public static final String BET_MINER = "//div[@class='bit-feed__row']/div[3]/div/div[1]/span/input";
        //Кнопка играть
        public static final String BUTTON_PLAY_MINER = "//div[@class='bit-feed__cell bit-feed__cell_bit']/button[1]/span";

        //Кнопки количества бомб
        public static final String BUTTON_3_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[1]";
        public static final String BUTTON_5_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[2]";
        public static final String  BUTTON_10_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[3]";
        public static final String  BUTTON_16_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[4]";
        public static final String  BUTTON_24_BOMBS ="//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[5]";
        //Кнопка минимальной ставки
        public static final String BUTTON_MINER_BET_PLUS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[2]";
        //Кнопка ставка -1
        public static final String  BUTTON_MINER_BET_MINUS ="//div[@class='bit-feed__row']/div[3]/div/div[1]/div/button[1]";
        //Кнопка ставка минимальная
        public static final String  BUTTON_MINER_BET_MIN = "//div[@class='bit-feed__row']/div[3]/div/div[2]/button[1]";
        //Кнопки ставка +х
        public static final String  BUTTON_MINER_BET_PLUS10 = "//div[@class='bit-feed__row']/div[3]/div/div[2]/button[2]";
        public static final String  BUTTON_MINER_BET_PLUS50 = "//div[@class='bit-feed__row']/div[3]/div/div[2]/button[3]";
        public static final String  BUTTON_MINER_BET_PLUS100 = "//div[@class='bit-feed__row']/div[3]/div/div[2]/button[4]";
        public static final String  BUTTON_MINER_BET_PLUS200 = "//div[@class='bit-feed__row']/div[3]/div/div[2]/button[5]";
        //Кнопка максимальной ставки
        public static final String  BUTTON_MINER_BET_MAX = "//div[@class='bit-feed__row']/div[3]/div/div[2]/button[6]";
        //Ячейка в игре
        public static final String BUTTON_SLOT_MINER = "//div[@class='miner__cells__row']/div/div";
        //Кнопка Забрать
        public static final String BUTTON_TAKE_IN_MINER = "//div[@class='bit-feed__cell bit-feed__cell_bit']/button[2]";
    }
}
