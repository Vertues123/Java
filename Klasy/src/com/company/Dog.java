package com.company;
//klasa dog nalezy do klasy animal
public class Dog extends Animal {

    @Override
    public void speak() {
        //super.speak();
        System.out.println("woof woof");
    }
}
