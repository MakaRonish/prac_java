package Car_Rental;

import java.util.ArrayList;

public class Car {
    static ArrayList<Car> cars = new ArrayList<>();
    private static int idCounter = 1;
    private int id;
    private String name;
    private String brand;
    private double pricePerDay;
    private double insurancePerDay;
    private boolean isAvailable;
    private String type;
    private double luxuryTax;

    static {
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
    }

    public void setId() {
        this.id = idCounter;
        idCounter++;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setpricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setinsurancePerDay(double insurancePerDay) {
        this.insurancePerDay = insurancePerDay;
    }

    public void setisAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setLuxury(double luxuryTax) {
        this.luxuryTax = luxuryTax;
    }

    public double getLuxury() {
        return this.luxuryTax;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getInsurancePerDay() {
        return this.insurancePerDay;
    }

    public double getPricePerDay() {
        return this.pricePerDay;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return String.format(
                "%-3d | %-10s | %-12s | $%-12.2f | $%-9.2f | %-12s | %-8s",
                id,
                name,
                brand,
                pricePerDay,
                insurancePerDay,
                isAvailable ? "Yes" : "No",
                type);
    }

}
