package com.alamin;

public class Polar extends IceCream{
    public String iceCreamName;
    public Polar(String iceCreamName){
        super("Average");
        this.iceCreamName = iceCreamName;
    }

    public void printIceCream(){
        System.out.println(iceCreamName);
    }
}
