package com.Abstraction.Interface.Declaration;

public class Oraganzation implements EmployeeID
{
    int b=a;

    @Override
    public void display()
    {
        System.out.println("Employee ID is "+123456);
    }

    public void printa()
    {
        System.out.println("print value b="+b);
    }

    public static void main(String[] args)
    {
     Oraganzation obj = new Oraganzation();
     obj.display();
     obj.printa(); //
    }


}
