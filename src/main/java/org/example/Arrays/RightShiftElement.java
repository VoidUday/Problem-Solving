package org.example.Arrays;

import java.util.Scanner;

public class RightShiftElement {
    public static int[] rightShiftElement(int[] arr, int n){
        int[] newArray = new int[n];
        for (int i= 0; i<= n-2; i++){
            newArray[i+1] = arr[i];
        }
        newArray[0] = arr[n-1];
        return newArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = input.nextInt();
        System.out.println("Enter element : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] ans = rightShiftElement(arr, n);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
