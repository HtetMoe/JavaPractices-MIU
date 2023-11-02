package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    /* sort ->
    //question 1 : 10 to 30 = 6
    - prime count in a range : 10 to 30(inclusive) -> int primeCount(int start, int end)

    //question 1 :
    - isMadhavArray : length = n*(n+1)/2
    - a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...

    //question 1 : isInertial
    - at least one odd value
    - max value is even
    - every odd > every even except max value

    //question 10
    - isRailRoadTie

    //question 11
    - fullnessQuotient
    - isPacked
    - isOddHeavy

    //question 12
    - getExponent
    - is121Array
    - filterArray

    //question 13
    - largestAdjacentSum
    - checkContenatedSum
    - isSequencedArray

    //question 14
    - largestPrimeFactor
    - encodeNumber
    - matchPattern

    //question 15
    - doIntegerBasedRounding
    - isCubePowerful
    - decodeArray

    //question 16
    - isZeroPlentiful
    - isDigitIncreasing
    - decodeArray

    //question 17
    - isOnionArray
    - isPrimeHappy

    //question 18
    - isSystematicallyIncreasing
    - isFactorialPrime
    - largestDifferenceOfEvens

    //question 19
    - isHodder
    - anagram
    - closest Fibonacci

    //question 20
    - Vesuvian
    - isOneBalanced ( not got yet)
    - isFibonacci

    //question 21
    - isTriangular
    - isMercurial
    - is235Array

    //question 22
    - computeHMS
    - isMartian
    - int isPairedN(int[ ] a, int n)

     */
    public static void main(String[] args) {
        int[] a = {2, 12, 4, 6, 8, 11};
        System.out.println("result : " + isInertial(a, a.length));
    }

    public static int isInertial(int a[], int len) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int num : a) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        if (evens.size() == 0 || odds.size() == 0) return 0;

        if (odds.size() == 0) return 0;

        //sort
        Collections.sort(evens);
        Collections.sort(odds);

        if (odds.size() == 1) {
            if (odds.get(0) > evens.get(0)) {

            }

        } else {
            if (odds.get(evens.size() - 1) > evens.get(0)) {
                return 0;
            }
        }

        return 1;
    }
}
