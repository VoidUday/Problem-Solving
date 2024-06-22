package org.example.Matrix;

import java.util.Scanner;

public class AddOneEachElement {
    static int[][] addOneOnEach(int[][] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                arr[i][j] = arr[i][j] + 1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        //Taking input
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int[][] result = addOneOnEach(arr, n);
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//        3--> no of row and col
//        input element
//        1 2 2
//        1 3 4
//        21 3 4
//        output :
//        2 3 3
//        2 4 5
//        22 4 5