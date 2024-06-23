package org.example.String;

import java.util.Scanner;

public class ConvertUpperToLower {
    static void convertUpToLo(String s1){
        String new_S1 = "";
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            if (x >= 'A' && x<= 'Z'){
               char lowerCase = (char)(x + 32);
               new_S1 = new_S1 + lowerCase;
            }
            else{
               new_S1 = new_S1 + x;
            }
        }
        System.out.println(new_S1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        convertUpToLo(s1);
    }
}
