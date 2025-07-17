package com.app.generics;

//Generics doesn't work with primitive types
//Generics provide type safety so avoids any class cast runtime errors

public class GenericsMain {

    public static void main(String[] args){

        IntegerPrinter integerPrinter = new IntegerPrinter(5);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(5.5);
        doublePrinter.print();

        StringPrinter stringPrinter = new StringPrinter("This is test");
        stringPrinter.print();

        Printer<Integer> integerGenericPrinter = new Printer<>(5);
        integerGenericPrinter.print();
        Printer<Double> doubleGenericPrinter = new Printer<>(5.5);
        doubleGenericPrinter.print();
        Printer<String> stringGenericPrinter = new Printer<>("This is test");
        stringGenericPrinter.print();

        AnimalPrinter<Cat> catAnimalPrinter = new AnimalPrinter<>(new Cat("Jimmy"));
        catAnimalPrinter.print();

        AnimalPrinter<Dog> dogAnimalPrinter = new AnimalPrinter<>(new Dog("Kelly"));
        dogAnimalPrinter.print();

    }
}
