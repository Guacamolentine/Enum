package ua.ithilel.java;

import java.util.Scanner;

public class Main {

    static void tryLogin(Store gameStore) {
        do {
            System.out.println("Enter login:");
            Scanner scanLogin = new Scanner(System.in);
            String login = scanLogin.nextLine();
            System.out.println();

            System.out.println("Enter password:");
            Scanner scanPassword = new Scanner(System.in);
            String password = scanLogin.nextLine();
            System.out.println();

            if (gameStore.login(login, password)) {
                gameStore.getCurrentUserRights();
                gameStore.logout();
                break;
            } else {
                System.out.println("Invalid username(s) or password");
            }
        } while (true);
    }

    public static void main (String[]args){

        User authorizedUser1 = new User("dima999", "123456qWe", UserStatus.DIRECTOR);
        User authorizedUser2 = new User("yoda2000", "Starwars2000", UserStatus.ADMINISTRATOR);
        User authorizedUser3 = new User("managerAnatoliu", "qwerty", UserStatus.MANAGER);
        User authorizedUser4 = new User("android090", "androidcool", UserStatus.CLIENT);
        User authorizedUser5 = new User("Anonymous3000", "Anonymous", UserStatus.ANONYMOUS);
        User[] arrUsers = {authorizedUser1, authorizedUser2, authorizedUser3, authorizedUser4, authorizedUser5};

        Store gameStore = new Store("GoodGame", "good-game.com", arrUsers);

        tryLogin(gameStore);

    }
}