package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,5,3,2,7,6,9);
//        Stream<Integer> s= nums.stream();
//        Stream<Integer> s1= s.filter(n -> n%2==0);
//        Stream<Integer> s2= s1.map(n -> n*2);

       int result= nums.stream().
               filter(n -> n%2==0).
               map(n->n*2).
               reduce(0, (c,e)-> c+e);

       // int result=  s2.reduce(0, (c,e)-> c+e);

        System.out.println("******************");
        System.out.println(result);

        //  s2.forEach(n -> System.out.println(n));
    }
}
