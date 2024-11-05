package com.tune8d.javacourse.ex;
//https://youtu.be/grEKMHGYyns?si=Aj34EwkZdkD_kDvy&t=25543
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy constructor
    Person(Person other) {
        this.name = other.name;
        this.address = other.address; // Copying reference
    }
}

public class ShallowDeepClone {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person original = new Person("John", address);

        // Creating a shallow copy
        Person shallowCopy = new Person(original);

        // Modify the address through the copy
        shallowCopy.address.city = "Los Angeles";

        // Check the address of the original object
        System.out.println(original.address.city); // Output: Los Angeles
    }
}

/*
* class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Deep copy constructor
    Address(Address other) {
        this.city = other.city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = new Address(address); // Creating a new Address instance for deep copy
    }

    // Deep copy constructor //
    public static Person newInstance(Person person){
        return new Address(person.address)
    }
    *
    * Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address); // Deep copy of Address
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person original = new Person("John", address);

        // Creating a deep copy
        Person deepCopy = new Person(original);

        // Modify the address through the copy
        deepCopy.address.city = "Los Angeles";

        // Check the address of the original object
        System.out.println(original.address.city); // Output: New York
    }
}

* */