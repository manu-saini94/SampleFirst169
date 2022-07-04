package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);

    //Collection
    static int x;

    ArrayList<Contact> list = new ArrayList();

    public void addNewContact() {
        System.out.println("Enter the name ");
        String name = scanner.next();
        System.out.println("Enter the email ");
        String email = scanner.next();
        System.out.println("Enter the city ");
        String city = scanner.next();
        System.out.println("Enter the state ");
        String state = scanner.next();
        Contact contact = new Contact(name,email,city,state);
        list.add(contact);


    }

    public void editContact(){
        System.out.println("Enter the name ");
        String name = scanner.next();

        for (Contact contact:list) {
            if(contact.getName().equals(name)){
               contact.editExistingContact();
            }
        }

    }
}
