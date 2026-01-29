package Car_Rental;

import java.util.*;

public class Home {
    public int homeMenu() {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        int option;

        do {
            System.out.println("Welcome to car rental\n" +
                    "Enter the option you want\n" +
                    "1. Rent a Car\n" +
                    "2. Buy a Car\n" +
                    "3. Quit");
            userChoice = scanner.nextLine();
            option = correctInt(userChoice);
        } while (option <= 0 || option > 3);

        return option;
    }

    public int correctInt(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static String getHeader() {
        return String.format(
                "%-3s | %-10s | %-14s | %-12s | %-10s | %-9s | %-10s | %-14s | %-12s | %-10s | %-10s | %-12s |",
                "ID",
                "Name",
                "Brand",
                "Price/Day",
                "Insurance",
                "Available",
                "Type",
                "Storage Space",
                "Leather Seat",
                "Chauffeur",
                "Luxury Tax",
                "No_of_Seats");
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Economy Corolla = new Economy(
                "Corolla", // name
                "Toyota", // brand
                50.0, // pricePerDay in $
                10.0, // insurancePerDay in $
                true, // isAvailable
                400);
        Luxury Mercedes = new Luxury(
                "S-Class", // name
                "Mercedes-Benz", // brand
                200.0, // pricePerDay in $
                50.0, // insurancePerDay in $
                true, // isAvailable
                true, // leatherSeats
                true, // chauffeurService
                30.0);
        Suv RAV4 = new Suv(
                "RAV4", // name
                "Toyota", // brand
                90.0, // pricePerDay in $
                15.0, // insurancePerDay in $
                true, // isAvailable
                5);
        // More Economy cars
        Economy Civic = new Economy("Civic", "Honda", 55.0, 12.0, true, 420);
        Economy Fiesta = new Economy("Fiesta", "Ford", 48.0, 10.0, true, 380);
        Economy Yaris = new Economy("Yaris", "Toyota", 45.0, 9.0, true, 350);

        // More Luxury cars
        Luxury BMW7 = new Luxury("7 Series", "BMW", 220.0, 55.0, true, true, true, 35.0);
        Luxury AudiA8 = new Luxury("A8", "Audi", 210.0, 50.0, true, true, false, 30.0);

        // More SUVs
        Suv Highlander = new Suv("Highlander", "Toyota", 95.0, 18.0, true, 7);
        Suv CRV = new Suv("CR-V", "Honda", 85.0, 15.0, true, 5);
        cars.add(Corolla);
        cars.add(Mercedes);
        cars.add(RAV4);

        cars.add(Civic);
        cars.add(Fiesta);
        cars.add(Yaris);
        cars.add(BMW7);
        cars.add(AudiA8);
        cars.add(Highlander);
        cars.add(CRV);
        Home home = new Home();
        int option = home.homeMenu();
        home.listCars(cars);

    }

    public void listCars(ArrayList<Car> car) {
        System.err.println(Home.getHeader());
        for (Car c : car) {
            System.err.println(c);
        }
    }

}
