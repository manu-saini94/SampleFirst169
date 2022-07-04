package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Abstract class is used for 0-100% abstraction
// We cannot create an object of abstract class.
// Why Abstract class has a constructor?
abstract class Parent1{

    int x;

    static int y;

    abstract void m1();

    abstract void m2();


    void m3(){

    }

    static void m4(){

    }

}


abstract class ImplementationClass1 extends Parent1{



    @Override
    void m1() {

    }

}

class ImplementationClass2 extends ImplementationClass1{

    @Override
    void m2() {

    }

}




public class AbstractionExample2 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("ABC");
        list.add("ZEF");
        list.add("BCD");
        list.add("CBD");


        System.out.println(list);

        Comparator<String> obj = new ComparatorSample();
        list.sort(obj);
        System.out.println(list);

        Parent1 obj1 = new ImplementationClass2();
        obj1.m3();
        obj1.m2();
        obj1.m1();
        obj1.m4();
        System.out.println(obj1.x);
        System.out.println(obj1.y);
    }
}
