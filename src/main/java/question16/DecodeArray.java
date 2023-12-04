package question16;

public class DecodeArray {
    /*
        {0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1} = 1234
        {-1, 0, 0, 1, 1, 0, 1} = -201
     */
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(decodeArray(a, a.length));
    }

    public static int decodeArray(int a[], int len) {
        if (len <= 1) return 0;

        int result = 0;
        int sign   = 1;

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] == 0) {
                count++;
            } else {
                result = (result * 10) + count;
                count = 0; //update
            }
        }
        if (a[0] < 0) sign = -1;

        return result * sign;
    }

//    public static int isdecodearray(int[] a) {
//        int sign = 1;
//        int zerocount = 0;
//        int product = 1;
//        int result = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0) {
//                zerocount++;
//            } else if (a[i] == 1) {
//                result *= product;
//                result += zerocount;
//                product = 10;
//                zerocount = 0;
//
//            } else if (a[0] < 0) {
//                sign = -1;
//            }
//        }
//        return result * sign;
//    }
}
