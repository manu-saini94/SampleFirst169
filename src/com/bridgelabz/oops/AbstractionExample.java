package com.bridgelabz.oops;


import java.util.Scanner;

// abstraction: Hiding the implementation and only showing declarations
// Interface and Abstract class
// Interface : It is used for 100% abstraction
// abstract method : a method without any body.
// We cannot create an object of interface and it does not have a constructor
interface InterfaceA {

    int x = 0;

    void m1();

    int calculate(int a, int b);


    //from java-8 version , we can take default methods , static methods

    default void defaultMethod() {
        System.out.println("defaultMethod()");
        staticMethod();
        privateMethod();
    }

    static void staticMethod() {
        System.out.println("static method");
    }

    // From java-9 version , we can take private methods also in interface

    private void privateMethod() {
        System.out.println("private method");
    }

}

// It is mandatory to provide implementation for abstract methods of interface in implementation class
class ImplClass1 implements InterfaceA {

    static void staticMethod(){
        System.out.println("class static method");
    }
    @Override
    public void m1() {
        System.out.println("m1");
        InterfaceA.staticMethod();
    }

    @Override
    public int calculate(int a, int b) {
        System.out.println("sum");
        return a+b;
    }

    @Override
    public void defaultMethod() {
        System.out.println("default method in impl class");
    }
}

class ImplClass2 implements InterfaceA{

    ImplClass2(){
        super();
    }
    @Override
    public void m1() {

    }

    @Override
    public int calculate(int a, int b) {
        return a*b;
    }

    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod();
    }
}


public class AbstractionExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(args[0]);
        System.out.println(args[1]);
        InterfaceA.staticMethod();

        InterfaceA implClass1 = new ImplClass1();
        implClass1.defaultMethod();
        implClass1.m1();
        implClass1.calculate(1,3);
        ImplClass1.staticMethod();

        InterfaceA implClass2 = new ImplClass2();
        implClass2.calculate(3,5);
        implClass2.m1();
        implClass2.defaultMethod();

       InterfaceA obj1 = new ImplClass1();



    }
}
