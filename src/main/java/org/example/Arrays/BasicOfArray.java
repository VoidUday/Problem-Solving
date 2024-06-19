package org.example.Arrays;

import java.util.Scanner;

public class BasicOfArray {
    public static void main(String[] args) {
//        Syntax
//        datatype[] variable_name = new datatype[];
//        Store Similar data at contiguous manner
//        store 5 number

        int[] roll_number = new int[5];
        System.out.println(("Enter 5 number! "));
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<=5; i++){
            arr[i] = input.nextInt();
        }
        for (int i=0; i<5; i++){
            System.out.println(arr[i]);
        }




    }
}
