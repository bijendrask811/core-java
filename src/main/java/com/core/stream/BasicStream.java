package com.core.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStream {

    public static void main(String[] args) {

        //find min
        List<Integer> listMin = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> min= listMin.stream().min(Integer::compareTo);

        //find odd no
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list  = list.stream().filter(x -> x%2 == 0).toList();

        //convert to uppercase
        List<String> str = Arrays.asList("banana","apple","mango");
        List<String> upStr = str.stream().map(String::toUpperCase).collect(Collectors.toList());

        //find mx
        List<Integer> max = Arrays.asList(2,6,9,4,6);
        Optional<Integer> maxVal = max.stream().max(Integer::compareTo);

        //group string by their length
        List<String> grp = Arrays.asList("banana","apple","mango","kiwi","lemon","pineapple","potato","grapes");
        Map<Integer,List<String>> grpFruit = grp.stream().collect(Collectors.groupingBy(String::length));


        //check word start with character
       List<String> values = grp.stream().filter(x->x.startsWith("p")).collect(Collectors.toList());


       //find duplicate in list
        List<Integer> dupList = Arrays.asList(1,2,3,1,4,5,6,6,7,8,9);
        List<Integer> dup = dupList.stream().distinct().toList();

       //remove null value from list
        List<String> nullList = Arrays.asList("banana",null,"mango","lemon",null,"potato","grapes",null);
        List<String> nonNul = nullList.stream().filter(x->x!=null).toList();
        List<String> objNonNul = nullList.stream().filter(Objects::nonNull).toList();

        //flat a list
        List<Integer> flatList1 = Arrays.asList(1,2,3,4);
        List<Integer> flatList2 = Arrays.asList(5,6,7,8);
        List<Integer> flatList3 = Arrays.asList(9,10,11,12);
        List<Integer> flatList4 = Arrays.asList(13,14,15,16);

        List<List<Integer>> listOfL = Arrays.asList(flatList1,flatList2,flatList3,flatList4);
        List<Integer> flatList = listOfL.stream().flatMap(List::stream).toList();

        //partition by odd or even

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean ,List<Integer>> partition =  numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));
        List<Integer> odd = partition.get(true);
        List<Integer> even = partition.get(false);

        //calculate freq of element
        List<Integer> freqList = Arrays.asList(1,2,3,1,4,5,6,6,7,8,9);
        Map<Integer,Long> mapFreq  = freqList.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

        System.out.println(mapFreq);



    }



}
