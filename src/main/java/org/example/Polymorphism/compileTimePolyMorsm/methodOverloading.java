package org.example.Polymorphism.compileTimePolyMorsm;


//Compile time polymorphism

public class methodOverloading {

       public  int add(int x, int y){
           return x + y;
       }
       public int add(int x, int y, int z){
           return x + y + z;
       }
       public double add(double x, int y, int z){
           return x + y + z;
       }
    public static void main(String[] args) {
        methodOverloading A1 = new methodOverloading();
        int res1 = A1.add(12, 45);
        System.out.println("Result are : " + res1);
        int res2 = A1.add(12, 45, 455);
        System.out.println("Result are : " + res2);
        double res3 = A1.add(123.03,34, 43);
        System.out.println("Result are : " + res3);
    }
}
