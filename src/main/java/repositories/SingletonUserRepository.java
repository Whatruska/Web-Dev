package repositories;

import entities.User;
import interfaces.UserRepository;

import java.time.LocalDate;
import java.util.*;

public class SingletonUserRepository implements UserRepository {
    private List<User> users;

    private static SingletonUserRepository ourInstance = new SingletonUserRepository();

    public static SingletonUserRepository getInstance() {
        return ourInstance;
    }

    private SingletonUserRepository() {
        users = new ArrayList<User>();
        save(new User("1", "12", LocalDate.of(2000,5,5)));
        save(new User("2", "12", LocalDate.of(2001,5,5)));
        save(new User("3", "12", LocalDate.of(2002,5,5)));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User findByUsername(String username) {
        for (User user : users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public boolean isContainUser(User user) {
        return users.contains(user);
    }
}
