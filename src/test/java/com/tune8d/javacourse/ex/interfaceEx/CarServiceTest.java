package com.tune8d.javacourse.ex.interfaceEx;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateInterface(){
        CarService carService = new CarService();
        carService.drive();
    }

}