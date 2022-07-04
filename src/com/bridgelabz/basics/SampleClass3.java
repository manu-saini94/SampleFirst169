package com.bridgelabz.basics;

import com.bridgelabz.sample.MainClass5;
import com.sun.tools.javac.Main;

public class SampleClass3 extends MainClass5 {


    public static void main(String[] args) {
        MainClass5 obj = new MainClass5();
        System.out.println(obj.instVar);
        SampleClass3 obj2 = new SampleClass3();

//        obj2.m3(1,5);
        System.out.println(obj2.stringInst);
    }
}
