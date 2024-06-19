package org.example.Pattern;

public class Question7 {
    public static void main(String[] args) {
        int n= 5;
//        for (int i = 0; i < n; i++) {
//            for (int j=0; j< n-i; j++){
//                System.out.print("* ");
//            }
//            for (int k=n-i; k<n; k++){
//                System.out.print("- ");
//            }
//            for (int k=n-i; k<n; k++){
//                System.out.print("- ");
//            }
//            for (int l = 1; l < n+1-i; l++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            for (int k=1; k<=i-1; k++){
                System.out.print("- ");
            }
            for (int k=1; k<=i-1; k++){
                System.out.print("- ");
            }
            for (int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//* * * * * * * * * *
//* * * * - - * * * *
//* * * - - - - * * *
//* * - - - - - - * *
//* - - - - - - - - *