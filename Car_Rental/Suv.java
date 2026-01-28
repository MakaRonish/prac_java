package Car_Rental;

public class Suv extends Car {
    int seatCapacity;

    Suv(String name, String brand, double pricePerDay, double insurancePerDay, boolean isAvailable,
            int seatCapacity) {
        setName(name);
        setId();
        setBrand(brand);
        setinsurancePerDay(insurancePerDay);
        setpricePerDay(pricePerDay);
        setisAvailable(isAvailable);
        this.seatCapacity = seatCapacity;

    }
}
