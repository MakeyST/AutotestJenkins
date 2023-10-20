package Pages.Registration;

public class Locators {
    public static class XPath {
        //Регистрация
        //Кнопка регистрации через почту
        public static final String BUTTON_EMAIL_REGISTRATION ="//div[@class='button-group']/button[2]";
        //Поле почта
        public static final String INPUT_EMAIL_REGISTRATION = "//div[@class='js-tab active']/form/div[1]/div/div/input";
        //Поле пароль
        public static final String INPUT_PASSWORD_REGISTRATION = "//div[@class='js-tab active']/form/div[2]/div/div/div/div/input";
        //Галочка 18 лет
        public static final String BUTTON_18_YEARS = "//div[@class='js-tab active']/form/div[3]/label/span/i";
        //Кнопка создать
        public static final String BUTTON_LOGIN_REGISTRATION = "//div[@class='js-tab active']/form/div[5]/div/button[1]/span";
        //Кнопка продолжить в выборе валюты
        public static final String BUTTON_FINISH_REGISTRATION = "//div[@class='currency__right']/button";
    }
}
