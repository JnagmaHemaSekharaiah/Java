package com.Polymorphism.Overriding.Basic;

public class SubClass extends SuperClass
{
    @Override
    public void display() //Overridding method
    {
        System.out.println("I am Subclass");
    }

    public static void main(String[] args)
    {

        SuperClass obj2;
        obj2 = new SubClass();
        obj2.display();
    }

}
