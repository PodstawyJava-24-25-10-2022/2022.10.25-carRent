package com.comarch.car.rent;

import java.util.Scanner;

public class GUI {

    String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return new Scanner(System.in).nextLine();
    }

    void showCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(car.brand + " " +
                    car.model + " Cena: " + car.price +
                    " Nr rejestracyjny: " + car.plate +
                    " Dostepny: " + (car.rent ? "Nie" : "Tak"));
        }
    }

    String readPlate() {
        System.out.println("Podaj rejestracje:");
        return new Scanner(System.in).nextLine();
    }

    void showRentResult(boolean result) {
        if(result) {
            System.out.println("Rent success !!");
        } else {
            System.out.println("Rent error !!");
        }
    }
}
