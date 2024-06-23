package org.example.TwoDArrayList;

import java.util.ArrayList;

public class FilteredEvenElement {
    static ArrayList<ArrayList<Integer>> filerEvenList(ArrayList<ArrayList<Integer>> mat) {
        int row = mat.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            int col = mat.get(0).size();
            ArrayList <Integer> ithEvenList = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                if(mat.get(i).get(j) % 2 == 0){
                    ithEvenList.add(mat.get(i).get(j));
                }
            }
            ans.add(ithEvenList);
        }
        return ans;
    }
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
        ArrayList<ArrayList<Integer>> result = filerEvenList(mat);
        printArrayList(result);
    }
}
