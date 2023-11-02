package question17;

public class OnionArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 19, 4, 5};
        System.out.println(isOnionArray(a, a.length));
    }
    /*
      - if j>=0 and k>=0 and j+k=length of array and j!=k then a[j]+a[k] <= 10
   */
    public static int isOnionArray(int a[], int len) {
        boolean isCorrect = false;
        for (int j = 0; j < len / 2; j++) {
            int k = len - 1 - j;
            //System.out.println("j = " + j + ", k = " + k);
            if (a[j] + a[k] <= 10) isCorrect = true;
            else isCorrect = false;
        }
        return isCorrect ? 1 : 0;
    }
}
