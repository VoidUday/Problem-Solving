package org.example.Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class mostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left=0;
        int right=0;
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int area=0;
        for(int i=0; i<height.length; i++){
            for (int j = i+1; j < height.length; j++) {
                area = max(area, min(height[j], height[i]) * (j - i));
            }
        }
        System.out.println(area);
    }
}
