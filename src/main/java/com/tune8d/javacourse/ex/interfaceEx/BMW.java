package com.tune8d.javacourse.ex.interfaceEx;

public class BMW implements Car, Loggable, Property, Asset {

    public void drive(){
        System.out.println("BMW driving...");
    }

    public int value(){
        return 80000;
    }

    public String owner(){
        return "Marcus";
    }


    @Override
    public String message() {
        return "I am the car of Tune8d";
    }
}
