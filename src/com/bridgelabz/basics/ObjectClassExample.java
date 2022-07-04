package com.bridgelabz.basics;

import java.io.PrintStream;
import java.util.Objects;

class A{
    int z;
    void m1(){

    }
}
public class ObjectClassExample {

    int x;

    String y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectClassExample that = (ObjectClassExample) o;
        return x == that.x && y.equals(that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "ObjectClassExample{" +
                "x=" + x +
                ", y='" + y + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Object

       ObjectClassExample obj1 = new ObjectClassExample();

       obj1.x = 10;
       obj1.y = "ABC";
       ObjectClassExample obj2 = new ObjectClassExample();
//       HelloWorld obj2 = new HelloWorld();
        obj2.x = 10;
        obj2.y = "AC";
//        System.out.println(obj1.toString());
        System.out.println(obj1.getClass());
        System.out.println(obj1.equals(obj2));

        System.out.println(obj1);
        //String
    }
}
