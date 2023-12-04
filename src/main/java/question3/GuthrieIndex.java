package question3;

import java.util.ArrayList;
import java.util.List;

public class GuthrieIndex {
    public static void main(String[] args){
        int n = 7;
        //System.out.println("result : "  + findGSeq(n));
        System.out.println("result : "  + guthrieIndex(n));
    }

    public static int guthrieIndex(int n) {
        if (n == 1) return 0; // number is already 1
        return findGSeq(n).size();
    }

    public static ArrayList<Integer> findGSeq(int n){
        ArrayList<Integer> gs = new ArrayList<>();

        while (n != 1){ // gs ends with 1
            if(n % 2 == 0){ // even
                n = n/2;
                gs.add(n);
            }
            else { // odd
                n = (n * 3) + 1;
                gs.add(n);
            }
        }
        return gs;
    }
}
