package org.example.TwoDArray;

import java.util.Scanner;

public class RowWise2DArray {

    static void printRowWIse(int[][] arr, int n, int m){
        int cnt=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(cnt++ + " ");
            }
            System.out.println();
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
        printRowWIse(arr, n, m);
    }
}
