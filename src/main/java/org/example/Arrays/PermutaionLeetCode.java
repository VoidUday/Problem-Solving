package org.example.Arrays;

import java.util.Scanner;

public class PermutaionLeetCode {

    public static void permute(int[] nums, int n){
        int[] ans = new int[n];
        for (int i = 0; i <n; i++) {
            ans[i] = nums[nums[i]];
        }
        for (int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
             nums[i] = input.nextInt();
        }
        permute(nums, n);

    }
}
