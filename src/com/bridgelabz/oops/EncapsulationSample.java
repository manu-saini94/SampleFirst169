package com.bridgelabz.oops;

public class EncapsulationSample {


    void m1(){
        Dog dog = new Dog();
    }


    public static void main(String[] args) {
        //Encapsulation
        Dog dog = new Dog();
//        System.out.println(dog.breed);
        dog.setBreed("Labrador");
        dog.setColor("Golden");
        dog.setWeight("50");
        System.out.println(dog.getBreed());
        System.out.println(dog.getColor());
        System.out.println(dog.getWeight());

    }
}
