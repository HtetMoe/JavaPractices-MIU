package question13;

public class LargestAdjacentSum {
    /*
        - sum of adjacent elements and returning the largest such sum
     */
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 2, 1, 1, 1};
        System.out.println(largestAdjacentSum(a));
    }

    public static int largestAdjacentSum(int[] a) {
        int largest = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int adjSum = a[i] + a[i + 1];
            if (adjSum > largest) largest = adjSum;
        }
        return largest;
    }
}
