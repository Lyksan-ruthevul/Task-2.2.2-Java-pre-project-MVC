package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "Lada", "Red"));
        carList.add(new Car(2, "BMW", "White"));
        carList.add(new Car(3, "Toyota", "Yellow"));
        carList.add(new Car(4, "MB", "Black"));
        carList.add(new Car(5, "Volvo", "Blue"));
    }

    @Override
    public List<Car> getList() {
        return carList;
    }
}
