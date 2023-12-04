package oop.ClassesAndObjects;

/*
    - A class is a blueprint or template for creating objects.
    - It encapsulates data (attributes) and behaviors (methods) that describe an entity.
 */
public class Car {

    //fields or attributes
    private String type;
    private String color;

    //Constructor
    public Car(String type, String color){
        this.type  = type;
        this.color = color;
    }

    //method
    public void displayInfo(){
        System.out.println("Car type : " + type + ", color : " + color);
    }
}
