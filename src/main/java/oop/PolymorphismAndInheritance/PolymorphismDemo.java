package oop.PolymorphismAndInheritance;

public class PolymorphismDemo {
    public static void main(String[] args){
        //======= Static ==========
        Calculator calculator = new Calculator();

        int result1 = calculator.add(1, 1);
        System.out.println("result1 : " + result1);

        double result2 = calculator.add(1.1 , 1.1);
        System.out.println("result2 : " + result2);

        //======= Dynamic ==========
        Dog dog = new Dog();
        dog.sound();
    }
}
