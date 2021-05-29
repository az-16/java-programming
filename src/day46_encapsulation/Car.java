package day46_encapsulation;

public class Car {

    //encapsulated/hidden instance variables
    private String model;
    private int year;
    private int mileage;

    //setter method for model (this method always void does not return anything)
    public void setModel(String carModel) {
        model = carModel;
    }
    //getter method for model
    public String getModel() {
        return model;
    }

    // setter for year

    public void setYear(int year) {
        year = year;
    }

    //getter for year

    public int getYear() {
        return year;
    }

    //getter for mileage
    public int getMileage() {
        return mileage; // this.mileage; also works fine
    }
    //setter for mileage
    //myCar.setMileage(27377)
    public void setMileage(int mileage) {
        this.mileage = mileage;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}



