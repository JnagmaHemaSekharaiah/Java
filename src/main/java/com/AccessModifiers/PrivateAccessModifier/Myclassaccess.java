package com.AccessModifiers.PrivateAccessModifier;

 class Myclassaccess
{
    private int a;
    private int b;
    Myclassaccess obj;
    public void display()
    {
        System.out.println("a->"+a);
    }

    public static void main(String[] args)
    {
     Myclassaccess obj = new Myclassaccess();
     obj.a=10;
     obj.display();
    }
}
