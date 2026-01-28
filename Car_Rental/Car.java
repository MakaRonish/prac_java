package Car_Rental;

public class Car {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String brand;
    private double pricePerDay;
    private double insurancePerDay;
    private boolean isAvailable;

    public void setId() {
        this.id = idCounter;
        idCounter++;
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

}
