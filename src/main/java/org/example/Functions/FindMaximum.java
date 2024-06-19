package org.example.Functions;

public class FindMaximum {
    static void max(int a, int b){
        if(a > b){
            System.out.println("A is greater");
        }
        else {
            System.out.println("B is Greater");
        }
    }
    public static void main(String[] args) {
        int a = 12;
        int b= 42;
        max(a, b);
    }
}
