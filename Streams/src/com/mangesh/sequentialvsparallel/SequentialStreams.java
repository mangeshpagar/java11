package com.mangesh.sequentialvsparallel;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.stream.IntStream;

public class SequentialStreams{

        public static void main(String[] args) {
            System.out.println("Thread NAme:"+ Thread.currentThread().getName());
        System.out.println(isPrime(6));
        LocalTime t1,t2;
        t1 = LocalTime.now();
        IntStream.rangeClosed(1,500000).filter(SequentialStreams::isPrime).forEach(System.out :: println);
        t2 = LocalTime.now();
        System.out.println("Time taken for execution in seconds : "+t1.until(t2, ChronoUnit.SECONDS));//35 seconds

    }
    public static boolean isPrime(int number){
        System.out.println("Thread NAme:"+ Thread.currentThread().getName());
        if (number <=1) return false;
        return !IntStream.rangeClosed(2,number/2).filter(n -> number%n == 0).findAny().isPresent();
    }

}

