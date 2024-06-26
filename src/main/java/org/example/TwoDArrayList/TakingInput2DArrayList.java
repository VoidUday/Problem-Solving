package org.example.TwoDArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TakingInput2DArrayList {
    static void printArrayList(ArrayList<ArrayList<Integer>> mat){
        int row = mat.size();

        for (int i = 0; i < row; i++) {
            int col = mat.get(0).size();
            for (int j = 0; j < col; j++) {
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
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
        printArrayList(mat);
    }
}
