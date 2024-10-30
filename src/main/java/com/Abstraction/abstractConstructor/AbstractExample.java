package com.Abstraction.abstractConstructor;

abstract class Car
{

    Car()
    {
        System.out.println("I am Car...");
    }

    abstract void engine();
    public void wheels()
    {
        System.out.println("Car wheels are rotating");
    }

}

public class AbstractExample
{

    public static void main(String[] args)
    {
       Car objcar = new Safari();
       objcar.engine();
    }

}
