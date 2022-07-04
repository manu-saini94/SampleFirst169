package com.bridgelabz.exceptions;

// Checked and Unchecked Exceptions
//                                       Throwable

//               Exception                                                    Error
// RuntimeException   IOException      Interrupted....              VMError LinkageError AssertionError...
//StackOverflow      // EOFException
// OutofMemoryError   //FileNotFoundException

// AE
// NPE
// CCE
// IndexOutofBoundException
// AIOOBE
// SIOOBE
// IllegalArgumentException
// NumberFormatException
public class MainClass {

    public static void main(String[] args) {

        try {
            int x= 10/0;
            System.out.println("main method before");
            String str = null;
            char[] charArr = str.toCharArray();
        } catch (Exception e) {
            System.out.println("catch block");
        }
        System.out.println("main method after");
    }
}
