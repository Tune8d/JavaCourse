package com.tune8d.javacourse.ex.inheritance;

public class Gorilla extends Animal {

    protected void age(String a){
        System.out.println("Gorilla is implementing the age by itself");
    }

    // methods should have a same level of visibility
    @Override
    public void eat() {
        System.out.println("Gorilla is eating...");
    }
}
