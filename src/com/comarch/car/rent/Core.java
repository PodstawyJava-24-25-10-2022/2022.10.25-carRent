package com.comarch.car.rent;

public class Core {
    void start() {
        CarDB baza = new CarDB();
        GUI gui = new GUI();
        boolean isWorking = true;
        do {
            switch (gui.showMenuAndReadChoose()) {
                case "1":
                    gui.showCars(baza.cars);
                    break;
                case "2":
                    gui.showRentResult(baza.rentCar(gui.readPlate()));
                    break;
                case "3":
                    //System.exit(0);
                    isWorking = false;
                    break;
                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        } while(isWorking);
    }
}
