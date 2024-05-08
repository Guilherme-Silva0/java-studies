package studies.maratonajava.javacore.Zgenerics.test;

import studies.maratonajava.javacore.Zgenerics.domain.Boat;
import studies.maratonajava.javacore.Zgenerics.domain.Car;
import studies.maratonajava.javacore.Zgenerics.service.ProfitableService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));

        ProfitableService<Car> carProfitableService = new ProfitableService<>(availableCars);
        Car car = carProfitableService.SearchAvailableObjects();
        System.out.println("Using the car for a month...");
        carProfitableService.returnRentedObject(car);

        System.out.println("----------------");

        ProfitableService<Boat> boatProfitableService = new ProfitableService<>(availableBoats);
        Boat boat = boatProfitableService.SearchAvailableObjects();
        System.out.println("Using the boat for a month...");
        boatProfitableService.returnRentedObject(boat);
    }
}
