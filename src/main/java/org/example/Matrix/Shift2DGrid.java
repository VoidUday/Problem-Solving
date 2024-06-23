package org.example.Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shift2DGrid {
    public List<Integer[][]> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        List<Integer[][]> list = new ArrayList<>();
        for(int i=0; i<row; i++){
            for(int j=0; j<k; j++){
                grid[i][j] = (grid[i][j+1]);
                grid[i][col-1] = (grid[i+1][0]);
                grid[row-1][col-1] =(grid[0][0]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer[][]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
//                list.get(i).add(in.nextInt());
            }
        }
    }
}
