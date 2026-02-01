package Car_Rental;

import java.util.*;

public class Home {
    static ArrayList<Car> cars = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

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
            if (option <= 0 || option > 3) {
                System.out.println("In correct option choosen pls select from 1 to 3");
                System.out.println("");
            }
        } while (option <= 0 || option > 3);

        return option;
    }

    public double rentCost(Car car, int no_of_days) {
        double perDayCost = car.getPricePerDay();
        double insurance = car.getInsurancePerDay();
        double luxury_tax = car.getLuxury();

        double total_cost = no_of_days * (perDayCost + insurance) + luxury_tax;

        if (no_of_days == 0) {
            return (perDayCost * 600);
        } else {
            return total_cost;
        }

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

    public int rent_buy(ArrayList<Car> car, int option) {
        int length = car.size();

        String word = (option == 1) ? "Rent" : "Buy";
        int result;
        String car_id;
        do {
            System.out.printf("Select the car id you want to %s: ", word);
            car_id = scanner.nextLine();
            result = correctInt(car_id);
            if (result < 0) {
                System.out.println("Pls Enter a number:");
            } else if (result > length) {
                System.out.println("Wrong ID");
            }
        } while (result < 0 || result > length);
        return (Integer.parseInt(car_id) - 1);

    }

    public static void main(String[] args) {

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
        if (option == 1 || option == 2) {
            home.listCars(cars);
            int car_id = home.rent_buy(cars, option);
            if (option == 1) {
                int result;
                do {
                    System.out.print("How many days to rent for: ");
                    String days = scanner.nextLine();
                    result = home.correctInt(days);
                    if (result > 100) {
                        System.out.println("Can not rent more than 100 days");

                    } else if (result < 1) {
                        System.out.println("Incorrect number of days");

                    }
                } while (result < 1 || result > 100);
                double rent_cost = home.rentCost(cars.get(car_id), result);
                System.out.printf("Total Cost for rent = %.2f", rent_cost);

            } else {
                double rent_cost = home.rentCost(cars.get(car_id), 0);
                System.out.printf("Total Cost  = %.2f", rent_cost);

            }
        }

    }

    public void listCars(ArrayList<Car> car) {
        System.err.println(Home.getHeader());
        for (Car c : car) {
            System.err.println(c);
        }
    }

}
