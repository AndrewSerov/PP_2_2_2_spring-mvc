package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;


public class CarDaoImpl implements CarDao {

    static List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 15000, 1987));
        cars.add(new Car("BMW", 20000, 1997));
        cars.add(new Car("Mercedes", 15000, 2000));
        cars.add(new Car("Renault", 5000, 2005));
        cars.add(new Car("Jeep", 30000, 2008));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
