package com.alamin;

public class Printer<T extends IceCream> {
    T thingsToPrint;
    public Printer(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    void printThings(){
        System.out.println(thingsToPrint);
    }

    void printIceCream(){
        thingsToPrint.printQuality();
    }
}
