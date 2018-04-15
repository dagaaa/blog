package shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import shop.models.User;
import shop.repositories.UserRepository;

import java.util.HashMap;
import java.util.List;

@Service
@Primary
public class UserServiceStubImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    private HashMap<String, User> users = new HashMap<>();


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User edit(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.delete(id);
    }

    @Override
    public boolean authenticate(String username, String password) {
        int i = 0;
        for (User u : findAll()) {
            users.put(String.valueOf(i), u); // need to be changed when user created should be added to hashmap
            i++;
            System.out.println(i + "     " + u); // to chceck information
        }
        return users.get(password).getUsername().equals(username);
    }
}

