package question2;

public class IsGuthrieSequence {
    public static void main(String[] args) {
        int a[] = { 8, 4, 2, 1};
        System.out.println(isGuthrieSequence(a));
    }

    public static int isGuthrieSequence(int[] a) {

        //end with 1
        int last = a[a.length - 1];
        if (last != 1) return 0;

        //last index is already checked
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) { // if it is even
                if (a[i] / 2 != a[i+1]) return 0;
            }
            else {
                if (a[i] * 3 + 1 != a[i+1]) return 0;
            }
        }
        return 1;
    }

}
