package academy.learnprogramming;

import java.util.Locale;

public class Car {

    // state of the car components, which we define as fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // create a method & allow the method update the model
    // update the model using a method instead of trying to access it directly

//      Setters
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("cayenne") || validModel.equals("tiguan")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

//      Getters
    public String getModel() {
        return this.model;
    }
}