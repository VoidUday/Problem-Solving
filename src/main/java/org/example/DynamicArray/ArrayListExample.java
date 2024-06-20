package org.example.DynamicArray;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList <>();
        //How to add element
        l.add(34);
        l.add(56);
        l.add(456);
        //print list
        System.out.println(l);
        System.out.println(l.get(2));
        int size = l.size();
        System.out.println(size);

    }
}
