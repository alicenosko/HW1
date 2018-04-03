package com.example.androidcourse.transportation;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Porshe", TypeCarriage.FREIGHT, TypeFuel.GAS, 200, 2000);
        car.load(300);
        car.move();
        Airplane plane = new Airplane("Boing", TypeCarriage.PASSENGER, TypeFuel.PETROL, 600, 45, WingShape.ELEPTICAL);
        plane.load(60);
        plane.move();
        plane.fuel(TypeFuel.COAL);
        Ship ship = new Ship("Stadler", TypeCarriage.FREIGHT, TypeFuel.DIESEL, 500, 200);
        Train train = new Train("Huindai", TypeCarriage.FREIGHT, TypeFuel.COAL, 500, 200);
        ship.load(12);
        ship.fuel(TypeFuel.ELECTRICITY);
        ship.move();
        train.load(1200);
        train.fuel(TypeFuel.GAS);
        train.move();
    }
}
