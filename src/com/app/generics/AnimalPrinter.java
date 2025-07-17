package com.app.generics;

import java.io.Serializable;

public class AnimalPrinter<T extends Animal & Serializable>{
    T thingToPrint;

    public AnimalPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.print();
    }
}
