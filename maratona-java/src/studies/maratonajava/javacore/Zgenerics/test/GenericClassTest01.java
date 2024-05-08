package studies.maratonajava.javacore.Zgenerics.test;

import studies.maratonajava.javacore.Zgenerics.domain.Car;
import studies.maratonajava.javacore.Zgenerics.service.ProfitableCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        ProfitableCarService profitableCarService = new ProfitableCarService();
        Car car = profitableCarService.SearchAvailableCars();
        System.out.println("Using the car for a month...");
        profitableCarService.returnRentedCar(car);
    }
}
