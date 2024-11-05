package com.tune8d.javacourse.ex.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals(){
        Zoo zoo = new Zoo();
        // Polymorphism is a concept where objects of different classes are allowed to be treated as intstances of a common superclass.
        Animal[] animals = {new Dog(), new Gorilla(), new Lion(), new Tiger()};
        zoo.feedAnimals(animals);
    }
}