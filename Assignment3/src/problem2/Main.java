package problem2;

public class Main {
    public static void main(String[] args) {
        RentalAgency enterprise = new RentalAgency("Enterprise", "Farmingdale", "NY");

        RentalCar car1 = new RentalCar("Toyota", "Camry", 2022, 50);
        RentalCar car2 = new RentalCar("Honda", "Civic", 2021, 75);
        RentalCar car3 = new RentalCar("BMW", "X5", 2020, 85);

        enterprise.addRentalCar(car1);
        enterprise.addRentalCar(car2);
        enterprise.addRentalCar(car3);

        System.out.println("Available Cars:");
        enterprise.displayInventory();

        System.out.println("\nRenting out car with ID 1 for 5 days...");
        RentalCar rentedCar = enterprise.rentCar(1, 5);
        if (rentedCar != null) {
            System.out.println("Car rented successfully: " + rentedCar);
        } else {
            System.out.println("Car not available for rent.");
        }

        System.out.println("\nCars after renting:");
        enterprise.displayInventory();

        System.out.println("\nReturning car with ID 1 after 5 days...");
        double amountDue = enterprise.returnCar(1, 5);
        if (amountDue != -1) {
            System.out.println("Total amount due: $" + amountDue);
        } else {
            System.out.println("Car not found in rentals.");
        }

        System.out.println("\nFinal Inventory:");
        enterprise.displayInventory();
    }
}
