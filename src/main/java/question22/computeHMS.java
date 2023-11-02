package question22;

import java.util.Arrays;

public class computeHMS {
    /*
        - the number of hours, minutes and seconds
        - array has 3 elements; arr[0] is the hours,
        - arr[1] is the minutes and
        - arr[2] is the seconds

        -  3600 seconds in an hour and 60 seconds.
     */
    public static void main(String[] args) {
        int secs = 3735;
        System.out.println("result : " + Arrays.toString(computeHMS(secs)));
    }

    public static int[] computeHMS(int seconds){
        int[] result = new int[3];

        //hour
        int hr = seconds / 3600;
        result[0] =  hr;

        //remaining secs
        seconds %= 3600;
        int min = seconds / 60;
        result[1] = min;

        //remaining secs
        seconds %= 60;
        result[2] = seconds;

        return  result;
    }
}
