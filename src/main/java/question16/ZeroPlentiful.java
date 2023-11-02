package question16;

public class ZeroPlentiful {
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
        System.out.println(isZeroPlentiful(a, a.length));
    }

    /*
        - at least one 0
        - every sequence of 0s is of length at least 4
        - returns the number of zero sequences
     */

    public static int isZeroPlentiful(int a[], int len) {
        int seq = 0;

        //at least one 0
        boolean found = false;
        for(int element : a){
            if(element == 0) {
                found = true;
                break;
            }
        }
        if(!found) return 0;

        int count = 0;
        //every sequence of 0s = len4
        for(int i = 0; i < len; i++){
            int current = a[i];

            if(current == 0){
                count++;
            }
            else {
                if(count >= 4) seq +=1;
                count = 0; // update for next seq
            }
        }

        //after finished for loop, zeroCount has value
        if (count >= 4) seq += 1;

        return seq;
    }
}
