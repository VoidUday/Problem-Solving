package org.example.Pattern;

public class Question2 {
    public static void main(String[] args) {
        int n=4,i;
        for ( i = 1; i <= n; i++) {
            for (int j=0; j<=n-i; j++){
                System.out.print("* ");
            }
            for (int k=1; k<=i-1; k++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}

//* * * *
//* * * -
//* * - -
//* - - -