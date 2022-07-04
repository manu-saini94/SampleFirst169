package com.bridgelabz.generics;

public class GenericsExample {

    // Generics can only take non primitives
    public static void main(String[] args) {

        Integer[] intArr = {1,2,3,4,5};
        Double[] doubleArr = {1.0,4.6};
        Character[] characterArray = {'A','B'};

        toPrint(intArr);
        System.out.println();
        toPrint(doubleArr);
        System.out.println();
        toPrint(characterArray);

    }

    private static <T> void toPrint(T[] arr) {
        for (T x:arr) {
            System.out.println(x);
        }
    }

//    private static void toPrint(Character[] characterArray) {
//        for (Character x:characterArray) {
//            System.out.println(x);
//        }
//    }
//
//    private static void toPrint(Double[] doubleArr) {
//        for (Double x:doubleArr) {
//            System.out.println(x);
//        }
//    }
//
//    private static void toPrint(Integer[] intArr) {
//        for (Integer x:intArr) {
//            System.out.println(x);
//        }
//    }
}
