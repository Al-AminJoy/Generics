package com.alamin;

public class Igloo extends IceCream{
    public String iceCreamName;
    public Igloo(String iceCreamName){
        super("Good");
        this.iceCreamName = iceCreamName;
    }

    public void printIceCream(){
        System.out.println(iceCreamName);
    }
}
