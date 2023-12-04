package question21;

public class is235Array {
    /*
        - the number of elements divisible by 2 plus
          the number of elements divisible by 3 plus
          the number of elements divisible by 5 plus
          the number of elements not divisible by 2, 3, or 5
          is equal to the number of elements of the array

          - value/2 + value/3 + value/5 + value(not divisible by 2,3 pr 5) = len
     */
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 11};
        System.out.println("result : " + is235Array(a, a.length));
    }

    public static int is235Array(int a[], int len) {
        int elementsDivisibleBy2 = 0;
        int elementsDivisibleBy3 = 0;
        int elementsDivisibleBy5 = 0;
        int elementsNotDivisibleBy235 = 0;

        for(int element : a){
            if(element % 2 == 0) elementsDivisibleBy2++;

            else if(element % 3 == 0 ) elementsDivisibleBy3++;

            else if(element % 5 == 0) elementsDivisibleBy5++;

            else elementsNotDivisibleBy235++;
        }

        int sum = elementsDivisibleBy2 + elementsDivisibleBy3 + elementsDivisibleBy5 + elementsNotDivisibleBy235;

        System.out.println("sum : " + sum);

        return sum == len ? 1 : 0;
    }
}
