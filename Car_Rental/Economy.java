package Car_Rental;

public class Economy extends Car {
    private int storageSpace;

    Economy(String name, String brand, double pricePerDay, double insurancePerDay, boolean isAvailable,
            int storageSpace) {
        setId();
        setName(name);
        setBrand(brand);
        setinsurancePerDay(insurancePerDay);
        setpricePerDay(pricePerDay);
        setisAvailable(isAvailable);
        this.storageSpace = storageSpace;

    }
}
