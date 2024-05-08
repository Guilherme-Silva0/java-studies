package studies.maratonajava.javacore.Zgenerics.service;

import studies.maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableCarService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car SearchAvailableCars() {
        System.out.println("Searching available car...");
        Car car = availableCars.remove(0);
        System.out.println("Renting car: " + car);
        System.out.println("Cars available for rent:");
        System.out.println(availableCars);
        return car;
    }

    public void returnRentedCar(Car car) {
        System.out.println("Returning car: " + car);
        availableCars.add(car);
        System.out.println("Cars available for rent:");
        System.out.println(availableCars);
    }
}
