package ua.tarvic.javadocker.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.tarvic.javadocker.dao.CarDAO;
import ua.tarvic.javadocker.models.Car;

import java.util.List;

@Service("CarService.v1")
@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    public List<Car> findAll() {
        return carDAO.findAll();
    }

    public Car findById(int id) {
        return carDAO.findById(id).orElse(null);
    }

    public Car save(Car car) {
        return carDAO.save(car);
    }

    public Boolean deleteById(int id) {
        boolean exists = carDAO.existsById(id);
        if (exists) carDAO.deleteById(id);
        return exists;
    }

    public List<Car> findByPower(int value) {
        return carDAO.findCarsByPower(value);
    }

    public List<Car> findByProducer(String value) {
        return carDAO.findCarsByProducer(value);
    }
}
