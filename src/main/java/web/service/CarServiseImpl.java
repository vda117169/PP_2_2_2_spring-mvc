package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiseImpl implements CarService{
    public final CarsDAO carsDAO;

    public CarServiseImpl(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }


    @Override
    public List<Car> listCarsService() {
        List<Car> car =
                carsDAO.listCars();
        return car;
    }

    @Override
    public List<Car> countsCarsIdService(Integer count) {
        if (count == null || count >= 5) {
            return  carsDAO.listCars();
        } else {
        }return  carsDAO.countsCarsId(count);
    }

}
