package ua.tarvic.javadocker.services;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

import ua.tarvic.javadocker.models.User;

@Service
public interface UserService {
    List<User> findAll();
    User findById(int id);
    User save(User user, File... files);
    Boolean deleteById(int id);
}