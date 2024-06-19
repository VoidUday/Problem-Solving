package org.example.OPPS;

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Abhishek");
        Employee emp2 = new Employee("Ayan");
        //employee 1

        emp1.empName("Rohan");
        emp1.empPage(23);
        emp1.empSalary(234444);
        emp1.empDesignation("Software Engineer");
        emp1.showEmployee();

        //employee2
        emp2.empName("Rohan Nanda");
        emp2.empPage(43);
        emp2.empSalary(23674444);
        emp2.empDesignation("Software Engineer");
        emp2.showEmployee();
    }
}
