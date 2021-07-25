package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Controller
public class CarsController {

    private final CarDAO dao;

    @Autowired
    public CarsController(CarDAO dao) {
        this.dao = dao;
    }

    @GetMapping("/cars")
    public String printCarInfo(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = (count == null || count >= 5 ) ? dao.getCars() : dao.getCars().subList(0, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
