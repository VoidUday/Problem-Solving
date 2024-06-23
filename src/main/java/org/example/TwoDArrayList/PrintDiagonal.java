package org.example.TwoDArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDiagonal {
    static void printDiagonal(ArrayList<ArrayList<Integer>> mat){
        int r = mat.size();
        int c= mat.get(0).size();
        int n = r-1;
        while (r <= n && c >=0){
            System.out.print(mat.get(r).get(c));
            r++;
            c--;
        }

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int row = Sc.nextInt();
        int col = Sc.nextInt();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> ithRow = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                ithRow.add(Sc.nextInt());
            }
            mat.add(ithRow);
        }

        printDiagonal(mat);
    }
}
