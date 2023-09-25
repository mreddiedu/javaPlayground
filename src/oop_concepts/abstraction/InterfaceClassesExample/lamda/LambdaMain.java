package oop_concepts.abstraction.InterfaceClassesExample.lamda;

public class LambdaMain {
      public static void main(String args[]) {
        LamdaGreeting greetingObject = (name) -> System.out.println("Hello, " + name + "!");
        greetingObject.greets("Eddie");

        LambdaAdd addObject = (a, b) -> a + b;
        System.out.println(addObject.add(1, 2));

        LambdaMultiply multiplyObj = (a, b) -> a * b;
        System.out.println(multiplyObj.multiply(1, 2));

        LamdaDivide divideObj = (a, b) -> a / b;
        System.out.println(divideObj.divide(6, 2));
    }


    @FunctionalInterface
    interface LamdaGreeting {
        void greets(String name);
    }

    @FunctionalInterface
    interface LambdaAdd {
        int add(int a, int b);
    }

    @FunctionalInterface
    interface LambdaMultiply {
        int multiply(int a, int b);
    }
}
