package org.example.Matrix;

import java.util.Scanner;

public class SumOfTwoMatrix {
    static int[][] sumOfTwoMatrix(int[][] matrix1, int[][] matrix2, int n , int m){
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Matrix 1 : ");
        int n = input.nextInt();
        int[][] matrix1 = new int[n][n];
        System.out.println("Enter the element of matrix 1 : ");
        for(int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the size of Matrix 2 : ");
        int m = input.nextInt();
        int[][] matrix2 = new int[m][m];
        System.out.println("Enter the element of matrix 1 : ");
        for(int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                matrix2[i][j] = input.nextInt();
            }
        }
        int[][] rs = sumOfTwoMatrix(matrix1, matrix2, n, m);
        for(int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                System.out.print(rs[i][j] +" ");
            }
            System.out.println();
        }
    }
}
//        Enter the size of Matrix 1 :
//        4
//        Enter the element of matrix 1 :
//        1 3 4 5
//        1 4 6 7
//        4 5 68 7
//        23 55 78 6
//        Enter the size of Matrix 2 :
//        4
//        Enter the element of matrix 1 :
//        12 35 67 88
//        32 45 77 45
//        23 56 78 88
//        223 45 678 8
//        output :
//        13 38 71 93
//        33 49 83 52
//        27 61 146 95
//        246 100 756 14