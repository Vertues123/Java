package com.company;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.className();
        System.out.println(m.sqrt(3));
        System.out.println(m.sqrt(3.3));
    }
    public void className()
    {
        System.out.println("Main");
    }
    public int sqrt(int a)
    {
        return a*a;
    }
    public double sqrt(double a)
    {
        return a*a;
    }
}
