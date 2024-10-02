package com.froEachLoop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoforEachLoop
{

    public static void main(String[] args)
    {

        List<Integer> nums = Arrays.asList(4,5,3,2,7,6,9);

        Consumer<Integer> con = new Consumer <Integer> () {
           public void accept(Integer n)
           {
               System.out.println(n);
           }
        };
        nums.forEach(con);


    }

}
