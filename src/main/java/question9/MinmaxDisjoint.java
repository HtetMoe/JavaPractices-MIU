package question9;

public class MinmaxDisjoint {
    /*
       a. The minimum and maximum values of the array are not equal.
       b. The minimum and maximum values of the array are not adjacent to one another.
       c. The minimum value occurs exactly once in the array.
       d. The maximum value occurs exactly once in the array.

        */
    public static void main(String[] args) {
        int[] a = {1, 2};
        System.out.println("result : " + isMinMaxDisjoint(a));
    }

    public static int isMinMaxDisjoint(int[] a) {
        if (a == null || a.length < 3) {
            return 0;
        }

        //find min and max value
        int minvalue = a[0];
        int maxvalue = a[0];

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            if (current < minvalue) {
                minvalue = a[i];
                minIndex = i;
            } else if (current > maxvalue) {
                maxvalue = a[i];
                maxIndex = i;
            }
        }

        if (minvalue == maxvalue)  return 0;

        //not adj
        if (Math.abs(maxIndex - minIndex) == 1)  return 0;

        //occur exactly once in the array
        int maxcount = 0;
        int mincount = 0;
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            if (current == maxvalue)  maxcount++;
            if (current == minvalue)  mincount++;
        }
        if (maxcount > 1 || mincount > 1) return 0;
        return 1;
    }
}
