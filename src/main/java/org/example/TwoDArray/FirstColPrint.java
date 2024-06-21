package org.example.TwoDArray;

import java.util.Scanner;

public class FirstColPrint {
    static void printFirstCool(int[][] arr, int n, int m){
          //using double for loop
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        //we already know if row is 0 then only first col will print
        for (int j = 0; j < m; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();

        //printing first row reverse
        for (int j = m-1; j >=0; j--) {
            System.out.print(arr[0][j] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        printFirstCool(arr, n, m);
    }
}
//        4--> Row
//        4--> Col
//        12 43 56 88
//        34 56 90 78
//        34 54 67 89
//        12 56 77 56
//        output: First col
//        12 43 56 88
//        output: First col reversed
//        88 56 43 12