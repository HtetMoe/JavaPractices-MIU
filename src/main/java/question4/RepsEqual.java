package question4;

public class RepsEqual {

    public static void main(String[] args){
        int a[] = {0, 0 , 3, 2, 0, 5, 3};
        System.out.println(repsEqual(a, 32053));
    }

    public static int repsEqual(int[ ] a, int n) {
        int index = 0;
        double result = 0;

        // skip the leading zero
        while (a[index] == 0) {
            index++;
        }

        // result = result + contentsOfArray * 10 ^ arraySize - 1 - startingPosition/currentIndex
        for(; index < a.length; index++) {
            result = result + a[index] * Math.pow(10, a.length - 1 - index);
        }
        if (result == n) return 1;
        else return 0;
    }
}
