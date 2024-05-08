package studies.maratonajava.javacore.Zgenerics.test;

import studies.maratonajava.javacore.Zgenerics.domain.Boat;
import studies.maratonajava.javacore.Zgenerics.service.ProfitableBoatService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        ProfitableBoatService profitableBoatService = new ProfitableBoatService();
        Boat boat = profitableBoatService.SearchAvailableBoats();
        System.out.println("Using the boat for a month...");
        profitableBoatService.returnRentedBoat(boat);
    }
}
