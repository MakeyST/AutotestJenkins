package Pages.Profile;

public class Locators {
    public static class XPath {


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
        //Кнопка Доступ в профиле.
        public static final String BUTTON_ACCESS_IN_PROFILE = "//div[@class='rc-tabs']/div/a[3]";

        //Кнопка История
        public static final String BUTTON_HISTORY= "//div[@class='user-informer__dropdown js-drop-down__dropdown']/div/div[3]/a[4]";
        //Кнопка История в профиле
        public static final String BUTTON_HISTORY_IN_PROFILE = "//div[@class='rc-tabs']/div/a[4]";

        //Кнопка Выйти
        public static final String BUTTON_LOG_OUT = "//div[@class='user-informer__dropdown js-drop-down__dropdown']/div/div[3]/button";
    }
}
