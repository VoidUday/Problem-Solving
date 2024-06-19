package org.example.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void reverseWord(String s1){
         String[] word = s1.split(" ");
         for (int i= word.length-1; i>=0; i--){
             System.out.print(word[i] + " ");
         }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        reverseWord(s1);


    }

//    public static class Utility {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//
//        for(int i=0; i<n; i++){
//
//        }
//    }
}
