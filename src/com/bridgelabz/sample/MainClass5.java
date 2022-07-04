package com.bridgelabz.sample;

import java.util.*;

// compilation => byte code =>.class file(loaded method area) => JVM(interpreter)
// Machine readable code executes

// static      non-static/instance
// Class =>    Object



public class MainClass5  {


    static int staticVar;

    static String stringStatic;

    static List<String> list5;


   public int instVar;

    protected String stringInst;

    List<Integer> list6;



    void m3(int x, int y){

        System.out.println("inside m3()");
        System.out.println(staticVar);
        System.out.println(stringStatic);
        System.out.println(list5);
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        System.out.println(instVar);
        System.out.println(stringInst);
        System.out.println(list6);
        m2();

    }

    void m2(){

        System.out.println("inside m2()");  // toString() of object
        System.out.println(staticVar); // 0
        System.out.println(stringStatic);
        System.out.println(list5);
        staticVar = 10;
        stringStatic = "KLM";
        list5 = new ArrayList<>();
        list5.add("AAAAAAAA");
        list5.add("BBBBBBBB");
        System.out.println(staticVar);
        System.out.println(stringStatic);
        System.out.println(list5); // []

        System.out.println(instVar);
        System.out.println(stringInst);
        System.out.println(list6);

    }

    static void m1(MainClass5 ref){

        System.out.println(ref.instVar);
        System.out.println(ref.list6);
        System.out.println(ref.stringInst);
        ref.m3(1,5);
        System.out.println("m1");
    }


    public static void main(String[] args) {
//
//        Set<String> set1 = new HashSet<>();
//
//        Queue<String> q1 = new PriorityQueue<>();

        System.out.println("Welcome");
        int x = 0;

        List<String> list = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();


        String str = "ABC";  // new String("ABC");
//         m1();
        System.out.println(staticVar);
        System.out.println(stringStatic);
        System.out.println(list5);  // null

        MainClass5 obj = new MainClass5();
          m1(obj);
        obj.m3(1,5);
        System.out.println(obj.instVar);
        System.out.println(obj.stringInst);
        System.out.println(obj.list6);

//        obj.m1();
        obj.m2();

        int i=0;
        for (i=0;i<10;i++){
            System.out.println(i);
            int y = 10;
        }
        System.out.println(i);

        System.out.println("*****************************");
        obj.m3(1,5);

        System.out.println(staticVar); // 10
        System.out.println(stringStatic);
        System.out.println(list5);
        obj.m3(1,5);
        staticVar = 30;
        stringStatic = "MNO";
        list5 = new ArrayList<>();
        list5.add("EEEEEEE");
        list5.add("ZZZZZZZ");
        obj.m3(1,5);


    }
}
