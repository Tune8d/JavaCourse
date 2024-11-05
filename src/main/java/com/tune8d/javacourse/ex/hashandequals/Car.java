package com.tune8d.javacourse.ex.hashandequals;


// When you make a class, be sure to override equals and hashCode methods properly.
public class Car {
    private Engine engine;
    private int numberOfWheels;

    @Override
    public boolean equals(Object obj) {
        //Reflexivity
        if(this == obj){
            return true;
        }
        //Non-nullity
        if(obj == null){
            return false;
        }
        // Symmetry
        if(getClass() != obj.getClass()){
            return false;
        }

        Car other = (Car) obj;
        if(!engine.equals(other.engine)){
            return false;
        }
        return true;
    }

    public int hashCode(){
        int result = 1;
        result = 31 * result + engine.hashCode();
        return result;
    }
}
