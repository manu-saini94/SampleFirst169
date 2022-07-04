package com.bridgelabz.datastructures;

public class LinkedList<K> {



    Node<K> head;
    Node<K> tail;

    public void push(K key) {
        Node<K> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void print() {
       Node<K> temp = head;
       while(temp!=null){
           System.out.print(temp.key+"->");
           temp = temp.next;
       }
    }


    public void add(K key) {
        Node<K> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }


    public K pop() {
        K poppedData = head.key;
        head = head.next;
        return poppedData;
    }

    public K popLast() {
        Node<K> temp = head;
        Node<K> secondLastNode = null;
        while (temp.next != null) {
            secondLastNode = temp;
            temp = temp.next;
        }
        secondLastNode.next = null;
        K poppedData = temp.key;
        tail = secondLastNode;
        return poppedData;
    }

    public Node<K> search(K key) {
        Node<K> temp = head;
        Node<K> searchedNode = null;
        while(temp!=null){
            if(temp.key.equals(key)) {
                searchedNode = temp;
                break;
            }
            temp = temp.next;
        }
        return searchedNode;
    }


    public void insertAfter(K insertData, K searchData) {
        Node<K> newNode = new Node<>(insertData);
        Node<K> searchedNode = search(searchData);
        newNode.next = searchedNode.next;
        searchedNode.next = newNode;
    }



}
