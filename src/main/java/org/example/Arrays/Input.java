package org.example.Arrays;

import java.util.Scanner;

public class Input {
    //Taking input
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no element in the Array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the element of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    //print the array

    public static void printArray(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //smallest element in the array
    public static void smallElement(int[] arr, int n){
        int small=0;
        for (int i = 0; i < n; i++) {
            for (int j=i+1; j<n; j++){
                if (arr[i] < arr[j]) {
                    small = arr[i];
                    break;
                }
            }
        }
        System.out.println(small);
    }
    public static void Min(int[] arr, int n){
        int start =0;
        int end = n-1;
        int min = -1;
        while (start < end){
           if(arr[start] < arr[end]){
               min = arr[start];
           } else if (arr[end] < arr[start]) {
               min = arr[end];
           } else {
               start++;
               end--;
           }
        }
        System.out.println(min);
    }

}
