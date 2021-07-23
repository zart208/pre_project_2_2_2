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
    public String printCarInfo(@RequestParam(value = "count", required = false) String count, Model model) {
        List<Car> cars = null;
        int carsCount;
        if (count == null) {
            cars = dao.getCars();
        } else {
            try {
                carsCount = Integer.parseInt(count);
                if (carsCount > 0 && carsCount < 5) {
                    cars = dao.getCars().subList(0, carsCount);
                } else if (carsCount >= 5) {
                    cars = dao.getCars();
                }
            } catch (NumberFormatException e) {
                // ignored exception
            }
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
