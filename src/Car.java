// Define a class named Car
class Car {
    // Define private instance variables for make, model, and year
    private String make;
    private String model;
    private int year;

    // Define public setter methods for make, model, and year
    public void setMake(String n) {
        this.make = n;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Define public getter methods for make, model, and year
    public String getMake() {
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear() {
    }
}