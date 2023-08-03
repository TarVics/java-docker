package ua.tarvic.javadocker.services;

import org.springframework.stereotype.Service;
import ua.tarvic.javadocker.models.Car;

import java.util.List;

@Service
public interface CarService {
    List<Car> findAll();

    Car findById(int id);

    Car save(Car car);

    Boolean deleteById(int id) ;

    List<Car> findByPower(int value);

    List<Car> findByProducer(String value);
}
