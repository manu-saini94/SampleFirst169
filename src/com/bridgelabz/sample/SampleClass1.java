package com.bridgelabz.sample;

import com.bridgelabz.basics.AccessSpecifiersExample;

public class SampleClass1 extends AccessSpecifiersExample{

    public static void main(String[] args) {

        double x = Math.sqrt(Math.pow(2,4));
        System.out.println(x);

        // default members cannot be accessed outside the package
        AccessSpecifiersExample obj1 = new AccessSpecifiersExample();
//        System.out.println(obj1.a);
//        System.out.println(AccessSpecifiersExample.b);
//        obj1.m1();
//        AccessSpecifiersExample.m2();

        System.out.println(obj1.e);
        System.out.println(AccessSpecifiersExample.f);
        obj1.m5();
        AccessSpecifiersExample.m6();

        // protected members can be accessed outside the package only through inheritence
        SampleClass1 sampleClass1 = new SampleClass1();
        System.out.println(sampleClass1.g);
        System.out.println(AccessSpecifiersExample.h);
        sampleClass1.m7();
        AccessSpecifiersExample.m8();


        MainClass5 obj2 = new MainClass5();
        obj2.m3(1,5);
        System.out.println(obj2.stringInst);

        System.out.println(MainClass5.list5);
        MainClass5.m1(obj2);





    }
}
