package org.example.Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println("Enter 2D array!");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i=0; i<3; i++){
            for (int j = 0; j <3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr2D = {
                 {1, 3, 4},
                 {2,4,2},
                 {65,3,66}
        };
        System.out.println("2D array is printed!");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
