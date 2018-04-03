package com.example.androidcourse.transportation;

public class Airplane extends Vehicle implements refuelable {
    WingShape wingShape;

    public Airplane(String model, TypeCarriage type, TypeFuel fuel, int maxSpeed, int maxCapacity, WingShape wingShape) {
        super(model, type, fuel, maxSpeed, maxCapacity);
        this.wingShape = wingShape;
    }

     @Override
    public void move() {
        System.out.println("Flying!");
    }

    @Override
    public void fuel(TypeFuel typeFuel) {
        if (fuel == typeFuel) {
            System.out.println("Refueling completed successfully!");
        } else System.out.println("Wrong kind of fuel!");
    }
}
