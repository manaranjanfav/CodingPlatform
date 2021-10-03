package com.gb.codingplatform.Enums;

public enum ContestLevel {
    LOW,MEDIUM,HIGH;

    public String toString(){
        switch(this){
        case LOW :
            return "low";
        case MEDIUM :
            return "medium";
        case HIGH :
            return "high";
        }
        return null;
    }

    public static ContestLevel valueOfEnum(String value){
        if(value.equalsIgnoreCase(LOW.toString()))
            return ContestLevel.LOW;
        else if(value.equalsIgnoreCase(MEDIUM.toString()))
            return ContestLevel.MEDIUM;
        else if(value.equalsIgnoreCase(HIGH.toString()))
            return ContestLevel.HIGH;
        else
            return null;
    }
}
