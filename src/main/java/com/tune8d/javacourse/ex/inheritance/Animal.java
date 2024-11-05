package com.tune8d.javacourse.ex.inheritance;

// inheritance can take both concrete and abstract methods,
// so you need to implicitly define them and their class abstractness.
// And yeah, you cannot make an instance from an abstract class, just like an interface.
public abstract class Animal {
    // static methods cannot be overridden
    protected int age;

    public abstract void eat();
    /*
    public void eat() {
        System.out.println("animal eating");
    }
    */

    // can be accessible within the same package (== default) || sub-classes in a different package.
    // private is for the scope of the same class.
    protected void age() {
        System.out.println("age is calculated...");
    }
}
