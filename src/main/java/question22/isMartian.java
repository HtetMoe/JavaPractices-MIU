package question22;

public class isMartian {
    /*
        - the number of 1s is greater than the number of 2s
        - and no two adjacent elements are equal

        count1s > count2s
        notSameAdj

     */
    public static void main(String[] args) {
        int[] a= {1, 3};
        int[] a1 = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        int[] a2 = {1, 3, 2};
        int[] a3 = {1, 3, 2, 2, 1, 5, 1, 5};
        int[] a4 = {1, 2, -18, -18, 1, 2};
        int[] a5 = {};
        int[] a6 = {1};
        int[] a7 = {2};

        System.out.println("result : " + isMartian(a7));
    }

    public static int isMartian(int[] a) {
        int count1 = 0;
        int count2 = 0;

        for(int i = 0 ; i < a.length - 1; i ++){
            if(a[i] == a[i+1]) return 0; // has same adj
        }

        for(int value : a){
            if(value == 1) count1++;
            if(value == 2) count2++;
        }

        return count1 > count2 ? 1 : 0;
    }
}
