package task1;

public interface UserAccount {
    /*
       *Здесь методы должны быть с параметрами, ведь когда мы хотим сделать что-либо с аккаунтом,
       * нам нужно получить доступ через логин и пароль
       * (или когда мы создаем учетную запись - надо передать значения в любом случае)
     */
    void createAccount(String login, String password);
    void updateAccount(String login, String password);
    void deleteAccount(String login, String password);
}
