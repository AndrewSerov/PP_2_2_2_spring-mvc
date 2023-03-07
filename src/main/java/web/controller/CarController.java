package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final  CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        if (count == null || count < 2 || count >= 5) {
            model.addAttribute("carModel", carServiceImpl.getCars(5));
        } else {
            model.addAttribute("carModel", carServiceImpl.getCars(count));
        }
        return "cars";
    }

}