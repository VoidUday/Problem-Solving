package org.example.Arrays;

import java.util.Scanner;

public class InsertAtIndexP {
    public static int[] insertArrayAtPosition(int[] arr, int n, int pos, int x){
        int idx = pos-1;
        int[] newArray = new int[n+1];
        //old array element that not affect while inserting new element.
        for (int i = 0; i<=idx - 1; i++){
            newArray[i] = arr[i];
        }
        //make space for idx and insert the old element
        for (int i= idx; i<=n-1; i++){
            newArray[i+1] = arr[i];
        }
        //insert the x at pos
        newArray[idx] = x;
        return newArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = input.nextInt();
        System.out.println("Enter position for inserting element : ");
        int position = input.nextInt();
        System.out.println("Enter the element for inserting at position : ");
        int x= input.nextInt();
        System.out.println("ENter the element of the array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int ans[] = insertArrayAtPosition(arr, n, position, x);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
