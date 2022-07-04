package com.bridgelabz.generics;

import com.bridgelabz.oops.AddressBook;
import com.bridgelabz.oops.Contact;

import java.util.*;

public class MainClass1 {

    public static void main(String[] args) {
//        GenericsExample2<String,Integer> obj1 = new GenericsExample2("ABCDEF",23);
//        System.out.println(obj1.m1("ABC","Bridge"));

        GenericsExample2<Contact, AddressBook> obj2 = new GenericsExample2<>(new Contact(),new AddressBook());
        System.out.println(obj2.m1(new Contact()));

        List<Integer> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<Contact> list3 = new LinkedList<>();




    }
}
