package com.bridgelabz.java8features;

public class MainClass {


    // Java-8 features =>
    // static and default methods in interface
    // Functional interface
    // Lambda expressions
    // Method Reference
    // Streams API ........................

    //Functional Interface => When an interface is having only one abstract method, it is called functional interface

    @FunctionalInterface
    interface A{

        // Single Abstract method
        void m1();

        static void m2(){

        }
        default void m3(){

        }

    }

    public static void main(String[] args) {

    }
}
