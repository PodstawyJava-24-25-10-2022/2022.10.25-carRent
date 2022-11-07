package com.comarch.car.rent;

public class CarDB {
    Car[] cars = new Car[5];

    CarDB() {
        this.cars[0] = new Car("Audi", "A5", 300.00, "KR11");
        this.cars[1] = new Car("BMW", "5", 499.99, "KR22");
        this.cars[2] = new Car("Kia", "Ceed", 199.99, "KR33");
        this.cars[3] = new Car("Toyota", "Corolla", 249.99, "KR44");
        this.cars[4] = new Car("Mercedes", "C", 299.99, "KR55");
    }

    boolean rentCar(String plate) {
        for(Car car : cars) {
            if(car.plate.equals(plate) && !car.rent) {
                car.rent = true;
                return true;
            }
        }
        return false;
    }
}
