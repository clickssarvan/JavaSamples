package com.app.generics;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    String name;

    public Dog(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Woh Woh Buh Buh !!!"+name);
    }
    
}
