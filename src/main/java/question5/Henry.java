package question5;

import java.util.Arrays;

public class Henry {
    public static void main(String[] args){
        System.out.println("result : " + henry(1, 3));
        //System.out.println("sumFactor : " + findSumFactor(6));
        //System.out.println("pn : " + findPerfectNumber(1));
    }

    public static int henry(int i, int j) {
        int len = i > j ? i : j;
        int[] pnList = new int[len];

        int pn = 0;
        //find k-th perfect number
        for (int k = 0; k < len; k++) {
            pn = findPerfectNumber(pn + 1);
            pnList[k] = pn;
            pn += 1; // update
        }
        System.out.println("pnList : " + Arrays.toString(pnList));

        int sum = pnList[i - 1] + pnList[j - 1];
        return sum;
    }

    /*
       - A perfect number is one that is the sum of its factors, excluding itself
     */

    public static int findPerfectNumber(int n){
        int num = n;
        while (num != findSumFactor(num)){
            num++;
        }
        return num;
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

    // find henry
//    public static int henry(int i, int j) {
//        if (i == 0 || j == 0) return 0;
//        int size = i > j ? i : j;
//        int[] pnList = getPerfectNum(size);
//        return pnList[i-1] + pnList[j-1]; // array index starts from 0 that's why -1
//    }
//
//    public static int[] getPerfectNum(int len) {
//        int res[] = new int[len];
//
//        for (int i = 0; i < len; i++) {
//            int perfectNum = res[i == 0 ? 0 : i - 1];
//            int start = perfectNum + 1; // next number of current perfect number
//            while (getSumFactor(start) != start) {
//                start++;
//            }
//            res[i] = start;
//        }
//
//        return res;
//    }
//
//    // find sum factor
//    public static int getSumFactor(int n) {
//        int sum = 0;
//
//        for (int i=1; i < n; i++)	{
//            if (n % i == 0)	{
//                sum = sum + i;
//            }
//        }
//        return sum;
//    }

}
