package workshop1.CarExercises.Car;

import java.util.Arrays;

public class Car {
    private String engineSize;
    private double length;
    private int doorCount;
    private String make;
    private String model;
    private String colour;

    public String getEngineSize() {
        return engineSize;
    }

    public double getLength() {
        return length;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public void setDoorCount(int doorCount) throws Exception {
        if (doorCount < 0 || doorCount > 10) {
            throw new Exception("The number of doors is not between 0 and 5");
        }
        this.doorCount = doorCount;
    }

    public void setMake(String make) throws Exception {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Volkswagen", "Mercedes"};
        if (!(Arrays.asList(cars).contains(make))){
            throw new Exception("Make entered is an invalid make.");
        }
        this.make = make;
    }

    public void setEngineSize(String engineSize) throws Exception {
        String regexPattern = "^[0-9].[0-9][L]$";
        if (!(engineSize.matches(regexPattern))) {
            throw new Exception("Engine Size is not in correct format - Number.NumberL");
        }
        this.engineSize = engineSize;

    }

    public void setLength(double length) throws Exception {
        if (length <= 0 || length > 5){
            throw new Exception("The car length is not between 0 and 5");
        }
        this.length = length;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
