package question1;

/*
    A Madhav array has the following property.
    -> a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] =

    -> The length of a Madhav array must be n*(n+1)/2 for some n.
        len = n * (n+1)/2
        len * 2 = n * (n+1)
 */

public class MadhavArray {
    public static void main(String[] args) {
        int[] inputArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        System.out.printf("isMadHavArray : " + isMadhavArray(inputArr, inputArr.length));
    }

    public static int isMadhavArray(int[] a, int len) {
        int n = 2; // distance

        //Check the length first
        boolean isCorrectLength = false;
        while (n * (n + 1) <= len * 2) {
            if (n * (n + 1) == len * 2) {
                isCorrectLength = true;
                break;
            }
            n++; //update
        }

        if (!isCorrectLength) return 0;
        System.out.println("is correct length.");


        // logic -> a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] =
        // array -> {2, 1, 1, 4, -1, -1}

        //Check for Madhav array
        int index = 1;
        n = 2; // Reset n for array traversal

        //find summation of each part
        while (index < a.length) {
            //System.out.println("n : " + n); // sum of 2,3,4,5.... numbers
            //System.out.println("start index : " + startIndex); // 1,3,6,10...

            int sum = 0;
            // Calculate the sum for the current group
            for (int i = index; i < index + n; i++) {
                sum += a[i];
            }

            System.out.println("sum = " + sum);
            if (sum != a[0]) return 0;

            //reset value
            index += n; // 1+2, 3+3 , 6+3 // for every startIndex
            n++; // number of value to sum
        }
        return 1;
    }

//    public static int isMadhavArray(int[] arr) {
//        //arr.length = n*(n+1)/2
//        int n = 2;
//
//        //check the length first
//        boolean isCorrectLength = false;
//        while (n * (n + 1) <= arr.length * 2) {
//            if (n * (n + 1) <= arr.length * 2) {
//                isCorrectLength = true;
//                break;
//            }
//        }
//        if (!isCorrectLength) return 0;
//
    //check for madHave array
    // logic -> a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] =
    // array -> {2, 1, 1, 4, -1, -1}
//
//        int num = 2; // distance
//        for (int i = 1; i < arr.length; ) { // find the start index
//
//            int sum = 0;
//            for (int j = i; j < i + num; j++) { //start position depend on i
//                sum = sum + arr[j];
//            }
//
//            if (sum != arr[0]) return 0;
//            i += num;
//            num++; //hop number
//        }
//        return 1;
//    }
}
