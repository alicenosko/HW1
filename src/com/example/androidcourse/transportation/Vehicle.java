package com.example.androidcourse.transportation;

public abstract class Vehicle implements loading {
    protected String model;
    protected TypeCarriage type;
    protected TypeFuel fuel;
    protected int speed;
    protected int weightCarriage;
    protected int seatPlaces;

    public Vehicle(String model, TypeCarriage type, TypeFuel fuel, int maxSpeed, int maxCapacity) {
        this.model = model;
        this.type = type;
        this.speed = maxSpeed;
        if (type == TypeCarriage.FREIGHT) {
            this.weightCarriage = maxCapacity;
        } else {
            this.seatPlaces = maxCapacity;
        }
    }

    public abstract void move();

    @Override
    public void load(int capacity) {
        if (type == TypeCarriage.FREIGHT) {
            if (this.weightCarriage >= capacity) {
                System.out.println("Loading completed successfully!");
            } else System.out.println("Loading is not possible!");
        } else {
            if (this.seatPlaces >= capacity) {
                System.out.println("Loading completed successfully!");
            } else System.out.println("Loading is not possible!");

        }
    }

}
