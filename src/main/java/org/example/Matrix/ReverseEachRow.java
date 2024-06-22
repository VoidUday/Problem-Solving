package org.example.Matrix;

import org.example.Input.input;

public class ReverseEachRow {
    static void reverseEachRow(int[][] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] reverseWithSwap(int[][] arr, int n){
        int s= 0;
        int e= n-1;
        for (int i = 0; i < n; i++) {
            while (s < e){
                int[][] temp = new int[n][n];
                        temp[i][s] = arr[i][s];
                        arr[i][s] = arr[i][e];
                        arr[i][e] = temp[i][s];
                        s++;
                        e--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=4;
        int[][] arr= input.twoDArray(n);
        int[][] rs = reverseWithSwap(arr, n);
        input.printArray(rs,n, 4);
    }
}
//input
//        1 2 3 4
//        2 3 4 6
//        3 5 7 8
//        3 8 6 3
//output
//        4 3 2 1
//        6 4 3 2
//        8 7 5 3
//        3 6 8 3