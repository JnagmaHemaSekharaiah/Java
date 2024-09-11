package com.functionalInterface.returnType;

interface  Add
{
    int adding(int x,int y);
}

public class Calculation
{
    public static void main(String[] args)
    {
     Add obj = new Add()
     {
         @Override
         public int adding(int x,int y)
         {
          return x+y;
         }
     };
     int result =obj.adding(4,4);
     System.out.println(result);
    }
}
