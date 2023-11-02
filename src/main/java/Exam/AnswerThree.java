package Exam;

public class AnswerThree {
    /*
        - An array is defined to be a 235 array if the number of elements divisible by 2 plus
        - the number of elements divisible by 3 plus
        - the number of elements divisible by 5 plus
        - the number of elements not divisible by 2, 3, or 5 is equal to the number of elements of the array.

        - len = elementsDivisibleBy2 + elementsDivisibleBy3 + elementsDivisibleBy5 + elementsNotDivisibleBy235
     */
    public static void main(String[] args) {
        int[] a = {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
        System.out.println("result : " + is235Array(a, a.length));
    }

    public static int is235Array(int a[], int len) {
        int elementsDivisibleBy2 = 0;
        int elementsDivisibleBy3 = 0;
        int elementsDivisibleBy5 = 0;
        int elementsNotDivisibleBy235 = 0;

        for (int element : a) {
            if (element % 2 == 0)
                elementsDivisibleBy2++;

            if (element % 3 == 0)
                elementsDivisibleBy3++;

            if (element % 5 == 0)
                elementsDivisibleBy5++;

            if (element % 2 != 0 && element % 3 != 0 && element % 5 != 0)
                elementsNotDivisibleBy235++;
        }
        System.out.println(elementsDivisibleBy2 + ", " + elementsDivisibleBy3 + ", " + elementsDivisibleBy5 + ", " + elementsNotDivisibleBy235);
        int sum = elementsDivisibleBy2 + elementsDivisibleBy3 + elementsDivisibleBy5 + elementsNotDivisibleBy235;
        System.out.println("sum : " + sum + ", len : " + len);

        return sum == len ? 1 : 0;
    }
}
