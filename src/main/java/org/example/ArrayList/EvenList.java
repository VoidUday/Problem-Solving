package org.example.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenList {
    public static void evenList(ArrayList <Integer> arr, int n){
        for (int i=0; i<n; i++){
            if (arr.get(i) % 2 == 0){
                System.out.println(arr.get(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList <Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(input.nextInt());
        }
        evenList(arrayList, n);
    }
}
