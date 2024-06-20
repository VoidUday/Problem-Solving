package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //declare ArrayList

        ArrayList<Integer> l = new ArrayList <>();

        //How to add element

        l.add(34);
        l.add(56);
        l.add(456);
        l.add(56);
        l.add(456);
        //print list

        System.out.println(l);
        System.out.println(l.get(2));

        //size of the list

        int size = l.size();
        System.out.println(size);

        //add element at specific index

        l.set(2, 4411);
        System.out.println(l);

        //remove from existing place

        l.remove(2);
        System.out.println(l);

        //Sort the Arraylist

        Collections.sort(l);
        System.out.println(l);
        //getting input from Users
        int n =5;
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> Arr = new ArrayList<>();
        System.out.println("Enter list : ");
        for (int i = 0; i < n; i++) {
            Arr.add(input.nextInt());
        }
        System.out.println(Arr);

    }
}
