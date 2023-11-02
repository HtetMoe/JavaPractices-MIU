package question4;

public class RepsEqual {

    public static void main(String[] args) {
        int a[] = {3, 2, 0, 5, 3};
        int n = 32053;
        System.out.println(repsEqual(a, a.length, n));
    }

    public static int repsEqual(int a[], int len, int n) {
        int num = 0;
        for (int i = 0; i < len; i++) {
            num = (num * 10) + a[i];
            System.out.println("num" + num);
        }
        return num == n ? 1 : 0;
    }
}
