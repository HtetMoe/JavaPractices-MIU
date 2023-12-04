package question5;

import java.util.Arrays;

public class Henry {
    public static void main(String[] args){
        System.out.println("result : " + henry(1, 3));
    }

    //sum of the ith and jth perfect numbers
    public static int henry(int i, int j) {
        int len = i > j ? i : j;
        int[] pnList = new int[len];

        int pn = 0;
        //find k-th perfect number
        for (int k = 0; k < len; k++) {
            pn = findPerfectNumber(pn + 1);
            pnList[k] = pn;
            pn += 1; // update for the next
        }
        System.out.println("pnList : " + Arrays.toString(pnList));

        int sum = pnList[i - 1] + pnList[j - 1];
        return sum;
    }

    /*
       - A perfect number is one that is the sum of its factors, excluding itself
     */

    public static int findPerfectNumber(int n){
        while (n != findSumFactor(n)){
            n++;
        }
        return n;
    }

    public static int findSumFactor(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                //System.out.println("factor : " + i );
                sum += i;
            }
        }
        return sum;
    }
}
