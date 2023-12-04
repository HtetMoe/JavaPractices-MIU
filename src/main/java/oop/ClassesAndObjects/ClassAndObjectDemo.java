package oop.ClassesAndObjects;
/*
    - A class is a template for creating objects.
    - It encapsulates data (attributes) and behaviors (methods) that describe an entity.
 */
public class ClassAndObjectDemo {
    public static void main(String[] args){
        //creating object
        Car object1 = new Car("BMW", "white");
        Car object2 = new Car("Tesla", "black");

        //accessing methods
        object1.displayInfo();
        object2.displayInfo();
    }
}
