package com.Polymorphism.Overriding.ReturnType;

public class Two extends One
{
    @Override
   public String Display()
   {
       return "This is Two";
   }

    public static void main(String[] args)
    {
        One obj1 ;
        Two obj2 ;
        obj2 =  new Two();
        System.out.println(obj2.Display());
    }

}
