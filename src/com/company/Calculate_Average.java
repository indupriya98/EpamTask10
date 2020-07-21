package com.company;

import java.util.*;
import java.util.stream.*;
public class Calculate_Average{
    public static double getAverage(IntStream stream_integers){
        return stream_integers.average().getAsDouble();
    }
    public static void main(String args[]){
        //Computing average for randomly generated list of integers of size 15
        IntStream int_stream=IntStream.generate(() -> new Random().nextInt(100)).limit(15);

        double avg=getAverage(int_stream);

        System.out.println("Average of numbers is: "+avg);

        //Computing average for a given list of integers
        List<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        IntStream int_stream1=Arrays.stream(l.stream().mapToInt(i->i).toArray());

        double avg1 = getAverage(int_stream1);

        System.out.println("Average of numbers is: "+avg1);

    }
}