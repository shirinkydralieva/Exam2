package task1;

public class BasicUserAccount implements UserAccount{
    private String login;
    private String password;
    @Override
    public void createAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void updateAccount(String updateLogin, String updatePassword) {
        this.login = updateLogin;
        this.password = updatePassword;
    }

    @Override
    public void deleteAccount(String login, String password) {
        this.login = null;
        this.password = null;
    }

    @Override
    public String toString() {
        if (login== null && password == null){
                return "Аккаунт был удален!";
        } else {
                return "UserAccount:" +
                    "\nlogin: " + login +
                    "\npassword: " + password;
        }
    }
}
