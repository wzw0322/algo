package com.wzw.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyTest {

    public static void main(String[] args) {
        /*List<Apple> Apples = Arrays.asList(new Apple(10, "green"), new Apple(20, "red"));

        Apples.sort(Comparator.comparing(Apple::getWeight));

        Apples.sort((c1, c2) -> c1.getWeight().compareTo(c2.getWeight()));*/

        testStringSplit();




    }

    public static void compare(List<Integer> list, Comparator<Integer> compare){
        list.sort(compare.reversed());
    }

    public static void testStringSplit(){
        String str = "hello";
        System.out.println(Arrays.asList(str.split("")));

        String[] array = {"hello", "world"};
        List<String[]> collect = Arrays.asList(array).stream().map(s -> s.split("")).distinct().collect(Collectors.toList());
        System.out.println(collect.toString());
        System.out.println(collect.size());

        List<String> words = Arrays.asList("hello", "world");
        List<List<String>> collect1 = words.stream().map(s -> s.split("")).map(Arrays::asList).distinct().collect(Collectors.toList());
        System.out.println("==========: "+collect1.toString());
        System.out.println("==========: "+collect1.size());

    }

    public static void testActual(){
        //(1)找出2011年发生的所有交易，并按交易额排序（从低到高）。

    }
}
