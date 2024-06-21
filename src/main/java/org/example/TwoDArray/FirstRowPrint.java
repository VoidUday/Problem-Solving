package org.example.TwoDArray;

import java.util.Scanner;

public class FirstRowPrint {
    static void printFirstRow(int[][] arr, int n, int m){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]);
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
        printFirstRow(arr, n, m);
    }
}
