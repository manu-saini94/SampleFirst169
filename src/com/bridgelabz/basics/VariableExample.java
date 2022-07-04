package com.bridgelabz.basics;


// Data types
// Primitive => byte,short,int,long,float,double,char,boolean
// Non-Primitive => Arrays,Class,Interface,Enum

//Types of variables
// local Variable
// Static Variable
// instance Variable
public class VariableExample {

    // Static variables
    // Static variables are Class level variables.
    // These variables will get the memory when class is loading
    // It is not mandatory for me to initialize static variables.
    // It is declared within a class and outside any of the methods
    // If we are not initializing static variable then , JVM will initialize by default value.
    // The static variable will be shared across the objects, thats why if i change the value of static variable anywhere it will change for the whole class
    // Can be accessed directly anywhere within the class.
    // Can be accessed through class name outside of the class.


    // meaning full names (variables => nouns , methods => verb)
    // Naming Convention => Classes,Interfaces,Enums => (Pascal case => First letter upper case and any other word then again first letter upper case)
    // Eg:-   EmployeeSalaryCalculate,  Student
    // => Variables,methods => (Camel case => employeeName, salaryCalculator(), salary )
    // => Constants => (Upper-case => WAGE_PER_HOUR)
    // javac
    // default constructor is created by compiler and compiler compiles it
    // JVM executes


   VariableExample(){

   }

    static int staticVar = 420;

    static long staticVar2 = 360;

    static boolean staticVar3 = true;

    // Instance Variables
    // Instance variables are Object level variables.
    // These variables will get the memory when Object is created
    // It is not mandatory for me to initialize instance variables.
    // It is declared within a class and outside any of the methods
    // If we are not initializing instance variable then , JVM will initialize by default value.
    // The instance variables will be different for different objects, thats why if i change the value of instance variable for a particular object it won't effect another object
    // Can be accessed through object anywhere within the class.

     int instanceVar = 30;

     long instanceVar2 = 40;

     boolean instanceVar3 = true ;

    static void m1() {
        staticVar2 = 720;
        int x = 0;
        float y = 7.5F;

        System.out.println(x);
        System.out.println(y);
        System.out.println("m1 :"+staticVar+"----" + staticVar2 + " ---- " + staticVar3);
    }


    // Local Variables
    // Can be accessed within a block or within a method in which it is declared.
    // It is mandatory for me to initialize the local variables.
    // If we are taking some parameter to a method, then those are local variables of that method.


    static void m2(int i, double v) {
        // i and v are local variables to m2()
        staticVar = 786;
        System.out.println(i);
        System.out.println(v);
        System.out.println("m2 :"+staticVar+"----" + staticVar2 + " ---- " + staticVar3);
//      System.out.println(b);

    }

    void m3(){
        System.out.println("m3");
    }

    public static void main(String[] args) {
        // concatenation => string with variable using + operator
        System.out.println("start main:"+staticVar+ "----" + staticVar2 + " ---- " + staticVar3 );
        // Right part
        // How to create an object => new keyword along with constructor call
        // Constructor => It is a special method having same name as class name
        // new keyword along with constructor is used for creating the object and initializing

        // Left part is Non-primitve data type along with a reference(variable) name
        int var = 2;

        VariableExample obj1 = new VariableExample();
        System.out.println("instance var start main "+ obj1.instanceVar +"----"+ obj1.instanceVar2 +"----"+ obj1.instanceVar3);

        m1();
        m2(2, 4.5);
        System.out.println("middle main:"+staticVar+"----" + staticVar2 + " ---- " + staticVar3);
//      System.out.println(i);
        //byte short int long => integer values
        byte b = 100;  // 1B => -128 to 127 // 0
        short s = 2; // 2B // 0
        int x = 0;  // 4B // 0
        long l = 23; // 8B // 0
        float y = 10.5F; // 4B  // 0.0F
        double d = 20.699893; //8B // 0.0
        char c = 'A'; // 2B // '\u0000' // ASCII value
        // 8 bits and 16 bits // 2 bytes

        boolean val = true; // 1bit // false // 0 to 1

        System.out.println(b);
        System.out.println(s);
        System.out.println(x);
        System.out.println(l);
        System.out.println(y);
        System.out.println(d);
        System.out.println(c);
        System.out.println(val);
        staticVar3 = false;
        System.out.println("end:"+staticVar+"----" + staticVar2 + " ---- " + staticVar3);



    }


}
