package com.tune8d.javacourse.ex.interfaceEx;

public class CarService {

    public void drive() {

        // Class name should be utmost universal to incorporate the similar classes
        Car bmw = new BMW();
        //Car porsche = new Porsche();
        Car mercedes = new Mercedes();

        Car[] cars = {bmw, mercedes};
        for(Car car : cars) {
            car.drive();

        }
    }
}
