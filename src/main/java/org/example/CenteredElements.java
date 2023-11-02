package org.example;

public class CenteredElements {
    public static void main(String[] args) {
        int[] a = {3, 2, 10, 5, 6, 9, 0};
        findCenteredElements(a, a.length);
    }
    public static void findCenteredElements(int[] a, int len){
        for(int i = 0; i <= len/2; i++){
            for(int j = i; j < a.length - i; j++){
                System.out.println("index : " + j);
            }
            System.out.println("---");
        }
    }
}
