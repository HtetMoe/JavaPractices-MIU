package org.example;

public class PerfectNumber {
    /*
        - the sum of its factors, excluding itself
     */
    public static void main(String[] args) {
        System.out.println("Perfect Number : " + findPerfectNumber(1));
        //System.out.println("sum factor : " + findSumFactors(5));
    }

    public static int findPerfectNumber(int n){
        while (n != findSumFactors(n)){
            n++;
        }
        return n;
    }

    public static int findSumFactors(int n){
        int sum = 0;
        for(int i = 1; i < n; i ++){
            if(n % i == 0){
                //System.out.println("factor : " + i);
                sum += i;
            }
        }
        return sum;
    }
}
