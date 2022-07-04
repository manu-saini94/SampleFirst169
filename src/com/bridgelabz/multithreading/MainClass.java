package com.bridgelabz.multithreading;

import java.util.Hashtable;

public class MainClass {


    public static void main(String[] args) {


        StringBuffer stringBuffer = new StringBuffer("MNO");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append("ABC");
        stringBuffer.append("BCD");
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer);
        String str = "ABC" + "ACB";
        System.out.println(str);


        // Priority
        // main thread
        System.out.println("main");
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        // Two Threads => main thread  ,  t thread
        t.start();
        System.out.println("after thread start in main");
        for (int i = 0; i <= 50; i++) {
            System.out.println("main => " + i);
        }


        // If there is a method which is synchronized , then that method can't be accessed simultaneously by two threads
    }

}
