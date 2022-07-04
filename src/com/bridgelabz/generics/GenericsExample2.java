package com.bridgelabz.generics;

public class GenericsExample2<E,T> {

    E x;

    T y;

    GenericsExample2(){

    }
    GenericsExample2(E x,T y){
        this.x = x;
        this.y = y;
    }

     E m1(E data){
        System.out.println(x + "------" + data);
        System.out.println(y);

        return x;
    }
}
