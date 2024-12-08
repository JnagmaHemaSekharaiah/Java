package com.Exceptions.UserDefineException1;

public class myclass extends Exception
{
     private int code;
     public myclass(String s, int code)
     {
     super(s);
     this.code=code;
     }

    public int getCode()
    {
        return code;
    }

}
