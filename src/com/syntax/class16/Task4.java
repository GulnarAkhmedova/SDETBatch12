package com.syntax.class16;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("==============TASK 4==================");
        //How would you reverse a String word by word? for example
        //        //		// input=>This is sentence i want to reverse
        //        //		// output=>sihT si ecnetnes i tnaw ot esrever
        //        //How would you check if String is palindrome or not? aba=> true
        //        //Abbc =>false
        //        //How would you swap  2 strings without a temporary variable?
StringBuilder stringBuilder=new StringBuilder("Sunday");
        System.out.println(stringBuilder.reverse());

        System.out.println("//other example//");
        String s="Sunday";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        s=str.toString();
        System.out.println(s);

        String newStr="";
        String s2= stringBuilder.toString();
        String[] strArr=s2.split(" ");
        System.out.println(Arrays.toString(strArr));






    }
}
