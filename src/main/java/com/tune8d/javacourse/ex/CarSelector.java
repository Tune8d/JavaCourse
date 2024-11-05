package com.tune8d.javacourse.ex;

//https://youtu.be/grEKMHGYyns?si=Hf8MVqCZv_X7-5fp&t=19038
public class CarSelector {
    public static void main(String[] args) throws Exception {
        CarService carService = new CarService();
        for(String arg : args){
            try {
                carService.process(arg);
            //}catch(RuntimeException e){
            }catch(Exception e){
                //e.printStackTrace();

            }finally{
                // Very important since it closes IO operations that is going to fail.
                System.out.println("I am still running");
            }
        }
    }

    private static boolean isValid(String argument){
        try{
            //CarState.isValid();
            CarState carstate = CarState.valueOf(argument);
            System.out.print("something");
            System.out.print("jkjk");
            System.out.print("jk");
        }catch(Exception e){
           return false;
        }
        return true;
    }

}
