package Pages.Coin;

public class Locators {
    public static class XPath {
        //Кнопки управления в Монетке
        //Кнопка Играть
        public static final String BUTTON_PLAY_COIN = "//div[@class='bit-feed']/div[2]/button[1]/span";
        //Кнопка Орел
        public static final String BUTTON_EAGLE = "//div[@class='bit-feed']/div[1]/div[1]";
        //Кнопка Решка
        public static final String BUTTON_TAILS = "//div[@class='bit-feed']/div[1]/div[3]";
        //Кнопка половина ставки
        public static final String BUTTON_BET_HALF_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[1]";
        //Кнопка ставка х2
        public static final String BUTTON_BET_X2_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[2]";
        //Кнопка ставка максимальная
        public static final String BUTTON_BET_MAX_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[4]";
        //Кнопка ставка минимальная
        public static final String BUTTON_BET_MIN_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[3]";
        //Кнопка забрать
        public static final String BUTTON_TAKE_IN_COIN = "//div[@class=\"bit-feed\"]/div[2]/button[2]/span";
        //Поле ставка
        public static final String BET_COIN = "//div[@class='cell-2-3 cell--dsm order-1--dsm']/div[2]/div[1]/div[1]/div[1]/div[2]/span/label/input";

    }
}
