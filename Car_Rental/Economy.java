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
        setType("Economy");
        setLuxury(0);
        this.storageSpace = storageSpace;

    }

    @Override
    public String toString() {
        return String.format(
                "%-3d | %-10s | %-14s | $%-11.2f | $%-9.2f | %-9s | %-10s | %-14d | %-12s | %-10s | %-10d | %-12s |",
                getId(),
                getName(),
                getBrand(),
                getPricePerDay(),
                getInsurancePerDay(),
                getIsAvailable() ? "Yes" : "No",
                getType(),
                storageSpace,
                "No",
                "No",
                0,
                "N/A");
    }
}
