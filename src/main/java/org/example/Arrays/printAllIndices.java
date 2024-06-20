package org.example.Arrays;

import java.util.Scanner;

public class printAllIndices {
//    public static boolean printAllIndex(String[] arr, int n){
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("(" + i + "," + j + ")");
//            }
//            System.out.println();
//        }
//        return false;
//    }
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c','d', 'e'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
        //output for above code is in the below
//        (0,0)(0,1)(0,2)(0,3)(0,4)
//        (1,0)(1,1)(1,2)(1,3)(1,4)
//        (2,0)(2,1)(2,2)(2,3)(2,4)
//        (3,0)(3,1)(3,2)(3,3)(3,4)
//        (4,0)(4,1)(4,2)(4,3)(4,4)
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
//        (0,0)(0,1)(0,2)(0,3)(0,4)
//             (1,1)(1,2)(1,3)(1,4)
//                  (2,2)(2,3)(2,4)
//                       (3,3)(3,4)
//                            (4,4)
    }
}
