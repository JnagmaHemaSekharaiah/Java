package com.Exceptions.UserDefineException2;

public class Student
{

    public static void fun()
    {
        try
        {
            throw new MyException();
        }
        catch (MyException obj)
        {
            System.out.println("caught");
         //   System.out.println(obj.getMessage());
        }
    }

    public static void main(String[] args)
    {
    fun();
    }
}
