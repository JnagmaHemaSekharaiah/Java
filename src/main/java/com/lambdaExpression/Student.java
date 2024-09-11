package com.lambdaExpression;


@FunctionalInterface
interface School
{
    void name(int x);
}


public class Student
{
    public static void main(String[] args)
    {
      School sc =(int x)->
      {
          System.out.println("School name is ...."+ x);
      };
      sc.name(5);
    }
}
