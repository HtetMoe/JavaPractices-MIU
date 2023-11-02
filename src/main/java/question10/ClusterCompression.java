package question10;

import java.util.ArrayList;
import java.util.List;

public class ClusterCompression {
    public static void main(String[] args) {
        int[] a  = {0, 0, 0, 2, 0, 2, 0, 2, 0, 0};
        int[] a1 = {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4};
        int[] a2 = {18};
        int[] a3 = {-5, -5, -5, -5, -5};
        int[] a4 = {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1};
        int[] a5 = {8, 8, 6, 6, -2, -2, -2};
        System.out.println("result : " + clusterCompression(a5, a5.length));
    }

    public static List<Integer> clusterCompression(int[] a, int len) {
        List<Integer> result = new ArrayList<>();
        int num = a[0];
        for (int i = 1; i < len; i++) {
            if (num != a[i]) {
                result.add(num);
                num = a[i];
            }
        }
        result.add(num); // the last item

        return result;
    }

    //This is teacher answer
//    public static void main(String[] args) {
//        int[] a = {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4};
//        System.out.println("result : " + Arrays.toString(clusterCompression(a)));
//    }
//
//    public static int[] clusterCompression(int[] a) {
//        //no of cluster
//        int numberOfCluster = 1;
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] != a[i - 1]) {
//                numberOfCluster++;
//            }
//        }
//        System.out.println(numberOfCluster);
//        int[] result = new int[numberOfCluster];
//        int index = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (i == 0 || a[i] != a[i - 1]) {
//                result[index] = a[i];
//                index++;
//            }
//        }
//        return result;
//    }
}
