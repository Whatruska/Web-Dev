package interfaces;
import entities.User;
import java.util.List;

public interface UserRepository {
    List<User> getUsers();
    User findByUsername(String username);
    void save(User user);
    boolean isContainUser(User user);
}
