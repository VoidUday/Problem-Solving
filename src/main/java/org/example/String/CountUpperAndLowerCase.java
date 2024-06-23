package org.example.String;

import java.util.Scanner;

public class CountUpperAndLowerCase {
    static void countUpperLower(String s1){
        int coutUpper =0;
        int countLower =0;
        for (int i = 0; i < s1.length(); i++) {
            int x = s1.charAt(i);
            if (x >= 'A' && x<= 'Z'){
                coutUpper++;
            }
            else if(x >= 'a' && x<= 'z'){
                countLower++;
            }
        }
        System.out.println("Total no of Upper case : " + coutUpper);
        System.out.println("Total no of Lower case : " + countLower);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 = sc.nextLine();
        countUpperLower(s1);
    }

}
//Hello World
//Total no of Upper case : 2
//Total no of Lower case : 8
