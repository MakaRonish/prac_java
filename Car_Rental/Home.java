package Car_Rental;

import java.util.*;

public class Home {
    static ArrayList<Car> cars = Car.cars;
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
        Transaction t = new Transaction();
        Car c = new Car();

        Home home = new Home();
        int option = home.homeMenu();
        if (option == 1 || option == 2) {
            home.listCars(cars);
            int car_id = home.rent_buy(cars, option);
            double rent_cost;
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
                rent_cost = home.rentCost(cars.get(car_id), result);
                System.out.printf("Total Cost for rent = %.2f", rent_cost);

            } else {
                rent_cost = home.rentCost(cars.get(car_id), 0);
                System.out.printf("Total Cost  = %.2f", rent_cost);

            }
            System.out.println("");
            int result;
            do {

                System.out.println("Do you have account for payment?\n1. Yes\n2. No (create account)");
                String pay_option = scanner.nextLine();
                result = home.correctInt(pay_option);
                if (result < 1) {
                    System.out.println("Incorrect option");
                }
            } while (result < 1 || result > 2);
            int id;
            int account_index = -1;
            if (result == 1) {
                do {
                    System.out.print("Account number or (q) to cancel: ");
                    String ids = scanner.nextLine();
                    if (ids.equals("q")) {
                        id = -1;
                        break;

                    }
                    id = home.correctInt(ids);
                    if (id < 0) {
                        System.out.println("Incorrect Account number ");
                    } else {
                        account_index = t.accountFinder(id);
                        if (account_index == -1) {
                            System.out.println("Account not found");
                        }
                    }
                } while (id < 0 || account_index == -1);

            } else {
                System.out.println("Thanks for choosing to open account");
                long user_id = t.registerAccount();
                account_index = t.accountFinder(user_id);

            }
            if (account_index != -1) {

                Account customer_acc = Transaction.Bank.get(account_index);
                double cus_Balance = customer_acc.getBalancec();
                if (rent_cost < cus_Balance) {
                    System.out.printf("Transaction complete\n$%.2f taken from your account", rent_cost);
                    customer_acc.setBalance(cus_Balance - rent_cost);
                } else {
                    int opt = -1;
                    do {

                        System.out.println("Not enough balance\n1.Deposit\n2. Exit");
                        String opts = scanner.nextLine();

                        opt = home.correctInt(opts);
                        if (opt == 1) {
                            while (rent_cost > customer_acc.getBalancec()) {

                                System.out.println("Not enough balance\nAmount to deposit: ");
                                int amount = scanner.nextInt();
                                System.out.println("deposited ");
                                t.addBalance(amount, customer_acc.getId());
                            }
                            System.out.printf("Transaction complete\n$%f taken from your account", rent_cost);
                            customer_acc.setBalance(cus_Balance - rent_cost);

                        } else {
                            System.out.println("Thanks for using!!");
                        }

                    } while (opt < 1 || opt > 2);

                }
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
