package oop.Interface;

public class Truck implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("started truck engine.");
    }

    @Override
    public void drive() {
        System.out.println("started driving truck.");
    }
}
