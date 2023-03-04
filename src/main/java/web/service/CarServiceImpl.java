package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.entity.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();
    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
