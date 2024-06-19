package org.example.Polymorphism.RunTimePolyMorpsm;

public class DemoOfEmpCreation {
    public static void main(String[] args) {
        Salary s = new Salary("DINA", "NAth, UP", 3, 344.87);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 787.89);
        Salary s1 = new Salary("DINA", "NAth, UP", 3, 344.87);
        Employee e1 = new Salary("John Adams", "Boston, MA", 2, 787.89);

        s.mailCheck();
        e.mailCheck();
        System.out.println();
        s1.mailCheck();
        e1.mailCheck();
    }
}
