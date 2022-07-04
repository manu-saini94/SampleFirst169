package com.bridgelabz.basics;

public class SampleClass2 {

    public static void main(String[] args) {
        VariableExample.m1();
        System.out.println(VariableExample.staticVar);
        System.out.println(VariableExample.staticVar2);
        System.out.println(VariableExample.staticVar3);

        VariableExample variableExample = new VariableExample();

        System.out.println(variableExample.instanceVar);
        System.out.println(variableExample.instanceVar2);
        System.out.println(variableExample.instanceVar3);
        variableExample.m3();


        // ***************************************************

        AccessSpecifiersExample obj1 = new AccessSpecifiersExample();
        System.out.println(obj1.a);
        System.out.println(AccessSpecifiersExample.b);
        obj1.m1();
        AccessSpecifiersExample.m2();

        // private members cannot be accessed outside the class.
//        System.out.println(obj1.c);
//        System.out.println(d);
//        obj1.m3();
//        m4();

        System.out.println(obj1.e);
        System.out.println(AccessSpecifiersExample.f);
        obj1.m5();
        AccessSpecifiersExample.m6();

        System.out.println(obj1.g);
        System.out.println(AccessSpecifiersExample.h);
        obj1.m7();
        AccessSpecifiersExample.m8();

    }

}
