package org.example.String;

public class Basic {
    public static void main(String[] args) {
        String s = "Hello";
        int l = s.length();
        System.out.println(l);// arr: arr.length, string : s.length()
       //arr[i] -> element at index i
       // s.charAt(i) --> print the char at i index
        System.out.println(s.charAt(0)); //--> H
        //Once a character has been set at ith index, It can't be updated
        //You can add more character
        s = s + "World"; //possible (String Concatenation)
        System.out.println(s);
        s = s + 'i'; // can also add char to string
        System.out.println(s);


    }
}
