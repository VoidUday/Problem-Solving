package org.example.Arrays;

import java.util.Scanner;

public class SumIsEqualToX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        two pointer approach
//        10 20 30 40 50 80    x = 80
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == 80){
                    System.out.println(i + " " + j + " = " + 80);
                } else if (arr[i] + arr[j] < 80) {
                    i++;
                }
                else {
                    j--;
                }
            }
        }

    }
}
