package com.app.generics;


import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    String name;

    public Cat(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Meooowwwwwww !!!"+name);
    }

}
