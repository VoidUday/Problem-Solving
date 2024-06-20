package org.example.Arrays;

import java.util.Scanner;

public class RemovedFromPos {
    public static int[] removedAtPosition(int[] arr, int n, int pos) {
        int idx = pos - 1;
        int[] newArray = new int[n - 1];
        for (int i = 0; i <= idx - 1; i++) {
            newArray[i] = arr[i];
        }
        for (int i = idx + 1; i <= n - 1; i++) {
            newArray[i - 1] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = input.nextInt();
        System.out.println("Enter position for removing element : ");
        int position = input.nextInt();
        System.out.println("Enter the element of the array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] ans = removedAtPosition(arr, n, position);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}