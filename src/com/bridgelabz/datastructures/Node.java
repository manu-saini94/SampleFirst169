package com.bridgelabz.datastructures;

public class Node<K> {


   K key;

   Node<K> next; // default is null

    public Node() {
    }

    public Node(K key) {
        this.key = key;
    }
}
