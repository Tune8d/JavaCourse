package com.tune8d.javacourse.ex;

public class CarService {
    public CarState process(String args) throws Exception {
        CarState value = CarState.from(args);
        return value;
    }

    /*
    public static void main(String[] args) {
       for (CarState state : CarState.values()) {
           System.out.println(state);
       }

        try {
            CarState test2 = CarState.from("flying");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //System.out.println(CarState.valueOf("bmw"));
    }
    */
}
