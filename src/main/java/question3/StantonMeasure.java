package question3;

public class StantonMeasure {
    public static void main(String[] args) {
        int a[] = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        System.out.println(stantonMeasure(a));
    }

    public static int stantonMeasure(int[] a) {
        int result = 0;

        int count1 = 0;
        for (int e : a) {
            if (e == 1) count1++;
        }

        for (int e : a) {
            if (e == count1) result++; // get stanton measure
        }
        return result;
    }
}
