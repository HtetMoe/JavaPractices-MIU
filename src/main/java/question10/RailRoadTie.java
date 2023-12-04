package question10;
/*
    - at least one non-zero element
    - every non-zero element (has exactly) one non-zero neighbor
    - every zero element has two non-zero neighbors.
 */

public class RailRoadTie {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 3, -18, 0, 2, 2};
        int[] aa = {1, 0, 1, 0, 1}; // not solve this condition ****
        System.out.println(isRailroadTie(a));
    }

    public static int isRailroadTie(int[] a) {
        if (a.length <= 1) {
            return 0;
        }

        //1st condition
        boolean isContainNonZero = false;
        for (int element : a) {
            if (element != 0) {
                isContainNonZero = true;
                break;
            }
        }
        if (!isContainNonZero) return 0;

        //check 1st and last index
        int first = a[0];
        int last  = a[a.length - 1];
        if (first == 0 || last == 0)  return 0;

        //1st and last index is already checked
        for (int i = 1; i < a.length - 1; i++) {
            int current =  a[i];
            int pre = a[i - 1];
            int next = a[i + 1];

            if (current == 0) { //zero -> every 0 has 2 non-0 neighbor
                if(pre == 0 || next == 0) return 0;
            } else {  //non-0 -> every non-0 (has exactly one) non-0 neighbor
                if((pre != 0 && next != 0) || (pre == 0 && next == 0)) return 0;
                //teacher's answer
//                if (!(a[i - 1] == 0 || a[i + 1] == 0)) {
//                    return 0;
//                }
            }
        }
        return 1;
    }
}
