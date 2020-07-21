package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Filter_strings {
    public static List<String> count_strings(List<String> list_of_strings) {
        return list_of_strings.stream().filter(x -> (x.startsWith("a") && x.length()==3 )).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "abcd", "bbcd", "aabb", "defg", "jk","i","avb","aaaa");
        List<String> res= count_strings(strList);
        System.out.println(res);
    }

}
