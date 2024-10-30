package meet.io.database.api;

import meet.io.database.entity.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class AutoAPI {
    public String insertCar(@RequestBody Car car) {
        System.out.println(car);
        return "Car Inserted";
    }
}
