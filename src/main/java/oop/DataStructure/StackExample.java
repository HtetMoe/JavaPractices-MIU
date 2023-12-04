package oop.DataStructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //push elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("JavaScript");

        //pop elements from the stack
        System.out.println("popping elements : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
