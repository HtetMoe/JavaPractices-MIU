package question12;

public class Is121Array {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 1, 1};
        System.out.println(is121Array(a));
    }

    public static int is121Array(int a[]) {
        int leadingcount = 0;
        int endingcount = 0;

        int i = 0;
        int j = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                leadingcount++;
            } else {
                break;
            }
        }//end i

        for (j = a.length - 1; j > 0; j--) {
            if (a[j] == 1) {
                endingcount++;
            } else {
                break;
            }
        }//end j

        if (leadingcount != endingcount) return 0;

        for (int k = i; k <= j; k++) {
            if (a[k] != 2) {
                return 0;
            }
        }//end k

        return 1;
    }

}
