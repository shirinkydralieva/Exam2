package task1;

import java.util.Scanner;

public class UserAccountManager {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Integer choose;
        String login = null;
        String password = null;
        BasicUserAccount basicUserAccount = new BasicUserAccount();
        System.out.println("Инструкция по использованию программы: " +
                "\nСначала вы должны создать аккаунт. Далее вы уже сможете обновить его или удалить." +
                "\nЕсли вы попытаетесь сначала обновить или удалить выйдет сообщение о том, что" +
                "аккаунт не был создан." +
                "\nВ случае обновления или удаления аккаунта убедитесь, что данные введены верно. " +
                "\nЕсли вы ошибетесь, ничего страшного - выйдет сообщение с вашими верными данными." +
                "\nСпецифика сервиса в том, что введенный логин и пароль при регистрации могут быть любого размера." +
                "\nВы были предупреждены!");
        printMenu();
        System.out.println("\nВыберите функцию:");
        choose = scanner.nextInt();

        while (choose != 4) {
            switch (choose){
                case 1:
                    System.out.println("Введите логин:");
                    login = scanner.next();
                    System.out.println("Введите пароль:");
                    password = scanner.next();
                    basicUserAccount.createAccount(login,password);
                    System.out.println("Аккаунт успешно создан! Вот он: \n" + basicUserAccount);
                    break;

                case 2:
                    if (login == null || password == null) {
                        System.out.println("Аккаунт не был создан, вернитесь назад.");
                    } else {
                        System.out.println("Введите новый логин:");
                        login = scanner.next();
                        System.out.println("Введите новый пароль:");
                        password = scanner.next();
                        basicUserAccount.updateAccount(login,password);
                        System.out.println("Аккаунт успешно обновлен! Вот он: \n" + basicUserAccount);
                    }
                    break;
                case 3:
                    if (login == null || password == null) {
                        System.out.println("Аккаунт не был создан, вернитесь назад.");
                    } else {
                        System.out.println("Чтобы выбрать аккаунт для удаления, введите логин:");
                        login = scanner.next();
                        System.out.println("и пароль:");
                        password = scanner.next();
                        basicUserAccount.deleteAccount(login, password);
                        System.out.println(basicUserAccount);
                    }
                    break;
                default:
                    System.out.println("Ошибка, проверьте правильно ли введена функция.");
            }
            printMenu();
            choose = scanner.nextInt();
        }

    }

    public static void printMenu(){
        System.out.println("_* Меню: *_" +
                            "\n1.Регистрация (Создать аккаунт)" +
                            "\n2.Обновить аккаунт" +
                            "\n3.Удалить аккаунт" +
                            "\n4. Выйти"
        );
    }
}
