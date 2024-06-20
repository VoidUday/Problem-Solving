package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UniqueElement {
    static int uniqueElement(ArrayList<Integer> list, int n){
        for (int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if(!Objects.equals(list.get(i), list.get(j))){
                    return list.get(i);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(input.nextInt());
        }
        System.out.println(uniqueElement(arrayList, n));
    }
}
