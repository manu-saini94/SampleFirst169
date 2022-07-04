package com.bridgelabz.oops;

class Parent111{

}
// final class cannot be inherited
final class ParentSample11 extends Parent111{

    // final method cannot be overridden
    final void m1(){
        System.out.println("m1 in parent");
    }
}

//class ChildSample11 extends ParentSample11{
////
////    @Override
////    void m1() {
////        System.out.println("m1 in child");
////    }
//}


public class FinalKeywordExample {

    // The value cannot be changed
    // It is mandatory to initialize
    static final int x = 0;

    final int y = 0;

    public static void main(String[] args) {

    }
}
