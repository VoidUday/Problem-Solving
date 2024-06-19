package org.example.Polymorphism.RunTimePolyMorpsm;

public class Employee {
    private String name;
    private String Address;
    private int number;

    public Employee(String name, String address, int number) {
        this.name = name;
        this.Address = address;
        this.number = number;
    }
   public void mailCheck(){
       System.out.println("Mailing a check to " + this.name + " from " + this.Address);
   }
   public String getName(){
        return name;
   }
   public String getAddress(){
        return Address;
   }
   public int getNumber(){
        return number;
   }

}
