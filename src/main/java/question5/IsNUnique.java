package question5;

public class IsNUnique {
    public static void main(String[] args) {
        int a[] = {2, 7, 3, 4};
        int n = 5;
        System.out.println(isNUnique(a, n));
    }

    public static int isNUnique(int[] a, int n) {
        if (a.length < 2) return 0;

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            //System.out.println("i " + i);
            if (a[i] > n) continue; // ***

            for (int j = i + 1; j < a.length; j++) {
                //System.out.println("j " + j);
                if (a[i] + a[j] == n) count++;
            }
            System.out.println("---");
        }
        return count == 1 ? 1 : 0;
    }
}
