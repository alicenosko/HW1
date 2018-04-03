package com.example.androidcourse.transportation;

public class Ship extends Vehicle implements refuelable {

    public Ship(String model, TypeCarriage type, TypeFuel fuel, int maxSpeed, int maxCapacity) {
        super(model, type, fuel, maxSpeed, maxCapacity);
    }

    @Override
    public void move() {
        System.out.println("Swimming!");
    }


    @Override
    public void fuel(TypeFuel typeFuel) {
        if (fuel == typeFuel) {
            System.out.println("Refueling completed successfully!");
        } else System.out.println("Wrong kind of fuel!");
    }
}
