package org.example.TwoDArrayList;

import java.util.ArrayList;

public class TwoDArrayList {
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
        //Creating 2D arraylist
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
//      Inserting row 1 of 2d arraylist
        ArrayList<Integer> row0 = new ArrayList<>();
        row0.add(1);
        row0.add(2);
        row0.add(3);
//      Inserting row 2 of 2d arraylist
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
//      Inserting row 3 of 2d arraylist
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(2);
        row2.add(3);
//      Adding row 1,2,3 in mat(2D arraylist)
        mat.add(row0);
        mat.add(row1);
        mat.add(row2);
//      Accessing row 1 of 2D arraylist
        System.out.println(mat.get(1));
//      Accessing row mat[1][1] of 2D arraylist
        System.out.println(mat.get(1).get(1));
//      length of row
        int row = mat.size();
//      length of column
        int col = mat.get(0).size();
//      set element at specific index for Arraylist
        row2.set(1, 70); // 70 is added at 1 index of row2 [1, 70, 3]
//      set element at specific index for 2DArraylist
        mat.get(1).set(1,50); //set[i][j] = x output : [[1, 2, 3], [1, 50, 3], [1, 70, 3]]
        System.out.println(mat);
        System.out.println("calling print function");
        printArrayList(mat);
    }
}
