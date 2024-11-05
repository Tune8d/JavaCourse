package com.tune8d.javacourse.ex.inheritance;

// inheritance is a powerful concept, thus one should seldom use it.
// (1 inheritance in a 15,000 lines of coding; there are alternatives)
// Members of a class are anything that is not static.

public class Zoo {

    public void feedAnimals(Animal[] animals){
        for(Animal animal: animals){
            animal.eat();
            animal.age();
        }
    }
}
