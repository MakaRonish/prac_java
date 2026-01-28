package Car_Rental;

public class Luxury extends Car {
    private boolean leatherSeats;
    private boolean chauffeurService;
    private double luxuryTax;

    Luxury(String name, String brand, double pricePerDay, double insurancePerDay, boolean isAvailable,
            boolean leatherSeats, boolean chauffeurService, double luxuryTax) {
        setName(name);
        setId();
        setBrand(brand);
        setinsurancePerDay(insurancePerDay);
        setpricePerDay(pricePerDay);
        setisAvailable(isAvailable);
        this.leatherSeats = leatherSeats;
        this.chauffeurService = chauffeurService;
        this.luxuryTax = luxuryTax;
    }

}
