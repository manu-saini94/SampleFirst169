package com.bridgelabz.basics;

public class ArraysExample {

    // Arrays are non-primitive
    // default value => null
    static int[] arr;

    public static void main(String[] args) {
        int[] arr1 = new int[20];
        String[] arr2 = new String[30];
        int[] arr3 = {1,2,3,4,5}; // inline array
        int[][] arr4 = new int[3][3];
        System.out.println("******************");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr4[i][j] = i*5 + j;
                System.out.println(arr4[i][j]);
            }
        }
        System.out.println(arr4);
        System.out.println(arr4[2]);
        System.out.println(arr4[2][2]);

        // 00 01 02
        // 10 11 12
        // 20 21 22
//        for (int i=0;i<5;i++){
//            System.out.println(arr3[i]);
//        }
//        System.out.println(arr1);

//        for (int i=0;i<=20;i++){
//            arr1[i] = i*20;
//        }
//
//        for (int i=0;i<20;i++){
//            System.out.println(arr1[i]);
//        }

    }
}
