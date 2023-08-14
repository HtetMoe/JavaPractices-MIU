package question1;

/*
    A Madhav array has the following property.
    -> a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] =

    -> The length of a Madhav array must be n*(n+1)/2 for some n.
    arr.length = n*(n+1)/2
    arr.length * 2 = n*(n+1)

    result 1 => {2, 1, 1, 4, -1, -1}
    result 0 => {3, 1, 2, 3, 0}
 */

public class MadhavArray {
    public static void main(String[] args) {
        int[] inputArr = {2, 1, 1, 4, -1, -1};
        System.out.printf("isMadHavArray : " + isMadhavArray(inputArr));
    }

    public static int isMadhavArray(int[] arr) {
        //arr.length = n*(n+1)/2
        int n = 2;

        //check the length first
        boolean isCorrectLength = false;
        while (n * (n + 1) <= arr.length * 2) {
            if (n * (n + 1) <= arr.length * 2){
                isCorrectLength = true;
                break;
            }
        }
        if(!isCorrectLength) return 0;

        //check for madHave array
        // logic -> a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] =
        // array -> {2, 1, 1, 4, -1, -1}

        int num = 2; // distance
        for(int i = 1; i < arr.length; ){ // find the start index

            int sum = 0;
            for(int j = i; j < i + num; j++){ //start position depend on i
                sum = sum + arr[j];
            }

            if (sum != arr[0]) return 0;
            i += num;
            num++; //hop number
        }
        return 1;
    }
}
