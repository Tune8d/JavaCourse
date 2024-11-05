package com.tune8d.javacourse.ex;

public enum CarState {

    DRIVING, WAITING, PARKING;

    // Assuming that user input will be String,
    //public static CarState from(String state) throws Exception {
    public static CarState from(String state) {
        switch(state){
            case "DRIVING":
                return DRIVING;
            case "WAITING":
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                //throw new RuntimeException("unknown state:" + state); // for unexpected things at runtime
                try {
                    throw new Exception("unknown state:" + state);
                } catch (Exception e) {
                    throw new RuntimeException(e);

                }
        }
    }

}
