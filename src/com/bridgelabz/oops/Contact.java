package com.bridgelabz.oops;

import java.util.Scanner;

public class Contact {

    static Scanner scanner = new Scanner(System.in);
    private String name;
    private String email;
    private String city;
    private String state;

    public Contact() {
    }

    public Contact(String name, String email, String city, String state) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void editExistingContact() {

        System.out.println("Enter the name ");
        name = scanner.next();
        System.out.println("Enter the email ");
        email = scanner.next();
        System.out.println("Enter the city ");
        city = scanner.next();
        System.out.println("Enter the state ");
        state = scanner.next();

    }
}
