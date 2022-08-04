package ua.ithilel.java;

public class Store {

    private String nameStore;
    private String urlStore;
    private User[] arrUsers;
    private User authorizedUser;
    private boolean authorizedResul;

    public Store() {
    }

    public Store(String nameStore, String urlStore, User[] arrUsers) {
        this.nameStore = nameStore;
        this.urlStore = urlStore;
        this.arrUsers = arrUsers;
    }

    public boolean login(String login, String password) {
        for (int i = 0; i < arrUsers.length; i++) {
            if (arrUsers[i].getLogin().equals(login) & arrUsers[i].getPassword().equals(password)) {
                authorizedUser = new User(login, password, arrUsers[i].getRole());
                return authorizedResul = true;
            } else if (i < arrUsers.length) {
                continue;
            } else return authorizedResul = false;
        }
        return authorizedResul;
    }

    public void getCurrentUserRights() {
        switch (authorizedUser.getRole()) {
            case DIRECTOR -> System.out.println("Store manager, can manage personnel and prices");
            case ADMINISTRATOR ->
                    System.out.println("Store administrator, can add products and edit their description");
            case MANAGER -> System.out.println("Store manager, can communicate with customers");
            case CLIENT -> System.out.println("Store customer, can buy goods and enjoy discount");
            case ANONYMOUS -> System.out.println("Anonymous user, can buy goods or log in");
        }
    }

    public void logout() {
        authorizedUser = null;
        System.out.println("User logged out");
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getUrlStore() {
        return urlStore;
    }

    public void setUrlStore(String urlStore) {
        this.urlStore = urlStore;
    }

    public User[] getArrUsers() {
        return arrUsers;
    }

    public void setArrUsers(User[] arrUsers) {
        this.arrUsers = arrUsers;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public boolean isAuthorizedResul() {
        return authorizedResul;
    }

    public void setAuthorizedResul(boolean authorizedResul) {
        this.authorizedResul = authorizedResul;
    }
}