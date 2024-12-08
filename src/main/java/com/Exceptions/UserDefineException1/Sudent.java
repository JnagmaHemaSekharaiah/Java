package com.Exceptions.UserDefineException1;

public class Sudent
{
    public static void fun()
    {
        int a=10;
        try
        {
            if(a==10)
            {
                throw new myclass("This my exception",20);
            }
        }
        catch(myclass obj)
        {
            System.out.println(obj.getMessage());
            System.out.println(obj.getCode());
        }
    }


    public static void main(String[] args)
    {
        fun();
    }
}
