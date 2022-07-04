package com.bridgelabz.oops;


// Inheritence => IS-A Relationship (Eg:- Animal and Monkey) => Monkey IS-A Animal
// achieved using extends.
// Association => HAS-A Relationship. (Eg:- Car and Engine) => Car HAS-A Engine
// Composition -> Car HAS-A Engine (Strong coupling)
// Aggregation -> Car HAS-A MusicPlayer(Weak coupling)
// achieved by using objects.



class Car{

    Engine engine;
    MusicPlayer musicPlayer;

    void engineType(){
        System.out.println(engine.type);
        System.out.println(musicPlayer);
    }
}

class Engine{
int type;
int cc;

}

class MusicPlayer{

}

public class AssociationExample {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.engine);
        System.out.println(car.musicPlayer);
        car.engineType();
    }
}
