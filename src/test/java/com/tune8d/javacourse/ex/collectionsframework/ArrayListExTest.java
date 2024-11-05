package com.tune8d.javacourse.ex.collectionsframework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListExTest {

    private final int INITIAL_CAPACITY = 5;

    @Test
    public void shouldDemonstrateArrayList(){
        // A good architecture is the one that maximizes the number of decisions not made,
        // allowing those decisions to be deferred until they are absolutely necessary. (Robert C. Martin)
        // By naming Collection, there are decisions left to be taken.

        //                                            Use variables with syntax than constant!!
        List<String> elements = new ArrayList<>(INITIAL_CAPACITY);

        System.out.println("isEmpty(): " + elements.isEmpty());

        elements.add("A");
        elements.add("B");
        elements.add("A");
        elements.add("C");
        elements.add("E");
        elements.add("E");
        elements.add(0, "T"); // List variable
        elements.add(2, "S");
        //elements.remove(1); // very difficult since the index does not define the value itself.

        // use "equals()" to find the target element. -> 1st A is removed.
        elements.remove("A");

        System.out.println("size: " + elements.size());
        System.out.println("indexOf: " + elements.indexOf("A"));
        System.out.println("lastsIndexOf: " + elements.lastIndexOf("E"));

        elements.clear();
        System.out.println("isEmpty(): " + elements.isEmpty());
        System.out.println("elements " + elements);


        for (String str : elements){
            System.out.println(str);
        }
        System.out.println("elements: " + elements);
    }
}