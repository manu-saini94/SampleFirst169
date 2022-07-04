package com.bridgelabz.oops;

// Polymorphism => many forms
// Compile-Time Polymorphism => Overloading , static polymorphism, early-binding
// Run-Time Polymorphism=> Overriding , dynamic polymorphism, lazy-binding


// method signatures are same in overriding
// Return type matters in overriding
// Either the return types should be same or you can take covarient return types while overriding
// Covarient came in java 1.5V
class P {
    int x;

    int m1() {
        System.out.println("P class m1()");
        return new Integer(1);
    }

    Object m4() {
        System.out.println("P class m4()");
        return "ABC";
    }

    public static void m5() {
        System.out.println("static method of P");
    }

    // private methods cannot be inherited and hence cannot be overridden
    // static methods can be inherited but we cannot override (method hiding)
    // final methods cannot be inherited and hence cannot be overridden
    private void privateMethod(){

    }
}

class Q extends P {

    int y;

    void m2() {
        System.out.println("Q class m2()");
    }

    @Override
    int m1() {
        System.out.println("Q class m1()");
        return Integer.sum(1, 4);
    }

    @Override
    StringBuffer m4() {

        System.out.println("Q class m4()");
        return new StringBuffer();
    }


    public static void m5() {
        System.out.println("static method of Q");
    }

}


class Automobile{

}
class Bike extends Automobile{

}


class Test1 {

    void method1(Automobile obj){
        System.out.println("method1 Automobile");
    }

    void method1(Bike obj){
        System.out.println("method1 Bike");
    }
}

public class PolymorphismExample {

    // Constructor Overloading
    PolymorphismExample() {

    }

    PolymorphismExample(int x) {

    }

    PolymorphismExample(float x) {

    }

    //Overloading
    // methods having same name but different number of arguments or type of arguments.
    // Method signature (method name followed by parameters)
    // method signatures are different in overloading
    // In overloading , return type does not play a role. The return type can be same or different.

    void m1() {

    }

    int m1(int x) {
        return 0;
    }

    void m1(float x) {

    }


    public static void main(String[] args) {

        Q.m5();
        PolymorphismExample obj = new PolymorphismExample();
        obj.m1(1);
        obj.m1(3.0f);
        obj.m1();

        P.m5();
        P obj1 = new P();
        obj1.m1();
        System.out.println(obj1.x);
        obj1.m5();

        Q obj2 = new Q();
        obj2.m2();
        obj2.m4();
        System.out.println("static -----------");
        obj2.m5();
        Q.m5();
        System.out.println(obj2.y);
        obj2.m1();
        System.out.println(obj2.x);



        // Parent class reference can hold a child class object
        P obj3 = new Q();
        obj3.m1();
        obj3.m4();

        // Method hiding
        obj3.m5();
        System.out.println(obj3.x);


        //  Q obj4 = new P(); // Child class reference cannot hold a Parent class object

        System.out.println("**********************************");


        Automobile automobile = new Automobile();
        Bike bike = new Bike();
        Automobile object1 = new Bike();

        // Method resolution happens based on reference type and not run time object

        Test1 test1 = new Test1();
        test1.method1(automobile); // method1 Automobile
        test1.method1(bike); // method1 Bike
        test1.method1(object1); // method1 Automobile




    }
}
