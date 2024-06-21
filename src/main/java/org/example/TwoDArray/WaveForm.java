package org.example.TwoDArray;

import java.util.Scanner;

public class WaveForm {
    static void waveForm(int[][] arr, int n, int m){
        for (int i = 0; i < n; i++) {
                // Odd row
                if(i % 2 != 0){
                    for (int j= m-1; j>=0; j--){
                        System.out.print(arr[i][j] + " ");
                    }

                }
                //even row
                else {
                    for (int j=0; j<m; j++){
                        System.out.print(arr[i][j] + " ");
                    }

                }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        waveForm(arr, n, m);
    }
}
//        4--> Row
//        4--> Col
//        input element
//
//        12 43 56 88
//        34 56 90 78
//        34 54 67 89
//        12 56 77 56

//        printing wave form
//         12 43 56 88 78 90 56 34 34 54 67 89 56 77 56 12