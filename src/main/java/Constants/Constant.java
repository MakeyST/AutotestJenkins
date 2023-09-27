package Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Constants.Constant.XPath.FOOTER_PAYMENT_AMOUNT_TO_PAY;
import static Constants.Constant.XPath.FOOTER_PAYMENT_AMOUNT_WILL_BE_ADDED;

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

    }

    public static class Data {

        public static final String EMAIL_LOGIN="alex.miheeftest@gmail.com";
        public static final String EMAIL_PASSWORD="simbol12345";

        public static final String RANDOM_EMAIL=rnd(2)+"@ggg.ggg";
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
        public static final String ID_MENU = "menu-games";
    }

    public static class XPath {
        public static final String WINDOW_AUTORISATION = "//div[@class='modal modal_loaded float-in active']/div/div";

        public static final String BET_COIN = "//div[@class='cell-2-3 cell--dsm order-1--dsm']/div[2]/div[1]/div[1]/div[1]/div[2]/span/label/input";

        public static final String BALANCE = "//div[@class='currency-wrapper']/div/button/span/span[2]/span";

        public static final String BUTTON_BET_HALF_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[1]";
        public static final String BUTTON_BET_X2_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[2]";
        public static final String BUTTON_BET_MAX_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[4]";
        public static final String BUTTON_BET_MIN_COIN = "//div[@class='bit-feed__cell coinflip-control__bid-field']/div/button[3]";
        public static final String PUSH = "//div[@class='vue-notification-group']/span/div/div";
        public static final String PUSH_TEXT = "//div[@class='vue-notification-group']/span/div/div/div/b";
        public static final String BET_CRASH = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/span/input";
        public static final String AUTOSTOP = "//div[@class='bit-feed__row']/div[3]/div/div/span/input";
        public static final String CHENGER_CRASH = "//div[@class='bit-feed__row']/div[3]/div/label/span/span[1]/i";
        public static final String BUTTON_PLUS_ONE_CRASH = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[2]";
        public static final String BET_ASTEROID = "//span[@class='rocket-control__bid-field__bid']/label/input";
        public static final String BUTTON_BET_HALF_ASTEROID = "//div[@class='rocket-control__bid-field__control']/button[1]";
        public static final String NUMBERS_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[2]/span/input";
        public static final String BET_MINER = "//div[@class='bit-feed__row']/div[3]/div/div[1]/span/input";

        public static final String BUTTON_3_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[1]";
        public static final String BUTTON_5_BOMBS = "//div[@class='bit-feed__box bit-feed__box_bet']/div[1]/button[2]/span";
        //Кнопка Кошелек
        public static final String BUTTON_PAYMENT = "//div[@class='headline__wrap wrap']/div[2]/div[3]/button";

        public static final String WINDOW_PAYMENT = "//div[@class='modal__wrap']";
        public static final String BUTTON_AMOUNT1 = "//div[@class='bit-feed__buttons']/button[1]";
        public static final String BUTTON_AMOUNT2 = "//div[@class='bit-feed__buttons']/button[2]";
        public static final String BUTTON_AMOUNT3 = "//div[@class='bit-feed__buttons']/button[3]";
        public static final String BUTTON_AMOUNT4 = "//div[@class='bit-feed__buttons']/button[4]";
        public static final String BUTTON_AMOUNT5 = "//div[@class='bit-feed__buttons']/button[5]";
        public static final String BUTTON_AMOUNT6 = "//div[@class='bit-feed__buttons']/button[6]";
        public static final String INPUT_AMOUNT = "//div[@class='field-group']/div[1]/div/span/input";
        public static final String BUTTOM_I_HAVE_A_PROMOKOD = "//div[@class='pay__right__content']//div[@class=\"giftbox\"]";
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

        // Кнопка профиля
        public static final String BUTTON_PROFILE = "//div[@class='headline__userscope']";

        //Попап профиля
        public static final String POPUP_PROFILE = "//div[@class='user-informer__wrap']";
        //Кнопка Аккаунт
        public static final String BUTTON_ACCOUNT = "//div[@class='user-informer__dropdown js-drop-down__dropdown']/div/div[3]/a[1]";
        public static final String BUTTON_ACCOUNT_IN_PROFILE = "//div[@class='rc-tabs']/div/a[1]";
        //Таблица Ставки
        public static final String TABLET_BETS = "//div[@class='button-group button-group_light']/button[1]/span";
        //Элементы таблицы ставки
        public static final String TABLET_BETS_ELEMENTS = "//div[@class='tas-list tas-list_bet tas-list_mobile-drop']/div";
        //Таблица Платежи
        public static final String TABLET_PAYMENT = "//div[@class='button-group button-group_light']/button[2]/span";
        //Элементы Таблицы Платежи
        public static final String TABLET_PAYMENTS_ELEMENTS = "//div[@class='tas-list tas-list_payments tas-list_tablet-drop']/div";
        //Таблица Выводы
        public static final String TABLET_PAYOUT = "//div[@class='button-group button-group_light']/button[3]/span";
        //Элекменты таблицы выплаты
        public static final String TABLET_PAYOUT_ELEMENTS = "//div[@class='tas-list tas-list_outcash tas-list_tablet-drop']/div";
        //Таблица Бонусы
        public static final String TABLET_BONUSES = "//div[@class='button-group button-group_light']/button[4]/span";
        //Элементы таблицы Бонусы
        public static final String TABLET_BONUSES_ELEMENTS = "//div[@class='tas-list tas-list_bonuses tas-list_tablet-drop']/div";
        //Поле ввода Промокода
        public static final String INPUT_PROMOKOD_IN_PROFILE = "//div[@class='field-group__wrap']/input";
        //Кнопка Применить
        public static final String BUTTON_USE_PROMOKOD = "//div[@class='field-group__wrap']/button";

        //Кнопка Кошелек в профиле
        public static final String BUTTON_WALLET_IN_PROFILE = "//div[@class='user-box__info']/div[2]/button/span";
        //Кнопка Настройка
        public static final String BUTTON_SETTINGS= "//div[@class='user-informer__dropdown js-drop-down__dropdown']/div/div[3]/a[2]";

        public static final String BUTTON_SETTINGS_IN_PROFILE = "//div[@class='rc-tabs']/div/a[2]";

        //Поле ввода никнейма
        public static final String INPUT_NICKNAME = "//div[@class='grid grid_md grid-ungap']/div[1]/div/div/input";
        //Кнопка Сменить
        public static final String BUTTON_CHANGE_NICKNAME = "//div[@class='grid grid_md grid-ungap']/div[1]/div/div/button";
        //Поле Языка
        public static final String BUTTON_CHANGE_LANGUEGE = "//div[@class='grid grid_md grid-ungap']/div[2]/div/div[1]";
        //Окно выбора языка
        public static final String WINDOW_CHANGE_LANGUEGE = "//div[@class='select-box__drop scroll']";
        //Переключатель звуковых эффектов
        public static final String TURN_ON_SOUND_EFFECTS = "//div[@class='grid grid_gd grid-ungap']/div[1]/label/span/span[2]/i";
        //Переключатель Скрыть аватар и никнейм
        public static final String TURN_ON_HIDE_AVATAR_AND_NICKNIME = "//div[@class='grid grid_gd grid-ungap']/div[3]/label/span/span[2]/i";
        //Переключатель крыть игровую статистику
        public static final String TURN_ON_HIDE_GAME_STATISTIC = "//div[@class='grid grid_gd grid-ungap']/div[4]/label/span/span[2]/i";
        //Поле Старый пароль
        public static final String INPUT_OLD_PASWORD = "//div[@class='grid grid_md grid-ungap password_form']/div[1]/div/div/div/input";
        //Поле Новый пароль
        public static final String INPUT_NEW_PASWORD = "//div[@class='grid grid_md grid-ungap password_form']/div[2]/div/div/div/input";
        //Подтверждение пароля
        public static final String INPUT_DOUBLE_NEW_PASSWORD = "//div[@class='grid grid_md grid-ungap password_form']/div[3]/div/div/div/input";
        //Кнопка Сменить пароль
        public static final String BUTTON_CHANGE_PASSWORD = "//div[@class='grid grid_md grid-ungap password_form']/div[4]/div/div/div/button/span";
        //Кнопка Доступ
        public static final String BUTTON_ACCESS= "//div[@class='user-informer__dropdown js-drop-down__dropdown']/div/div[3]/a[3]";
        public static final String BUTTON_ACCESS_IN_PROFILE = "//div[@class='rc-tabs']/div/a[3]";

        //Кнопка История
        public static final String BUTTON_HISTORY= "//div[@class='user-informer__dropdown js-drop-down__dropdown']/div/div[3]/a[4]";
        public static final String BUTTON_HISTORY_IN_PROFILE = "//div[@class='rc-tabs']/div/a[4]";

        //Кнопка Выйти
        public static final String BUTTON_LOG_OUT = "//div[@class='user-informer__dropdown js-drop-down__dropdown']/div/div[3]/button";
    }



}
