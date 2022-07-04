package com.bridgelabz.oops;


// Inheritence => Inheriting the properties of one class into another
// Using extends keyword
// Types of Inheritence
// Single
// Multilevel
// Hierarchial
// Multiple
// Hybrid
// IS-A RelationShip

class A {
    int x;
    int y;


    public A(){

    }
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void m1() {
        System.out.println("A m1()");
    }

}


class B extends A {
    int y;

    void m2() {

    }

    @Override
    void m1() {
        System.out.println("m1 of B");
    }
}

class C extends B {
    int z;

    void m3() {

    }
}

class D extends A{
    int w;

    void m4() {

    }
}

class F{
    void m1(){
        System.out.println("F m1()");
    }
}

// Diamond death
// Ambiguity
// Multiple and hybrid inheritence not supported through classes
//class E extends A,F{
//
//}


public class InheritenceExample {
    public static void main(String[] args) {

        A a1 = new A(1,5);

        A a = new A();
        a.m1();
        System.out.println(a.x);

        B b = new B();
        System.out.println(b.x);
        System.out.println(b.y);
        b.m1();
        b.m2();

        A obj2 = new B();
//        obj2.m2();
        System.out.println("----------------------");
        obj2.m1();


        System.out.println(obj2.x+"-"+ obj2.y);



        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);

        D d = new D();
        d.m4();
        d.m1();
        System.out.println(d.x);
        System.out.println(d.w);




    }
}

