package com.mangesh.streams;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class CoreCountOFMachie {
    public static void disp(){

    }

    public static void main(String[] args) {

        ForkJoinPool cores= ForkJoinPool.commonPool();
        System.out.println(cores.getParallelism());

        System.out.println("------Sequential streams----");
        Arrays.asList("Mangesh","raja","sam","sharad","dilip","mark").stream().forEach(System.out :: println);
        System.out.println("------parallel streams----");
        Arrays.asList("Mangesh","raja","sam","sharad","dilip","mark").parallelStream().forEach(System.out :: println);

        Stream stram=Stream.of("Mangesh","raja","sam","sharad","dilip","mark").parallel() ;






    }
}
