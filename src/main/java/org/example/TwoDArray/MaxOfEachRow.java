package org.example.TwoDArray;

import java.util.Scanner;

public class MaxOfEachRow {
    static void maxElementEachRow(int[][] arr, int n, int m) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int current_max = arr[i][j];
                if (current_max > max) {
                    max = current_max;
                }
            }
            System.out.println(max);
            max =0;
        }
    }
            public static void main (String[]args){
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                int m = input.nextInt();
                int[][] arr = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        arr[i][j] = input.nextInt();
                    }
                }
                maxElementEachRow(arr, n, m);
            }
    }
//        4-->Row
//        4--> Col
//        input: Element
//        12 43 56 88
//        34 56 90 78
//        34 54 67 89
//        12 56 77 56
//        Max of all each row
//        88
//        90
//        89
//        77