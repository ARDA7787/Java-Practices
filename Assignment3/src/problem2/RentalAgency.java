package problem2;

import java.util.*;

class RentalAgency {
    private String name;
    private String state;
    private String city;
    private static final int CAPACITY = 10;
    private RentalCar[] cars;
    private int[] rented;
    private int carCount;

    public RentalAgency(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.cars = new RentalCar[CAPACITY];
        this.rented = new int[CAPACITY];
        Arrays.fill(rented, -1);
        this.carCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int totalRentalCars() {
        return carCount;
    }

    public boolean addRentalCar(RentalCar car) {
        if (carCount < CAPACITY) {
            cars[carCount] = car;
            carCount++;
            return true;
        }
        return false;
    }

    public RentalCar rentCar(int id, int days) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getId() == id && rented[i] == -1) {
                rented[i] = days;
                return cars[i];
            }
        }
        return null;
    }

    public double returnCar(int id, int days) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getId() == id && rented[i] != -1) {
                double cost = cars[i].getDailyCost() * days;
                rented[i] = -1; // Mark car as available again
                return cost;
            }
        }
        return -1; // Indicates car was not rented
    }

    public RentalCar[] carsInStock() {
        return Arrays.copyOf(cars, carCount);
    }

    public boolean removeRental(int id) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getId() == id && rented[i] == -1) {
                for (int j = i; j < carCount - 1; j++) {
                    cars[j] = cars[j + 1];
                    rented[j] = rented[j + 1];
                }
                cars[carCount - 1] = null;
                rented[carCount - 1] = -1;
                carCount--;
                return true;
            }
        }
        return false;
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (int i = 0; i < carCount; i++) {
            System.out.println(cars[i] + " | Rented: " + (rented[i] != -1 ? "Yes" : "No"));
        }
    }
}
