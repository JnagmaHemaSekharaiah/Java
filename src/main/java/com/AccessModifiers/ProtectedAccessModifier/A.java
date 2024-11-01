package com.AccessModifiers.ProtectedAccessModifier;

public class A
{
    int a;
    protected void dispaly(int b)
    {
        a=b;
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        A obj = new A();
        obj.dispaly(20);
    }


}
