package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServise;
import web.Service.CarServiseImpl;


@Controller
public class CarController {

    private CarServise carServise = new CarServiseImpl();

    @GetMapping("/cars")
    public String cars(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("count", carServise.getCars(count));
        return "cars";

    }
}
