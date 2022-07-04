package com.bridgelabz.datastructures.hashtable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MainClass{

    // Java 1.1V => Legacy
    // Hashtable , Vector , Stack



    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("paranoid",1);
        hashtable.put("themselves",2);
        hashtable.put("because",5);
        hashtable.put("but",1);
        System.out.println("HT => "+hashtable);

//
//        hashtable.put(1,1);

//        hashtable.put("Paranoids",1);
        MyHashTable<String,Integer> myHashTable = new MyHashTable<>(10);
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] strSplit = str.split(" ");
        for (String s:strSplit) {
            System.out.println(s+" => "+myHashTable.getIndex(s));
        }








    }


}
