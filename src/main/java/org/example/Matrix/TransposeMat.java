package org.example.Matrix;

import java.util.Scanner;

public class TransposeMat {
    static int[][] transposeMatrix(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               ans[i][j] = arr[j][i];
            }
            System.out.println();
        }
        return ans;
    }
    static void printArray(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        //Taking input
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int[][] rs = transposeMatrix(arr);
        printArray(rs);
    }
}
//        3
//        1 2 3
//        4 5 6
//        7 8 9
//        output
//        1 4 7
//        2 5 8
//        3 6 9