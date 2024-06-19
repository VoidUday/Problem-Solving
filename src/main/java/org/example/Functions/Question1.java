package org.example.Functions;

import java.util.Scanner;

public class Question1 {

    static int sumOfTwo(int n, int r){
        int sum= n + r;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r= input.nextInt();

// Normal approach(Without function) to print nCr
//        nCr = n! / r! * (n!- r!)
        int nFact = 1;
        for (int i=1; i<=n; i++){
            nFact = nFact * i;
        }
        int rFact = 1;
        for (int i = 1; i <=r ; i++) {
            rFact = rFact * i;
        }
        int nMinusR = 1;
        for (int i=1; i<= (n-r); i++){
            nMinusR = nMinusR * i;
        }
        int nCr = nFact / (rFact * nMinusR);
        System.out.println(nCr);

        //Write a function that return sum of two number
        //calling function sumOfTwo(1,4);
        /*
        1. Always write function outside any other function.
        2. Add static when caller function is static.
        3. Always write return statement
         */
        System.out.println("Sum of N and R is : " + sumOfTwo(n, r));
    }
}
