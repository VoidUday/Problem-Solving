package org.example.Input;

import java.util.Scanner;

public class input {
    //talking input form 2D array
    public static int[][] twoDArray(int n){
        Scanner in = new Scanner(System.in);
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        return array;
    }
    //taking input for single array
    public static int[] array(int n) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
    //printing 2D array
    public static void printArray(int[][] arr, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    //printing Single Array
    public static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
        }
    }
}
