package org.example.String;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        //Printing one char at single line
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            int x = s1.charAt(i);
            System.out.println(x);
        }
    }
}
