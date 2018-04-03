package com.example.androidcourse.transportation;

public class Train extends Vehicle implements refuelable {


    public Train(String model, TypeCarriage type, TypeFuel fuel, int maxSpeed, int maxCapacity) {
        super(model, type, fuel, maxSpeed, maxCapacity);
    }

    @Override
    public void move() {
        System.out.println("Driving on the rails!");
    }


    @Override
    public void fuel(TypeFuel typeFuel) {
        if (fuel == typeFuel) {
            System.out.println("Refueling completed successfully!");
        } else System.out.println("Wrong kind of fuel!");
    }
}
