package ua.ithilel.java;

public class User {

    private String  login;
    private String password;
    private UserStatus role = UserStatus.ANONYMOUS;

    public User() {
    }

    public User(String login, String password, UserStatus role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getRole() {
        return role;
    }

    public void setRole(UserStatus role) {
        this.role = role;
    }
}
