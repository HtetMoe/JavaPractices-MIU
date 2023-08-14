package question1;
/*
An array is defined to be inertial if the following conditions hold:
    a. it contains at least one odd value
    b. the maximum value in the array is even
    c. every odd value is greater than every even value that is not the maximum value.

So {11, 4, 20, 9, 2, 8} is inertial because
    a. it contains at least one odd value
    b. the maximum value in the array is 20 which is even
    c. the two odd values (11 and 9) are greater than all the
even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.

However, {12, 11, 4, 9, 2, 3, 10} is not inertial
because it fails condition (c), i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the maximum value in the array.

    //1
    -> {1, 1, 1, 1, 1, 1, 2}
    -> {2, 12, 4, 6, 8, 11}
    -> {2, 12, 12, 4, 6, 8, 11}

    //0
    -> {1}
    -> {2}
    -> {1, 2, 3, 4}
    -> {-2, -4, -6, -8, -11}
    -> {2, 3, 5, 7}
    -> {2, 4, 6, 8, 10}
 */

import java.util.*;

public class InertialArray {
    public static void main(String[] args){
        int[] inputArr = {1};
        System.out.println("isInitial : " + isInertial(inputArr,inputArr.length));
    }

    public static  int isInertial(int a[], int len){
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds  = new ArrayList<>();

        //separate evens and odds
        for(int value : a){ // value in array
            if(value % 2 == 0)
                evens.add(value);
            else
                odds.add(value);
        }

        System.out.println("Initial evens : " + evens);
        System.out.println("Initial odds : " + odds);

        //To be maxValue must be even, at least one odd
        if (evens.size() == 0 || odds.size() == 0) return 0;

        //sort
        Collections.sort(odds); //2, 4, 8, 9, 20
        Collections.sort(evens); //11

        System.out.println("Sorted evens : " + evens);
        System.out.println("Sorted odds : " + odds);

        if (evens.size() == 1){ // largest number is even
            if (evens.get(0) < odds.get(odds.size() -1))
                return 0;
            else
                return 1;

        }

        //{2, 12, 12, 4, 6, 8, 11}
        // evens -> 2, 4, 6, 8, 12, 12
        // odds  -> 11
        // odds > evens, except maxEven
        // so, here we need to remove duplicates

        //remove duplicates
        Set<Integer> uniqueEvensSet = new HashSet<>(evens);

        //convert set to list
        List<Integer> uniqueEvens = new ArrayList<>(uniqueEvensSet);

        //compare largest of evens and odds, largest number must be even.
        if (uniqueEvens.get(uniqueEvens.size() -1) < odds.get(odds.size()-1)){
            return 0;
        }

        if(uniqueEvens.get(uniqueEvens.size() - 2) > odds.get(0))
            return 0;

        return 1;
    }

}
