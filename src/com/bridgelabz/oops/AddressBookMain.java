package com.bridgelabz.oops;

import java.util.ArrayList;

public class AddressBookMain {

    public static void main(String[] args) {

        // AddressBook
        // Contact

        AddressBook addressBook = new AddressBook();
        addressBook.addNewContact();
        addressBook.addNewContact();
        addressBook.addNewContact();



        System.out.println("Editing Contact");
        addressBook.editContact();
        System.out.println(addressBook.list);
//       AddressBook addressBook1 = new AddressBook();
//       addressBook1.addNewContact();
//        System.out.println(addressBook.list);
//       System.out.println(addressBook1.list);


    }
}
