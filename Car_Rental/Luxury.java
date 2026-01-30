package Car_Rental;

public class Luxury extends Car {
    private boolean leatherSeats;
    private boolean chauffeurService;

    Luxury(String name, String brand, double pricePerDay, double insurancePerDay, boolean isAvailable,
            boolean leatherSeats, boolean chauffeurService, double luxuryTax) {
        setName(name);
        setId();
        setBrand(brand);
        setinsurancePerDay(insurancePerDay);
        setpricePerDay(pricePerDay);
        setisAvailable(isAvailable);
        setType("Luxury");
        setLuxury(luxuryTax);
        this.leatherSeats = leatherSeats;
        this.chauffeurService = chauffeurService;
    }

    // @Override
    // public String toString() {
    // return String.format(
    // "%-3d | %-10s | %-12s | $%-12.2f | $%-9.2f | %-12s | %-8s | %-8s | %-8s |
    // %-8f | ",
    // getId(),
    // getName(),
    // getBrand(),
    // getPricePerDay(),
    // getInsurancePerDay(),
    // getIsAvailable() ? "Yes" : "No",
    // getType(),
    // leatherSeats ? "Yes" : "No",
    // chauffeurService ? "Yes" : "No",
    // luxuryTax);
    // }

    @Override
    public String toString() {
        return String.format(
                "%-3d | %-10s | %-14s | $%-11.2f | $%-9.2f | %-9s | %-10s | %-14s | %-12s | %-10s | %-10f | %-12s |",
                getId(),
                getName(),
                getBrand(),
                getPricePerDay(),
                getInsurancePerDay(),
                getIsAvailable() ? "Yes" : "No",
                getType(),
                "N/a",
                leatherSeats ? "Yes" : "No",
                chauffeurService ? "Yes" : "No",
                getLuxury(),
                "N/A");
    }

}
