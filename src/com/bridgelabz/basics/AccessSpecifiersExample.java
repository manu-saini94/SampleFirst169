package com.bridgelabz.basics;


// Access Specifiers => public ,private ,protected ,default
public class AccessSpecifiersExample {

    int a;
    static int b;

    void m1(){
        System.out.println("m1()");
    }

    static void m2(){
        System.out.println("m2()");
    }

    private int c;
    private static int d;

    private void m3(){
        System.out.println("m3()");
    }

    private static void m4(){
        System.out.println("m4()");
    }

    public int e;
    public static int f;

    public void m5(){
        System.out.println("m5()");
    }

    public static void m6(){
        System.out.println("m6()");
    }


    protected int g;
    protected static int h;

    protected void m7(){
        System.out.println("m7()");
    }

    protected static void m8(){
        System.out.println("m8()");
    }



    public static void main(String[] args) {
        AccessSpecifiersExample obj1 = new AccessSpecifiersExample();
        System.out.println(obj1.a);
        System.out.println(b);
        obj1.m1();
        m2();

        System.out.println(obj1.c);
        System.out.println(d);
        obj1.m3();
        m4();

        System.out.println(obj1.e);
        System.out.println(f);
        obj1.m5();
        m6();

        System.out.println(obj1.g);
        System.out.println(h);
        obj1.m7();
        m8();
    }
}
