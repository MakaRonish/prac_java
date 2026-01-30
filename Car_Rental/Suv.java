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
        setType("SUV");
        setLuxury(0);
        this.seatCapacity = seatCapacity;

    }

    @Override
    public String toString() {
        return String.format(
                "%-3d | %-10s | %-14s | $%-11.2f | $%-9.2f | %-9s | %-10s | %-14s | %-12s | %-10s | %-10d | %-12d |",
                getId(),
                getName(),
                getBrand(),
                getPricePerDay(),
                getInsurancePerDay(),
                getIsAvailable() ? "Yes" : "No",
                getType(),
                "N/a",
                "No",
                "No",
                0,
                seatCapacity);
    }
}
