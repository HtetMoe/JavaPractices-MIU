package question4;

public class IsCentred15 {
    public static void main(String[] args){
        int a[] = {3, 2, 10, 5, 6, 9};
        System.out.println(isCentered15(a));
    }
    public static int isCentered15(int[] a) {
        for (int out = 0; out <= a.length / 2; out++) {
            int sum = 0;
            for (int inner = out; inner < a.length - out; inner++) {
                sum = sum + a[inner];
            }
            if (sum == 15) return 1;
        }
        return 0;
    }
}
