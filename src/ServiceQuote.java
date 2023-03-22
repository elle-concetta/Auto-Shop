// Define a class named ServiceQuote
public class ServiceQuote {
    private int carAgeDiscount;
    private double laborCharges;
    private double partsCharges;

    public void setCarAgeDiscount(int year) {
        int age = 2023 - year;
        if (age >= 3 && age < 5) {
            carAgeDiscount = 5;
        } else if (age >= 5 && age < 10) {
            carAgeDiscount = 10;
        } else if (age >= 10) {
            carAgeDiscount = 20;
        } else {
            carAgeDiscount = 0;
        }
    }

    public void setLaborCharges(double laborCharges) {
        this.laborCharges = laborCharges;
    }

    public void setPartsCharges() {
        this.partsCharges = partsCharges;
    }

    public double totalCharges() {
        return laborCharges + partsCharges - (partsCharges * carAgeDiscount / 100);
    }

    public double salesTax() {
        return totalCharges() * 0.0875;
    }

    public double getCarAgeDiscount() {
        return carAgeDiscount;
    }

    public void setCarAgeDiscount() {
    }

    public void setLaborCharges() {
    }
}