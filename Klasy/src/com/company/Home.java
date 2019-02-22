package com.company;

public class Home {
    public static void main (String[] args)
    {
        TV nosy = new TV();
        TV sama = new TV(32, "Tmsd");
        System.out.println(sama.getName() + " " + sama.getSize());
        sama.getOnOff();
        sama.setOnOff(true);
        sama.getOnOff();

        Dog rex = new Dog();
        rex.speak();
        rex.setSize(15);
        System.out.println(rex.getSize());


    }
}
