package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MathFunction object = new MathFunction();

        System.out.println("--- add() metodi --");
        object.add(5.2, 5);
        object.add(10, 2.5);
        System.out.println("------------------------------------");

        System.out.println("-- sub() metodi --");
        object.sub(15, 5f);
        object.sub(10.5, 4.3F);
        System.out.println("------------------------------------");

        System.out.println("-- multiply() metodi --");
        object.multiply(20L, 5);
        object.multiply(45.7, 9);
        System.out.println("------------------------------------");

        System.out.println("-- div() metodi --");
        object.div(28, 4.5f);
        object.div(12.6,23.7f);
        System.out.println("------------------------------------");

        System.out.println("-- abs() metodi --");
        object.abs(21);
        object.abs(6);
        System.out.println("------------------------------------");

        System.out.println("-- pow() metodi --");
        object.pow(12.5f);
        object.pow(23.5);
    }
}