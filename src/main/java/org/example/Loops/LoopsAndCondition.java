package org.example.Loops;

public class LoopsAndCondition {
    public static void main(String[] args){
//For Loop
//        for ( initialization; condition; increment/Decrement){
//            body/statement
//        }
//*Note : Use for loop when you know how many times you have to run

        for (int i=0; i<=5; i++){
            System.out.println(i + " " + "Printed!");
        }

//while loop
//        while (condition){
//            //body
//        }
//*Note : Use while loop when you don't know how many times you have to run

        int num=1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }

//do-while Loop
//        do(condition){
//
//        }
//        while(condition);
//Note : - do while run 1 time either condition is true or false


    }
}
