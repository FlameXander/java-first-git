package ru.otus.java.basic.git;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
        task2();
    }

    public static void doSomething() {
        System.out.println(1);
        System.out.println(-2);
        System.out.println(3);
    }

    public static void task2() {
        System.out.println("- - -");
        System.out.println();
        System.out.println("-   -");
        System.out.println();
        System.out.println("- - -");
        int a = 1;
        a++;
        System.out.println(a);
    }
}
