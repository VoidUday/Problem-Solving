package org.example.Matrix;

import java.util.Scanner;

public class LocalMaximum {
    static int[][] findLocalMax(int[][] arr, int n){
        int maxlocalLength = n-2;
        int[][] maxlocal = new int[maxlocalLength][maxlocalLength];

        for (int i=0; i<maxlocalLength; i++){
            for (int j=0; j<maxlocalLength; j++){
                maxlocal[i][j] = findmax(arr, i, j);
            }
        }
        return maxlocal;
    }
    static int findmax(int[][] arr, int x, int y){
        int maxElement = 0;
        for (int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
               if(arr[i][j] > maxElement){
                   maxElement = arr[i][j];
               }
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] grid = new int[n][n];
        //Taking input
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                grid[i][j] = input.nextInt();
            }
        }
        int[][] result = findLocalMax(grid, n);
        for (int[] ints : result) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}
