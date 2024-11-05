package com.tune8d.javacourse.ex.interfaceEx;

// Cloneable is a type of marker interfaces. There is nothing in there.
public class Porsche implements Car, Cloneable{

    private String ownersName;

    public Porsche(String ownersName) {
        this.ownersName = ownersName;
    }

    public void sellTo(String ownersName) {
        this.ownersName = ownersName;
    }

    public String asString(){
        return "Porsche of " + ownersName;
    }

    public void drive(){
        System.out.println("Porsche driving...");
    }

    // creating a shallow copy: where an instance is cloned as-is. Can be modified if a change occurs in the reference.
    // deep copy: where an instance is cloned recursively. Cannot be affected even if a change occurs in the reference.
    @Override
    public Porsche clone(){
        try {
            return (Porsche)super.clone(); //
        } catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}
