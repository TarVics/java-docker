package ua.tarvic.javadocker.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

import ua.tarvic.javadocker.models.User;
import ua.tarvic.javadocker.dao.UserDAO;

@Service("UserService.v1")
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User findById(int id) {
        return userDAO.findById(id).orElse(null);
    }

    public User save(User user, File... files) {
        return userDAO.save(user);
    }

    public Boolean deleteById(int userId) {
        boolean exists = userDAO.existsById(userId);
        userDAO.deleteById(userId);
        return exists;
    }
}