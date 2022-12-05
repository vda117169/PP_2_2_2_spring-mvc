package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public interface CarsDAO {
    List<Car> listCars();

    List<Car> countsCarsId(Integer count);

}
