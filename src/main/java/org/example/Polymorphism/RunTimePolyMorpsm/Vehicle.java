package org.example.Polymorphism.RunTimePolyMorpsm;

public class Vehicle {
    public void showVehicleInfo(){
        System.out.println("I have Vehicle broom broom!");
    }
    static class  Car extends Vehicle {
        @Override
        public void showVehicleInfo() {
            System.out.println("I have Car broom broom!");
            super.showVehicleInfo();
        }
    }
    static class Bike extends Vehicle {
        @Override
        public void showVehicleInfo() {
            System.out.println("I have Bike broom broom!");
            super.showVehicleInfo();
        }
    }
    public static void main(String[] args) {
        Vehicle V1 = new Vehicle();
        Car C1 = new Car();
        Bike B1 = new Bike();

        V1.showVehicleInfo();
        C1.showVehicleInfo();
        B1.showVehicleInfo();
    }
}
