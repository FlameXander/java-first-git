package ru.otus.java.basic.git;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
        task2();
    }

    public static void doSomething() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
    }

    public static void task2() {
        System.out.println("- - -");
        System.out.println();
        System.out.println("-   -");
        System.out.println();
        System.out.println("- - -");
        int a = 3;
        int b = 3;
        a++;
        b += a;
        System.out.println(a + b);
    }

    public static void homework1() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
}
