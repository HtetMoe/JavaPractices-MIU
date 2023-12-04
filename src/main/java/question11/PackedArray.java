package question11;
/*
    - n appears n times
    - number are consecutive, //means not adjacent
 */
public class PackedArray {
    public static void main(String[] args) {
        int[] a = {2, 2, 1};
        System.out.println(isPacked(a));
    }

    public static int isPacked(int[] a) {
        if (a.length == 0)  return 1;

        int current = a[0];
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            //numbers are consecutive
            if (current == a[i]) {
                count++;

                int totalCount = 0;
                //check total occurrences
                for (int j = 0; j < a.length; j++) {
                    if (current == a[j]) {
                        totalCount++;
                    }
                }
                if (current != totalCount) {
                    System.out.println(current + " occurs " + totalCount + " times.");
                    return 0;
                }

            } else {
                //n occurs n times
                if (current != count) return 0;

                //reset
                current = a[i];
                count = 1;
            }
        }
        return 1;
    }
}
