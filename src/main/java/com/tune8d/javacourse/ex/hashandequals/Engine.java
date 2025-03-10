package com.tune8d.javacourse.ex.hashandequals;

public class Engine {

    private long type;
    private String optionalField;

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Engine other = (Engine)obj;
        if(type != other.type){
            return false;
        }
        if(optionalField == null){
            if(other.optionalField != null){
                return false;
            }
        }else if(!optionalField.equals(other.optionalField)){
            return false;
        }
        return true;
    }

    public int hashCode(){
        int result = 1;
        result = 31 * result + (int)(type ^ (type >>> 32));
        return 31 * result + (optionalField != null ? optionalField.hashCode() : 0);
    }
}
