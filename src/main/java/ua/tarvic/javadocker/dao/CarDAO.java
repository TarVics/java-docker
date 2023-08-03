package ua.tarvic.javadocker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.tarvic.javadocker.models.Car;

import java.util.List;

public interface CarDAO extends JpaRepository<Car, Integer> {
    List<Car> findCarsByProducer(String producer);
    List<Car> findCarsByPower(int power);
}
