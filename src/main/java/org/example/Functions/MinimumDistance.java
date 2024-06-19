package org.example.Functions;

import java.util.Scanner;


public class MinimumDistance {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int up=0;
        int down =0;
        for (int i = 1; i <= destination; i++) {
            up = up+ distance[i];
        }

        return up;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(distanceBetweenBusStops(arr, 0, 3));
    }
}
