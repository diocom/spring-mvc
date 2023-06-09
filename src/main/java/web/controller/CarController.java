package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carShow(@RequestParam(value = "count", defaultValue = "5") int visibleCars, Model model)  {
        List<Car> carShowed = carService.carQty(visibleCars);
        model.addAttribute("carShowed", carShowed);
        return "cars";
    }
}
