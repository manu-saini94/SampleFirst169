package com.bridgelabz.basics;

import java.util.Scanner;

public class Practice {

    private static void triplets(int[] arr) {

        for(int i = 0;i<arr.length-2;i++){
            for(int j = i+1;j< arr.length-1;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i]+ " , "+arr[j]+ " , "+arr[k]+ " is a triplet");
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        System.out.println("main method");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");

        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
            int z = scanner.nextInt();
            arr[i] = z;
        }
//        triplets(arr);

        System.out.println("This is developer-2 adding his newly created feature");

    }


}
