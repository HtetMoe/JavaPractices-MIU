package org.example;

public class FindMiddleElement {
    public static void main(String[] args) {
        //int[] a = {1, 2, 3, 0, 5, 0, 3, 2, 1};
        int[] a = {1, 2, 3, 0, 5, 5, 0, 3, 2, 1};
        int len = a.length;

        if (len % 2 == 0) {
            int index = len/2;
            System.out.println("2 mid elements : " + a[index] + ", " + a[index - 1]);
        } else {
            System.out.println("mid element : " + a[len / 2]);
        }
    }
}
