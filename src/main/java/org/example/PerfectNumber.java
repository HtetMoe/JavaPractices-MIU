package org.example;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect Number : " + findPerfectNumber(1));
        //System.out.println("sum factor : " + findSumFactors(5));
    }

    public static int findPerfectNumber(int n){
        int num = n;
        while (num != findSumFactors(num)){
            num++;
        }
        return num;
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
