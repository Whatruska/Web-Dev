package entities;

import java.time.LocalDate;

public class User {
    private String username;
    private String password;
    private LocalDate birthday;

    public User(String username, String password, LocalDate birthday) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }

    public User() { }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
