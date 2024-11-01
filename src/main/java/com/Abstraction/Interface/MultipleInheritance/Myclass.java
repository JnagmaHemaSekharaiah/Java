package com.Abstraction.Interface.MultipleInheritance;

public class Myclass implements B
{
    @Override
    public void showA()
    {
        System.out.println("This is mulitple inheritance of showA");
    }

    @Override
    public void showB()
    {
        System.out.println("This is mulitple inheritance of showB");
    }

    public static void main(String[] args)
    {
       Myclass obj =new Myclass();
       obj.showA();
       obj.showB();
    }


}
