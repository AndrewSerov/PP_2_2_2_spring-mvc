package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    static List<Car> cars = new ArrayList<>();

    public static void addCars() {
        cars.add(new Car("BMW", 15000, 1987));
        cars.add(new Car("BMW", 20000, 1997));
        cars.add(new Car("Mercedes", 15000, 2000));
        cars.add(new Car("Renault", 5000, 2005));
        cars.add(new Car("Jeep", 30000, 2008));
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        cars.clear();
        addCars();
        List<Car> modelCars = new ArrayList<>();
        if (count == null || count < 2 || count >= 5) {
            modelCars = cars;
        } else {
            for (int i = 0; i < count; i++) {
                modelCars.add(cars.get(i));
            }
        }
        model.addAttribute("carModel", modelCars);
        return "cars";
    }

}