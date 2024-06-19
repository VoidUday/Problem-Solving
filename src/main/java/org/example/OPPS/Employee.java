package org.example.OPPS;

public class Employee {
    String name;
    int age;
    double salary;
    String designation;

    public Employee(String name){
        this.name = name;
    }
    public void empName(String empName){
        name = empName;

    }
    public void empPage(int empAge){
        age = empAge;
    }
    public void empDesignation(String empDesignation){
        designation = empDesignation;
    }
    public void empSalary(int empSalary){
        salary = empSalary;
    }
    public void showEmployee(){
        System.out.println("Employee name : " + name);
        System.out.println("Employee age : " + age);
        System.out.println("Employee Designation is : " + designation);
        System.out.println("Last Package of Employee is: " + salary);
    }
}
