package com.bridgelabz.datastructures.hashtable;

import com.bridgelabz.datastructures.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable<K,V> {

    int bucketSize;
    ArrayList<MyLinkedList<K,V>> myBucketList;

    MyHashTable(){

    }

    MyHashTable(int bucketSize){
        this.bucketSize = bucketSize;
        myBucketList =  new ArrayList<>(bucketSize);
    }


    int getIndex(K key){
        System.out.println(key.hashCode());
        int index = Math.abs(key.hashCode() % bucketSize);
        return index;
    }
}
