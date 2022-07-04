package com.bridgelabz.java8features;


@FunctionalInterface
interface IMathFunction<E>{
    E calculate(E x,E y);

    static <T>void calculateAndShow(T x,T y,String functionality,IMathFunction ref){
        System.out.println(functionality + " of " + x + " and "+ y + " is => "+ ref.calculate(x,y));
    }
}

// Lambda expressions minimum requirement is a functional interface.
// Lambda expression reduces the code.

// Normal interface implementation
class Sample3 implements IMathFunction{


    @Override
    public Object calculate(Object x, Object y) {
        return null;
    }
}

public class MainClass2 {

    public static void main(String[] args) {

        IMathFunction<Float> sum = (a,b) -> a+b;
        IMathFunction<Integer> prod = (a,b) -> a*b;
        IMathFunction<Integer> divide = (a,b) -> a/b;
        IMathFunction<Integer> randomLogic = (a,b) -> {
            System.out.println(a);
            System.out.println(b);
            return a*b+a/b;
        };

        IMathFunction<Integer> sumMethodReference = Integer::sum;
//
//        System.out.println("Sum => "+sum.calculate(2.7F,6.5F));
//        System.out.println("Prod "+prod.calculate(4,7));
//        System.out.println("Divide "+divide.calculate(6,2));
//        System.out.println("Random Logic "+randomLogic.calculate(8,7));
//        System.out.println("Method reference sum "+ sumMethodReference.calculate(6,9));

        IMathFunction.calculateAndShow(4.9F,7.8F,"SUM",sum);
        IMathFunction.calculateAndShow(5,8,"PROD",prod);



    }
}
