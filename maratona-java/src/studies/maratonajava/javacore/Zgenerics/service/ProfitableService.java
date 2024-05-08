package studies.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class ProfitableService<T> {
    private List<T> availableObjects;

    public ProfitableService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T SearchAvailableObjects() {
        System.out.println("Searching available objects...");
        T object = availableObjects.remove(0);
        System.out.println("Renting object: " + object);
        System.out.println("Objects available for rent:");
        System.out.println(availableObjects);
        return object;
    }

    public void returnRentedObject(T object) {
        System.out.println("Returning object: " + object);
        availableObjects.add(object);
        System.out.println("Objects available for rent:");
        System.out.println(availableObjects);
    }
}
