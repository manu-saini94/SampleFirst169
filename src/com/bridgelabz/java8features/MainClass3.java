package com.bridgelabz.java8features;


// Streams API => Used for doing some operations over a collection.
// We can filter, manipulate our collections using streams API.

// Predefined Functional interfaces => Consumer , Predicate , Function , Supplier

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass3 {

    public static void main(String[] args) {

        Consumer<Integer> consumer1 = (x) -> System.out.println(x);
        Predicate<Integer> predicate1 = (x) -> x>400 ? true:false;
        Function<Integer,Integer> function1 = (x) -> x*5;
        Supplier<Integer> supplier1 = ()-> 30;
        consumer1.accept(6);
        System.out.println(predicate1.test(7));
        System.out.println(function1.apply(9));
        System.out.println(supplier1.get());

        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(400);
        arrayList1.add(900);
        arrayList1.add(300);
        arrayList1.add(800);
        arrayList1.add(200);
        arrayList1.add(200);


//        arrayList1.add(null);
//        arrayList1.add(null);
        System.out.println("FILTER operation");
        List<Integer> arrayList2 = arrayList1.stream().filter(predicate1).collect(Collectors.toList());
        System.out.println(arrayList2);
        System.out.println(arrayList1);
        System.out.println("MAP operation");
        List<Integer> arrayList3 = arrayList1.stream().map(function1).collect(Collectors.toList());
        System.out.println(arrayList3);
        System.out.println(arrayList1);
        System.out.println("Combined MAP and filter operation");
        List<Integer> arrayList4 = arrayList1.stream().filter(x -> x>=300 ? true:false).map(x-> x*100).collect(Collectors.toList());
        System.out.println(arrayList4);
        System.out.println(arrayList1);
        arrayList1.stream()
                .filter(x -> x >= 300 ? true : false)
                .map(x -> x * 100).forEach(x-> System.out.println(x));

        // Concurrent Collections
        arrayList1.forEach(x-> System.out.println(x));

        int prod = arrayList1.stream().reduce(1,(x,y)-> x*y);
        System.out.println("Sum of list elements "+prod);

        System.out.println(arrayList1.stream().anyMatch(x -> x >= 500));
        System.out.println(arrayList1.stream().allMatch(x -> x >= 500));
        // Optional
    }
}
