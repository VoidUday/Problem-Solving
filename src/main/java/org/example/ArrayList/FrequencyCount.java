package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyCount {
    public static int freqCount(ArrayList<Integer> arr, int n, int k){
        int cnt=0;
        for (int i=0; i<n; i++){
                if (arr.get(i) == k){
                    cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(input.nextInt());
        }
        System.out.println(freqCount(arrayList, n, 5));

    }
}
