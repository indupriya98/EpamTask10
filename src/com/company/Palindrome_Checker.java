package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

@FunctionalInterface
interface check_palindrome{
    List<String> check_if_palindrome(List<String> list_strings);
}
class PalindromeChecker {

    public static List<String> isPalindrome(List<String> list) {
        return list.stream().filter(t-> t.equals(new StringBuilder(t).reverse().toString())).collect(Collectors.toList());
    }

}
public class Palindrome_Checker {
    public Palindrome_Checker() {
    }

    public List<String> check_if_palindromes(check_palindrome p, List<String> x) {
        return p.check_if_palindrome(x);
    }
    public static void main(String[] args) {
        Palindrome_Checker demo = new Palindrome_Checker();
        List<String> list_of_strings= new ArrayList<>();
        list_of_strings.add("college");
        list_of_strings.add("madam");
        list_of_strings.add("malayalam");
        list_of_strings.add("india");
        list_of_strings.add("stats");
        list_of_strings.add("epam");
        list_of_strings.add("task");
        List<String> res;

        res = demo.check_if_palindromes(PalindromeChecker::isPalindrome,list_of_strings);
        System.out.println(res);
    }
}
