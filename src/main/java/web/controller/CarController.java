package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiseImpl;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    public final CarServiseImpl carServiseImp;

    public CarController(CarServiseImpl carServiseImp) {
        this.carServiseImp = carServiseImp;

    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = carServiseImp.countsCarsIdService(count);
        model.addAttribute("cars",cars);
        return "cars";
    }

}
