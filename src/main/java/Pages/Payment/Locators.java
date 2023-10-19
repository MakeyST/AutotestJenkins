package Pages.Payment;

public class Locators {
    public static class XPath {
        //Кнопка Кошелек
        public static final String BUTTON_PAYMENT = "//div[@class='headline__wrap wrap']/div[2]/div[3]/button";
        //Окно платежа
        public static final String WINDOW_PAYMENT = "//div[@class='modal__wrap']";
        //Кнопка первой суммы
        public static final String BUTTON_AMOUNT1 = "//div[@class='bit-feed__buttons']/button[1]";
        //Кнопка второй суммы
        public static final String BUTTON_AMOUNT2 = "//div[@class='bit-feed__buttons']/button[2]";
        public static final String BUTTON_AMOUNT3 = "//div[@class='bit-feed__buttons']/button[3]";
        public static final String BUTTON_AMOUNT4 = "//div[@class='bit-feed__buttons']/button[4]";
        public static final String BUTTON_AMOUNT5 = "//div[@class='bit-feed__buttons']/button[5]";
        public static final String BUTTON_AMOUNT6 = "//div[@class='bit-feed__buttons']/button[6]";
        //Поле ввода суммы пополнения
        public static final String INPUT_AMOUNT = "//div[@class='field-group']/div[1]/div/span/input";
        //Кнопка У меня есть промокод
        public static final String BUTTOM_I_HAVE_A_PROMOKOD = "//div[@class='pay__right__content']//div[@class=\"giftbox\"]";
        //Поле ввода промокода
        public static final String INPUT_PROMOKOD = "//div[@class='pay__inner']/div[2]/div[2]/div/div[2]/div/input";

        //Кнопка Продолжить в окне пополнения
        public static final String BUTTON_NEXT = "//div[@class='pay__right__content']/form/div[3]/div/button/span";
        //Окно Ожидания оплаты
        public static final String WINDOW_WAITING_PAYMENT = "//div[@class='rs-modal__form-cell card-to-card-transfer']";

        //Кнопка закрыть в окне пополнения

        public static final String BUTTON_CLOSE_WINDOW_PAYMENT = "//div[@class='modal__wrap']/button/i";

        //Кнопка Продолжить в СБП

        public static final String BUTTON_NEXT_SBP = "//div[@class='only-sber']/div/button";

        //Постоянные Xpath таймера при пополнении
        public static final String TIMER_PAYMENT = "//div[@class='transfer-timer__body']/div[1]";
        public static final String TIMER_PAYMENT_HOURS = "//div[@class='c-count__left']/div[1]/span";
        public static final String TIMER_PAYMENT_MINUTS = "//div[@class='c-count__right']/div[1]/span";

        //Постоянные Xpath банковской карты при пополнении
        public static final String WINDOW_CARD = "//div[@class='transfer-process']/div[2]";
        public static final String WINDOW_NUMBER_CARD = "//div[@class='transfer-process']/div[2]/div[2]/div[1]/div[2]";
        public static final String WINDOW_AMOUNT_CARD = "//div[@class='transfer-process']/div[2]/div[2]/div[2]/div[2]";
        public static final String WINDOW_AMOUNT_CARD_SBP = "//div[@class='transfer-process']/div[2]/div[3]/div[2]";

        //Постоянные Xpath footer при пополнении
        public static final String FOOTER_PAYMENT = "//div[@class='pay__right__footer']";
        public static final String FOOTER_PAYMENT_AMOUNT_TO_PAY = "//div[@class='pay__right__footer']/div[1]/div[2]";
        public static final String FOOTER_PAYMENT_AMOUNT_WILL_BE_ADDED = "//div[@class='pay__right__footer']/div[2]/div[2]";
        public static final String FOOTER_PAYMENT_FEE = "//div[@class='pay__right__footer']/div[3]/div[2]";

        //Кнопки выбора метода оплаты

        public static final String CHOOSE_METOD_1 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[1]/button";
        public static final String CHOOSE_METOD_2 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[2]/button";
        public static final String CHOOSE_METOD_3 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[3]/button";
        public static final String CHOOSE_METOD_4 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[4]/button";
        public static final String CHOOSE_METOD_5 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[5]/button";
        public static final String CHOOSE_METOD_6 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[6]/button";
        public static final String CHOOSE_METOD_7 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[7]/button";
        public static final String CHOOSE_METOD_8 = "//div[@class=\"pay__left\"]/div[2]/div/ul/li[8]/button";

        //Кнопки выплаты

        public static final String PAYOUT = "//div[@class='pay__right__header']/div[2]";
        public static final String PAYOUT_NUMBER_CARD = "//div[@class='pay__inner']/div[3]/div/div/input";

        public static final String PAYOUT_AMOUNT = "//div[@class='qiwi__footer']/ul/li[2]/span[2]";
        public static final String PAYOUT_FEE = "//div[@class='qiwi__footer']/ul/li[1]/span[2]";

    }
}
