package com.bridgelabz.basics;


// JDK = > Java Development Kit
// JDK => JRE, compiler , debugger ,javadoc etc....
// JRE => Java Runtime Environment
// JRE => JVM (Java Virtual Machine) .....

// .java file (source file)
// compiler will take this .java file and compile the file and converts it into .class file
// .class file will have the byte code
// byte code is given to JVM which interprets this code into machine readable form and executes the code

// Java is Platform independent => same .class file are fed to platform specific JVMs


// Durgasoft =>  only for JVM Architecture
// Java related topics => Javatpoint   ,  for examples => Geeksforgeeks
// stackoverflow for error.
// JVM Architecture

// .java - > compile -> .class file(byte code)

// .class file - > class-loader(loading, linking,initialzation) - >
// Loading -> bootstrap CL, application CL , extention CL - byte code load happens here
// Linking -> Verify , Prepare , Resolve
// Initialization ->

// JVM - Memory

//Method Area , Heap Area , Stack Area, PC Registers , Native Method Stack

// Method Area -> class level info of .class file, static part (variables)
// Heap Area -> Object level - instance part
// Stack Area ->  stack frames ,for each Thread
// PC Registers - > PC register for each thread - > address of next instructions to be executed

// Execution Engine
// Interpreter , JIT Compiler - Profiler , GC -------> Uses -> JNI (Java Native Interface)
// Machine level code is generated . Native Method Libraries


import com.bridgelabz.oops.Car1;


// Classes and its objects
public class HelloWorld {

    int x;
    int y;
    int z;

    HelloWorld() {

    }

    HelloWorld(int x,int y){
        this();
       this.x = x;
       this.y = y;
    }

    HelloWorld(int x,int y,int z){
        this(x, y);
        this.z = z;
    }

    // data types and variables
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld(1,2,3);
        System.out.println("Hello World");
//        Dog dog = new Dog();
//        System.out.println(dog.breed);
        Car1 car = new Car1();
        car.speeding();
    }
}
