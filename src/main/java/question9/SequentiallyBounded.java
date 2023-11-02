package question9;

public class SequentiallyBounded {
    /*
       - in ascending order
       - n occurs less than n times
    */
    public static void main(String[] args) {
        int[] a =  {5, 5, 5, 2, 5};
        System.out.println("result " + isSequentiallyBounded(a));
    }

    public static int isSequentiallyBounded(int[] a) {
        //ascending order
        if(!isAscending(a)) return 0;

        //n occurs less than n times
        for(int element : a) {
            int occ = findOccurrences(a, element);
            if(occ > element) return 0;
        }
        return 1;
    }

    public static boolean isAscending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int current = a[i]; int next = a[i + 1];
            if (current > next) return false;
        }
        return true;
    }

    public static int findOccurrences(int[] a, int n){
        int count = 0;
        for(int element : a){
            if(element == n) count++;
        }
        return count;
    }
}
