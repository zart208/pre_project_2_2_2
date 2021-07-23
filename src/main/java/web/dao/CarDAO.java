package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CARS_COUNT;
    private List<Car> cars;

    public CarDAO() {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Vaz 2106", 160, "White"));
        cars.add(new Car(++CARS_COUNT, "Mazda 6", 260, "Red"));
        cars.add(new Car(++CARS_COUNT, "VW Golf", 240, "Blue"));
        cars.add(new Car(++CARS_COUNT, "Toyota Camry", 250, "Black"));
        cars.add(new Car(++CARS_COUNT, "Lada Kalina", 0, "Yellow"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
