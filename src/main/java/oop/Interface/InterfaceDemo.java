package oop.Interface;

/*
    -  It contains method signatures without any method bodies.
 */
public class InterfaceDemo {
    public static void main(String[] args){
        Car car = new Car();
        Truck truck = new Truck();

        //car
        car.startEngine();
        car.drive();

        //truck
        truck.startEngine();
        truck.drive();
    }
}
