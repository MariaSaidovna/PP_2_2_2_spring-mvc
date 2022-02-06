package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarServise;
import web.Service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") int count, Model model) {
        CarServise carServise = new CarServiseImpl();
        model.addAttribute("count", carServise.getCars(count));
        return "cars";

    }
}
