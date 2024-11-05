package com.tune8d.javacourse.ex.inheritance;

// if inheritance and interface is mixed, it takes the form as the below
// public class 000 extends 000 implements 000, 000, 0000

public class Lion extends Animal implements Loggable, Printable {



    public void print(){
        System.out.println("printing...");
    }

    public String message(){
        return "something";
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating...");
    }
}
