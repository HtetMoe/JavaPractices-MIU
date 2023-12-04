package question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClusterCompression {
    public static void main(String[] args) {
        int[] a  = {0, 0, 0, 2, 0, 2, 0, 2, 0, 0};
        System.out.println("result : " + Arrays.toString(clusterCompression(a)));
        //System.out.println(clusterCompression(a5));
    }

    //This is teacher answer
    public static int[] clusterCompression(int[] a) {
        //no of cluster
        int numClusters = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                numClusters++;
            }
        }
        //System.out.println(numberOfCluster);

        int[] result = new int[numClusters];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                result[index] = a[i];
                index++;
            }
        }
        return result;
    }

//    public static List<Integer> clusterCompression(int[] a) {
//        List<Integer> result = new ArrayList<>();
//        result.add(a[0]); // index 0
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] != a[i-1]) {
//                result.add(a[i]);
//            }
//        }
//
//        return result;
//    }
}
