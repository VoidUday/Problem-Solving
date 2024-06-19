package org.example.Arrays;

import java.util.Scanner;

public class SumOfArray {

    public static int maximum(int[] arr, int n){
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static int minimum(int[] arr, int n){
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < mini){
                mini = arr[i];
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Maximum : "+ maximum(arr, n));
        System.out.println("Minimum : "+ minimum(arr, n));
    }
}
