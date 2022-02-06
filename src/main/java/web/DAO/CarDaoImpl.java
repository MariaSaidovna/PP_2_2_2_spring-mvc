package web.DAO;

import web.Model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {

    List<Car> list = Arrays.asList(
            new Car("BMW", "BLUE", 1),
            new Car("Audi", "RED", 2),
            new Car("Mercedes", "PINK", 3),
            new Car("Lexus", "WHITE", 4),
            new Car("Toyota", "ORANGE", 5));

    public List<Car> getCars(int count) {

        return list.stream().limit(count).collect(Collectors.toList());
    }
}
