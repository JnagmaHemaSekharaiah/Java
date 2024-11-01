package com.Polymorphism.Overriding.Basic;

public class SubClass extends SuperClass
{
    @Override
    public SubClass display()
    {
        return new SubClass();
    }

    public static void main(String[] args)
    {
        SubClass obj1;
        SuperClass obj2;

        obj2 = new SuperClass();
        System.out.println(obj2.display());
    }

}
