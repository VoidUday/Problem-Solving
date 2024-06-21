package org.example.TwoDArray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        //Declaration of 2D array
        int[][] arr = new int[n][m];

        //n , m are row and col
        //total no of 2d is equal to n*m i.e. 3 rw and 4 col = 12, element
        //  N (Row)              M (Col)
        // min--> 0 max-->n-1    min--> 0 max --> m-1

        //taking 2d array input from user

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        //printing 2d array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
