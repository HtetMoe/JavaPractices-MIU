package question18;

public class SystematicallyIncreasing {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 1, 2, 3};// part 1, part 2, part 3
        System.out.println(isSystematicallyIncreasing(a));
    }

    public static int isSystematicallyIncreasing(int[] a) {
        int index = 0;
        int part  = 1;
        while (index < a.length) {
            for (int i = 1; i <= part; i++) {
                //System.out.println("i : " + i);
                if (a[index] != i) return 0;
                index++;
            }
            part++;
        }
        return 1;
    }
}