package com.tune8d.javacourse.ex.interfaceEx;

import org.junit.Test;

import static org.junit.Assert.*;

public class PorscheTest {

    @Test
    public void shouldCloneStringArray(){
        String[] array = {"one", "two", "three"};
        String[] copiedArray = array.clone();
        assertSame(array,array);
        assertNotSame(array,copiedArray);

        for(String str : copiedArray){
            System.out.println(str);
        }

    }

    @Test
    public void shouldClonePorsche(){
        Porsche porsche = new Porsche("Marcus");
        Porsche peterPorsche = porsche.clone();
        // You can write Cloneable ~, but it's a marker interface.
        // If you want to call a method of a subclass, you should not name the class of the variable as the base or the interface.
        // you can wrap or name it as the subclass from the first place.
        assertNotSame(porsche, peterPorsche); // !=

        peterPorsche.sellTo("Peter");
        assertEquals("Porsche of Peter", peterPorsche.asString());
        assertEquals("Porsche of Marcus", porsche.asString());
    }

}