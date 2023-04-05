package web.service;


import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> car;
    {
        car = new ArrayList<>();
        car.add(new Car(1, "model1", 1));
        car.add(new Car(2, "model2", 2));
        car.add(new Car(3, "model3", 3));
        car.add(new Car(4, "model4", 4));
        car.add(new Car(5, "model5", 5));
    }
    public List<Car> carQty(int qty) {
        if(qty > 0 && qty <= car.size()) {
            return car.subList(0, qty);
        }
        return car;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "car=" + car +
                '}';
    }
}
