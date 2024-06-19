package org.example.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//Brute force solution

public class TwoSum {
    public static void TwoSumNum(int[] arr, int n){

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == 9){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
public static  void OptimizeTwoSum(int[] arr, int n){
//    Hashmap<Integer, Integer> sum = new HashMap<Integer , Integer>();
    int Target =9;
    for (int i = 0; i < n; i++) {
        if (Target - arr[i] == Target){

        }
    }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        TwoSumNum(arr, n);
    }
}
