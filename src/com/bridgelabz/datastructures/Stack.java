package com.bridgelabz.datastructures;

public class Stack<K> {

    LinkedList<K> linkedList;

    Stack(){
        linkedList = new LinkedList<>();
    }


    public void push(K key) {
        linkedList.push(key);
    }


    public K pop() {
        return linkedList.pop();
    }

    public void print() {
        linkedList.print();
    }
}
