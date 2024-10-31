package com.Abstraction.Interface.JDK8feature.feature2;

public interface A
{
    int x=10;
     static void fun1()
    {
       int a=10;
       int b =20;
       System.out.println(a+b);
    }

    static void fun2(int a, int b)
    {
        System.out.println(a+b);
    }

    static void fun3()
    {
        System.out.println(x);
    }



}
