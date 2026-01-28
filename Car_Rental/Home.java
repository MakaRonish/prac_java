package Car_Rental;

import java.util.*;

public class Home {
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

        cars.add(Corolla);
        cars.add(Mercedes);
        cars.add(RAV4);

        for (Car car : cars) {
            System.err.println(car.getName());

        }
    }

    public void homeMenu() {
        Scanner scanner = new Scanner(System.in);

    }

}
