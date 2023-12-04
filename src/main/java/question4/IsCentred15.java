package question4;

public class IsCentred15 {
    public static void main(String[] args) {
        int[] a = {3, 2, 10, 4, 1, 6, 9};
        System.out.println(isCentered15(a));
    }

    //This is teacher's answer
    public static int isCentered15(int[ ] a) {
        for (int i = 0; i <= a.length / 2; i++) { //outer loop
            int sum = 0;
            for (int j = i; j < a.length - i; j++) {// inner loop
                System.out.println(j);
                sum += a[j];
            }
            System.out.println("---");
            if (sum == 15) return 1;
        }
        return 0;
    }

//    public static int isCentered15(int[] a) {
//        int centerIndex = a.length /2;
//        int i = centerIndex - 1;
//        int j = centerIndex + 1;
//
//        int sum = a[centerIndex];
//        if(sum == 15) return 1;
//
//        System.out.println("c " + centerIndex); // center
//        while (i > 0 && j < a.length){
//            sum += a[i] + a[j];
//            System.out.println("i " + i); // previous
//            System.out.println("j " + j); // next
//            if(sum == 15) return 1;
//
//            //update
//            i--;
//            j++;
//        }
//        return 0;
//    }
}
