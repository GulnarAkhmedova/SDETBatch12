package com.syntax.class16;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Task1 {
    public static void main(String[] args) {
        //Create a String that will hold a sentence.
        // Write a program to get a new String without any space
        System.out.println("============TAKS 1==================");
   String s="I will learn java";
   String newStr=s.replaceAll(" ","");
        System.out.println(newStr);
        System.out.println();

        System.out.println("========task 2==============");

//Create a String that should be combination of letters, numbers and special characters.
// Find out how many Alphanumeric characters are there in the String.
        String s1="1234!@#$%$esdnAJFKFJ";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9]","").length());
        System.out.println();
        System.out.println("============TASK 3===================");
        //You have a String a=”Is it saturday? Is it raining?
        // Do we have a Java Class today?” How would you find out how many sentences are in that String?

String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.length());//string class method to count the number of char  in a class
        //lenght property that we can use to check the num of elements in a array
        System.out.println(a.split("[?.!]").length);


    }
}
