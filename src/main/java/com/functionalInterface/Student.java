package com.functionalInterface;


@FunctionalInterface
interface School
{
    void name();
}

//public class Parent implements School
//{
//    @Override
//    public void name()
//    {
//        System.out.println("School name....");
//    }
//}

public class Student
{
    public static void main(String[] args)
    {
        School sc =new School()
        {
            @Override
            public void name()
            {
                System.out.println("School name is ....");
            }
        };
        sc.name();
    }
}
