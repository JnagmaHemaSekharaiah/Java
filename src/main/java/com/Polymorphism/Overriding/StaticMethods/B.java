package com.Polymorphism.Overriding.StaticMethods;

public class B extends A
{

    public static void Display()
    {
        System.out.println("This B");
    }

    public static void main(String[] args)
    {
        A obj = new B();
        B.Display();
    }

}
