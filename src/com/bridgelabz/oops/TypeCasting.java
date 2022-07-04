package com.bridgelabz.oops;

public class TypeCasting {

    // byte-> short -> int -> long -> float -> double
               // char  |
    public static void main(String[] args) {
        byte b= 1;
        int i = 130;
        long l = 40;
        float f = 45.7F;
        double d = 43.34334;

        int a3 = b;

        // lossy-conversion
        byte a1 = (byte) i;

        long a2 = i;
//        int a4 =(int)l;
        System.out.println(a1);

        // lossy-conversion
        int x = (int)f;
        System.out.println(x);




        // long -> 8 bytes => it will use



    }
}
