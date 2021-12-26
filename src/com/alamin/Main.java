package com.alamin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(25);
        integerPrinter.printThings();
        //Without Extends
        /*Printer<String> printer = new Printer<>("Name");
        printer.printThings();*/

        Printer<Igloo> printer = new Printer<>(new Igloo("Igloo Vanila"));
        printer.printIceCream();

        shout("hello");
        shout(2);
        shout(5.5);

        String info = anotherShoutAndPower("Hi",10);
        System.out.println("Shout : "+info);

        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(3);
        data.add(5);
        printList(data);

    }

    public static <T> void shout(T shout){
        System.out.println(shout);
    }

    public static <T,V> T anotherShoutAndPower(T shout,V power){
        System.out.println("Power : "+power);
        return shout;
    }

    public static void printList(List<?> dataList){
        dataList.forEach(System.out::println);
    }
}
